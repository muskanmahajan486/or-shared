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

public class Device extends InventoryObject {

    public enum Status {
        UNINITIALIZED,
        INITIALIZING,
        ONLINE,
        OFFLINE,
        REMOVING,
        REMOVED,
        INITIALIZATION_ERROR,
        COMMUNICATION_ERROR,
        MAINTENANCE
    }

    protected Status status = Status.UNINITIALIZED;

    protected Device parent;

    protected Device() {
    }

    public Device(String label, String id, String type) {
        this(label, id, type, null);
    }

    public Device(String label, String id, String type, Device parent) {
        super(label, id, type);
        this.parent = parent;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Device getParent() {
        return parent;
    }

    public void setParent(Device parent) {
        this.parent = parent;
    }
}
