/*
 * Copyright 2015, OpenRemote Inc.
 *
 * See the CONTRIBUTORS.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

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
