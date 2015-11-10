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

import com.fasterxml.jackson.annotation.JsonTypeName;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.flow.Flow;
import org.openremote.shared.flow.Node;

@JsType
public class FlowDeploymentFailureEvent extends FlowIdEvent {

    public FlowDeploymentPhase phase;
    public String exceptionType;
    public String message;
    public Node node;
    public Node[] unprocessedNodes;

    @JsIgnore
    protected FlowDeploymentFailureEvent() {
    }

    @JsIgnore
    public FlowDeploymentFailureEvent(String flowId) {
        super(flowId);
    }

    @JsIgnore
    public FlowDeploymentFailureEvent(String flowId, FlowDeploymentPhase phase) {
        super(flowId);
        this.phase = phase;
    }

    @JsIgnore
    public FlowDeploymentFailureEvent(Flow flow, FlowDeploymentPhase phase, String exceptionType, String message, Node node, Node[] unprocessedNodes) {
        super(flow.getId());
        this.phase = phase;
        this.exceptionType = exceptionType;
        this.message = message;
        this.node = node;
        this.unprocessedNodes = unprocessedNodes;
    }

    public FlowDeploymentPhase getPhase() {
        return phase;
    }

    public void setPhase(FlowDeploymentPhase phase) {
        this.phase = phase;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Node[] getUnprocessedNodes() {
        return unprocessedNodes;
    }
}
