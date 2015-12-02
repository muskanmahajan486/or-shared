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
import org.openremote.shared.util.StringArrayConverter;

import javax.persistence.*;
import java.util.Arrays;

@JsType
@Entity
@Table(name = "DEVICE")
public class Device extends InventoryObject {

    @JsType
    public enum Status {
        UNINITIALIZED,
        READY,
        OFFLINE,
        ONLINE,
        COMMUNICATION_ERROR,
        MAINTENANCE
    }

    @Column(name = "DEVICE_STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    public Status status = Status.UNINITIALIZED;

    @Column(name = "SENSOR_ENDPOINTS", nullable = true, length = 32768)
    @Convert(converter = StringArrayConverter.class)
    public String[] sensorEndpoints;

    @Column(name = "ACTUATOR_ENDPOINTS", nullable = true, length = 32768)
    @Convert(converter = StringArrayConverter.class)
    public String[] actuatorEndpoints;

    @JsIgnore
    protected Device() {
    }

    @JsIgnore
    public Device(String label, String id, String type) {
        super(label, id, type);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String[] getSensorEndpoints() {
        return sensorEndpoints;
    }

    public void setSensorEndpoints(String[] sensorEndpoints) {
        this.sensorEndpoints = sensorEndpoints;
    }

    public String[] getActuatorEndpoints() {
        return actuatorEndpoints;
    }

    public void setActuatorEndpoints(String[] actuatorEndpoints) {
        this.actuatorEndpoints = actuatorEndpoints;
    }

    @Override
    public String toString() {
        return "Device{" +
            "status=" + status +
            ", sensorEndpoints=" + Arrays.toString(sensorEndpoints) +
            ", actuatorEndpoints=" + Arrays.toString(actuatorEndpoints) +
            "} " + super.toString();
    }
}
