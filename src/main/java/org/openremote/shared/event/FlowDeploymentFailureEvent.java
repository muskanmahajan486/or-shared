package org.openremote.shared.event;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.flow.Flow;
import org.openremote.shared.flow.Node;

@JsType
public class FlowDeploymentFailureEvent extends FlowIdEvent {

    public FlowDeploymentPhase phase;
    public String exceptionType;
    public String message;
    public Node node;
    public Node[] unprocessedNodes;

    protected FlowDeploymentFailureEvent() {
    }

    public FlowDeploymentFailureEvent(String flowId) {
        super(flowId);
    }

    public FlowDeploymentFailureEvent(String flowId, FlowDeploymentPhase phase) {
        super(flowId);
        this.phase = phase;
    }

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
