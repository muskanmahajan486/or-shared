package org.openremote.shared.flow;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gwt.core.client.js.JsType;
import jsinterop.annotations.JsIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsType
@IdClass(org.openremote.shared.flow.Wire.Id.class)
@Entity
@Table(name = "WIRE")
public class Wire {

    public static class Id implements Serializable {

        public String sourceId;
        public String sinkId;
        public String flowId;

        public Id() {
        }

        public Id(String sourceId, String sinkId) {
            this.sourceId = sourceId;
            this.sinkId = sinkId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Id id = (Id) o;

            if (sourceId != null ? !sourceId.equals(id.sourceId) : id.sourceId != null) return false;
            if (sinkId != null ? !sinkId.equals(id.sinkId) : id.sinkId != null) return false;
            return !(flowId != null ? !flowId.equals(id.flowId) : id.flowId != null);

        }

        @Override
        public int hashCode() {
            int result = sourceId != null ? sourceId.hashCode() : 0;
            result = 31 * result + (sinkId != null ? sinkId.hashCode() : 0);
            result = 31 * result + (flowId != null ? flowId.hashCode() : 0);
            return result;
        }
    }

    @javax.persistence.Id
    @NotNull
    @Column(name = "SOURCE_NODE_ID")
    public String sourceId;

    @javax.persistence.Id
    @NotNull
    @Column(name = "SINK_NODE_ID")
    public String sinkId;

    @javax.persistence.Id
    @NotNull
    @Column(name = "FLOW_ID")
    @JsIgnore
    @JsonIgnore
    public String flowId;

    protected Wire() {
    }

    public Wire(Slot source, Slot sink) {
        this(source.getId(), sink.getId());
    }

    public Wire(String sourceId, String sinkId) {
        this.sourceId = sourceId;
        this.sinkId = sinkId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getSinkId() {
        return sinkId;
    }

    public boolean equalsSlots(Slot sourceSlot, Slot sinkSlot) {
        return !(sourceSlot == null || sinkSlot == null)
            && equalsSlotIds(sourceSlot.getId(), sinkSlot.getId());
    }

    public boolean equalsSlotIds(String sourceId, String sinkId) {
        return getSourceId().equals(sourceId) && getSinkId().equals(sinkId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wire wire = (Wire) o;

        if (sourceId != null ? !sourceId.equals(wire.sourceId) : wire.sourceId != null) return false;
        return !(sinkId != null ? !sinkId.equals(wire.sinkId) : wire.sinkId != null);
    }

    @Override
    public int hashCode() {
        int result = sourceId != null ? sourceId.hashCode() : 0;
        result = 31 * result + (sinkId != null ? sinkId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Wire{" +
            "sourceId='" + sourceId + '\'' +
            ", sinkId='" + sinkId + '\'' +
            '}';
    }
}