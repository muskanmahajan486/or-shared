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
import org.openremote.shared.flow.Slot;

import java.util.Map;

@JsType
public class Message extends Event {

    public String slotId;
    public String instanceId;
    @JsIgnore
    public Map<String, Object> headers;
    public String body;

    @JsIgnore
    public Message() {
    }

    @JsIgnore
    public Message(Slot slot, String body) {
        this(slot.getId(), null, body, null);
    }

    @JsIgnore
    public Message(Slot slot, String instanceId, String body) {
        this(slot.getId(), instanceId, body, null);
    }

    @JsIgnore
    public Message(String slotId, String instanceId, String body, Map<String, Object> headers) {
        this.slotId = slotId;
        this.instanceId = instanceId;
        this.body = body;
        this.headers = headers;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @JsIgnore
    public Map<String, Object> getHeaders() {
        return headers;
    }

    @JsIgnore
    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    public boolean hasHeaders() {
        return getHeaders() != null;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "MessageEvent{" +
            "slotId='" + slotId + '\'' +
            ", instanceId='" + instanceId + '\'' +
            ", headers=" + headers +
            ", body='" + body + '\'' +
            '}';
    }
}
