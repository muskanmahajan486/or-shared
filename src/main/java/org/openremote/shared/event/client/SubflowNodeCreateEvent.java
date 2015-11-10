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

package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.FlowEvent;
import org.openremote.shared.flow.Flow;

@JsType
public class SubflowNodeCreateEvent extends FlowEvent {

    public String subflowId;
    public double positionX;
    public double positionY;
    public boolean applyPositionAsProperties;

    @JsIgnore
    public SubflowNodeCreateEvent() {
    }

    @JsIgnore
    public SubflowNodeCreateEvent(Flow flow, String subflowId, double positionX, double positionY) {
        this(flow, subflowId, positionX, positionY, false);
    }

    @JsIgnore
    public SubflowNodeCreateEvent(Flow flow, String subflowId, double positionX, double positionY, boolean applyPositionAsProperties) {
        super(flow);
        this.subflowId = subflowId;
        this.positionX = positionX;
        this.positionY = positionY;
        this.applyPositionAsProperties = applyPositionAsProperties;
    }

    public String getSubflowId() {
        return subflowId;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public boolean isApplyPositionAsProperties() {
        return applyPositionAsProperties;
    }
}
