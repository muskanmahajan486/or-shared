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

import org.openremote.shared.model.Identifiable;
import org.openremote.shared.model.Property;

import java.util.*;

public class InventoryObject extends Identifiable {

    public String label;

    public Map<String, Property> properties = new LinkedHashMap<>();

    protected InventoryObject() {
    }

    public InventoryObject(String label, String id, String type) {
        super(id, type);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Map<String, Property> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "InventoryObject{" +
            "label='" + getLabel() + '\'' +
            ", id=" + getId() +
            ", properties=" + getProperties() +
            '}';
    }
}
