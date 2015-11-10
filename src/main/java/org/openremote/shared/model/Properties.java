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

package org.openremote.shared.model;

import java.util.HashMap;
import java.util.Map;

public class Properties {

    public static Map<String, Object> create() {
        return new HashMap<>();
    }

    public static Map<String, Object> create(Map<String, Object> properties, String key) {
        Map<String, Object> newProperties = new HashMap<>();
        properties.put(key, newProperties);
        return newProperties;
    }

    public static String get(Map<String, Object> properties, String key) {
        return get(properties, PropertyDescriptor.TYPE_STRING, key);
    }

    public static <T> T get(Map<String, Object> properties, PropertyDescriptor<T> descriptor, String key) {
        return properties != null && properties.containsKey(key) ? descriptor.read(properties.get(key)) : null;
    }

    public static boolean isTrue(Map<String, Object> properties, String key) {
        return isTrue(properties, PropertyDescriptor.TYPE_BOOLEAN, key);
    }

    public static boolean isTrue(Map<String, Object> properties, PropertyDescriptor<Boolean> descriptor, String key) {
        Boolean result = get(properties, descriptor, key);
        return result != null && result;
    }

    public static boolean isSet(Map<String, Object> properties, String key) {
        return properties != null && properties.containsKey(key);
    }

    public static Map<String, Object> getProperties(Map<String, Object> properties, String key) {
        if (!containsProperties(properties, key))
            return null;
        //noinspection unchecked
        return (Map<String, Object>) properties.get(key);
    }

    public static boolean containsProperties(Map<String, Object> properties, String key) {
        return properties.containsKey(key) && properties.get(key) instanceof Map;
    }

}
