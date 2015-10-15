package org.openremote.shared.flow;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.model.Identifier;

@JsType
public class FlowDependency extends FlowObject {

    public Flow flow; // Optional, only in fully materialized dependency tree
    public int level;
    public boolean wired; // Super-dependencies might be only users are have actual wires (hard dependency)
    public boolean peersInvalid; // Wired super-dependencies might have broken wires if we are missing consumers/producers peers

    protected FlowDependency() {
    }

    public FlowDependency(String label, Identifier identifier) {
        super(label, identifier);
    }

    public FlowDependency(String label, Identifier identifier, int level, boolean wired, boolean peersInvalid) {
        this(label, identifier, null, level);
        this.wired = wired;
        this.peersInvalid = peersInvalid;
    }

    public FlowDependency(String label, Identifier identifier, Flow flow, int level) {
        super(label, identifier);
        this.flow = flow;
        this.level = level;
    }

    @Override
    public String getDefaultedLabel() {
        return isLabelEmpty() ? "Unnamed Flow" : getLabel();
    }

    public Flow getFlow() {
        return flow;
    }

    public void setFlow(Flow flow) {
        this.flow = flow;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isWired() {
        return wired;
    }

    public boolean isPeersInvalid() {
        return peersInvalid;
    }
}
