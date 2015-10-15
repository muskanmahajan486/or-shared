package org.openremote.shared.event.bus;

import org.openremote.shared.event.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Simple static/singleton observer/observable implementation.
 */
public final class EventBus {

    final static protected List<EventRegistration> REGISTRATIONS = new ArrayList<>();

    synchronized static public void addAll(List<EventRegistration> registrations) {
        REGISTRATIONS.addAll(registrations);
    }

    synchronized static public void add(EventRegistration registration) {
        REGISTRATIONS.add(registration);
    }

    synchronized static public void removeAll(List<EventRegistration> registrations) {
        REGISTRATIONS.removeAll(registrations);
    }

    synchronized static public void remove(EventRegistration registration) {
        REGISTRATIONS.remove(registration);
    }

    @SuppressWarnings("unchecked")
    synchronized static public void dispatch(Event event, EventRegistration... skipRegistrations) {
        boolean vetoed = false;
        List<EventRegistration> skips = skipRegistrations != null ? Arrays.asList(skipRegistrations) : Collections.EMPTY_LIST;
        for (EventRegistration registration : REGISTRATIONS) {
            if (skips.contains(registration))
                continue;

            if (!registration.isMatching(event) || !registration.isPrepare())
                continue;
            try {
                registration.getListener().on(event);
            } catch (VetoEventException ex) {
                vetoed = true;
                break;
            }
        }
        if (!vetoed) {
            for (EventRegistration registration : REGISTRATIONS) {
                if (skips.contains(registration))
                    continue;
                if (!registration.isMatching(event) || registration.isPrepare())
                    continue;
                registration.getListener().on(event);
            }
        }
    }

}
