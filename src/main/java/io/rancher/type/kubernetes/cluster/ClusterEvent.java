package io.rancher.type.kubernetes.cluster;

import io.rancher.base.AbstractType;
import io.rancher.type.EventSeries;
import io.rancher.type.EventSource;
import io.rancher.type.MicroTime;
import io.rancher.type.ObjectReference;
import io.rancher.type.OwnerReference;

import java.util.List;
import java.util.Map;

public class ClusterEvent extends AbstractType {
    
    private String action;
    
    private Map<String, Object> annotations;
    
    private String clusterId;
    
    private Integer count;
    
    private String created;
    
    private String creatorId;
    
    private MicroTime eventTime;
    
    private String eventType;
    
    private String firstTimestamp;
    
    private ObjectReference involvedObject;
    
    private Map<String, Object> labels;
    
    private String lastTimestamp;
    
    private String message;
    
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String reason;
    
    private ObjectReference related;
    
    private String removed;
    
    private String reportingComponent;
    
    private String reportingInstance;
    
    private EventSeries series;
    
    private EventSource source;
    
    private String uuid;
    
    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
      this.action = action;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
      this.count = count;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public MicroTime getEventTime() {
        return this.eventTime;
    }

    public void setEventTime(MicroTime eventTime) {
      this.eventTime = eventTime;
    }
    
    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
      this.eventType = eventType;
    }
    
    public String getFirstTimestamp() {
        return this.firstTimestamp;
    }

    public void setFirstTimestamp(String firstTimestamp) {
      this.firstTimestamp = firstTimestamp;
    }
    
    public ObjectReference getInvolvedObject() {
        return this.involvedObject;
    }

    public void setInvolvedObject(ObjectReference involvedObject) {
      this.involvedObject = involvedObject;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLastTimestamp() {
        return this.lastTimestamp;
    }

    public void setLastTimestamp(String lastTimestamp) {
      this.lastTimestamp = lastTimestamp;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
      this.reason = reason;
    }
    
    public ObjectReference getRelated() {
        return this.related;
    }

    public void setRelated(ObjectReference related) {
      this.related = related;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getReportingComponent() {
        return this.reportingComponent;
    }

    public void setReportingComponent(String reportingComponent) {
      this.reportingComponent = reportingComponent;
    }
    
    public String getReportingInstance() {
        return this.reportingInstance;
    }

    public void setReportingInstance(String reportingInstance) {
      this.reportingInstance = reportingInstance;
    }
    
    public EventSeries getSeries() {
        return this.series;
    }

    public void setSeries(EventSeries series) {
      this.series = series;
    }
    
    public EventSource getSource() {
        return this.source;
    }

    public void setSource(EventSource source) {
      this.source = source;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
