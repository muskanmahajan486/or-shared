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

package org.openremote.shared.event;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.flow.Flow;

@JsType
public abstract class FlowIdEvent extends Event {

    public String flowId;

    @JsIgnore
    protected FlowIdEvent() {
    }

    @JsIgnore
    public FlowIdEvent(String flowId) {
        this.flowId = flowId;
    }

    public String getFlowId() {
        return flowId;
    }

    public boolean matches(Flow other) {
        return other != null && other.getId().equals(getFlowId());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
            "flowId='" + flowId + '\'' +
            '}';
    }
}
