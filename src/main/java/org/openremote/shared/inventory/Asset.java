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

public class Asset extends InventoryObject {

    protected Device[] devices;

    protected Asset[] children;

    protected Asset() {
    }

    public Asset(String label, String id, String type, Asset... children) {
        this(label, id, type, new Device[0], children);
    }

    public Asset(String label, String id, String type, Device[] devices, Asset... children) {
        super(label, id, type);
        this.children = children;
        this.devices = devices;
    }

    public Device[] getDevices() {
        return devices;
    }

    public Asset[] getChildren() {
        return children;
    }
}
