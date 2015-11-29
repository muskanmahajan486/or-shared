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

package org.openremote.shared.inventory;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class Adapter extends InventoryObject {

    public String discoveryEndpoint;

    @JsIgnore
    protected Adapter() {
    }

    @JsIgnore
    public Adapter(String label, String id, String type) {
        super(label, id, type);
    }

    @JsIgnore
    public Adapter(String label, String id, String type, String discoveryEndpoint) {
        super(label, id, type);
        this.label = label;
        this.discoveryEndpoint = discoveryEndpoint;
    }

    public String getDiscoveryEndpoint() {
        return discoveryEndpoint;
    }

    public void setDiscoveryEndpoint(String discoveryEndpoint) {
        this.discoveryEndpoint = discoveryEndpoint;
    }

    @Override
    public String toString() {
        return "Adapter{" +
            "discoveryEndpoint='" + discoveryEndpoint + '\'' +
            "} " + super.toString();
    }
}
