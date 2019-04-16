package io.rancher.type.cronjob;

import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.CronJobConfigConcurrencyPolicyEnum;
import io.rancher.type.kubernetes.job.JobConfig;

public class CronJobConfig extends AbstractType {
    
    private CronJobConfigConcurrencyPolicyEnum concurrencyPolicy;
    
    private Integer failedJobsHistoryLimit;
    
    private Map<String, Object> jobAnnotations;
    
    private JobConfig jobConfig;
    
    private Map<String, Object> jobLabels;
    
    private String schedule;
    
    private Integer startingDeadlineSeconds;
    
    private Integer successfulJobsHistoryLimit;
    
    private Boolean suspend;
    
    public CronJobConfigConcurrencyPolicyEnum getConcurrencyPolicy() {
        return this.concurrencyPolicy;
    }

    public void setConcurrencyPolicy(CronJobConfigConcurrencyPolicyEnum concurrencyPolicy) {
      this.concurrencyPolicy = concurrencyPolicy;
    }
    
    public Integer getFailedJobsHistoryLimit() {
        return this.failedJobsHistoryLimit;
    }

    public void setFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
      this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    }
    
    public Map<String, Object> getJobAnnotations() {
        return this.jobAnnotations;
    }

    public void setJobAnnotations(Map<String, Object> jobAnnotations) {
      this.jobAnnotations = jobAnnotations;
    }
    
    public JobConfig getJobConfig() {
        return this.jobConfig;
    }

    public void setJobConfig(JobConfig jobConfig) {
      this.jobConfig = jobConfig;
    }
    
    public Map<String, Object> getJobLabels() {
        return this.jobLabels;
    }

    public void setJobLabels(Map<String, Object> jobLabels) {
      this.jobLabels = jobLabels;
    }
    
    public String getSchedule() {
        return this.schedule;
    }

    public void setSchedule(String schedule) {
      this.schedule = schedule;
    }
    
    public Integer getStartingDeadlineSeconds() {
        return this.startingDeadlineSeconds;
    }

    public void setStartingDeadlineSeconds(Integer startingDeadlineSeconds) {
      this.startingDeadlineSeconds = startingDeadlineSeconds;
    }
    
    public Integer getSuccessfulJobsHistoryLimit() {
        return this.successfulJobsHistoryLimit;
    }

    public void setSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
      this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    }
    
    public Boolean getSuspend() {
        return this.suspend;
    }

    public void setSuspend(Boolean suspend) {
      this.suspend = suspend;
    }
    
}
