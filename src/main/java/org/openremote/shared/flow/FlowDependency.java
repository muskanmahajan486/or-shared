package org.openremote.shared.flow;

import com.google.gwt.core.client.js.JsType;

@JsType
public class FlowDependency extends FlowObject {

    public Flow flow; // Optional, only in fully materialized dependency tree
    public int level;
    public boolean wired; // Super-dependencies might be only using this flow or have actual wires (hard dependency)
    public boolean peersInvalid; // Wired super-dependencies might have broken wires if we are missing consumers/producers peers

    protected FlowDependency() {
    }

    public FlowDependency(String label, String id, String type) {
        super(label, id, type);
    }

    public FlowDependency(String label, String id, String type, int level, boolean wired, boolean peersInvalid) {
        this(label, id, type, null, level);
        this.wired = wired;
        this.peersInvalid = peersInvalid;
    }

    public FlowDependency(String label, String id, String type, Flow flow, int level) {
        super(label, id, type);
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
