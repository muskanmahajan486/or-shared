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
import org.openremote.shared.model.Identifiable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsType
@MappedSuperclass
public class InventoryObject extends Identifiable {

    @NotNull
    @Size(min = 3, max = 1023)
    @Column(name = "LABEL")
    public String label;

    @Column(name = "ITEM_PROPERTIES", nullable = true, length = 1048576) // TODO 1MB?
    public String properties;

    @JsIgnore
    protected InventoryObject() {
    }

    @JsIgnore
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

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
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
