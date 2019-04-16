package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.type.kubernetes.KubeAPIService;
import io.rancher.type.kubernetes.KubeControllerService;
import io.rancher.type.kubernetes.KubeletService;
import io.rancher.type.kubernetes.KubeproxyService;

public class RkeConfigServices extends AbstractType {
    
    private EtcdService etcd;
    
    private KubeAPIService kubeApi;
    
    private KubeControllerService kubeController;
    
    private KubeletService kubelet;
    
    private KubeproxyService kubeproxy;
    
    private SchedulerService scheduler;
    
    public EtcdService getEtcd() {
        return this.etcd;
    }

    public void setEtcd(EtcdService etcd) {
      this.etcd = etcd;
    }
    
    public KubeAPIService getKubeApi() {
        return this.kubeApi;
    }

    public void setKubeApi(KubeAPIService kubeApi) {
      this.kubeApi = kubeApi;
    }
    
    public KubeControllerService getKubeController() {
        return this.kubeController;
    }

    public void setKubeController(KubeControllerService kubeController) {
      this.kubeController = kubeController;
    }
    
    public KubeletService getKubelet() {
        return this.kubelet;
    }

    public void setKubelet(KubeletService kubelet) {
      this.kubelet = kubelet;
    }
    
    public KubeproxyService getKubeproxy() {
        return this.kubeproxy;
    }

    public void setKubeproxy(KubeproxyService kubeproxy) {
      this.kubeproxy = kubeproxy;
    }
    
    public SchedulerService getScheduler() {
        return this.scheduler;
    }

    public void setScheduler(SchedulerService scheduler) {
      this.scheduler = scheduler;
    }
    
}
