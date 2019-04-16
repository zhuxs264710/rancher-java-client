package io.rancher;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

import io.rancher.RancherClient.Config;
import io.rancher.service.kubernetes.ServiceService;
import io.rancher.service.kubernetes.cluster.ClusterService;
import io.rancher.service.kubernetes.cluster.namespaces.NamespaceService;
import io.rancher.service.kubernetes.cluster.node.NodeService;
import io.rancher.service.kubernetes.configmap.ConfigMapService;
import io.rancher.service.kubernetes.daemonset.DaemonSetService;
import io.rancher.service.kubernetes.deployment.DeploymentService;
import io.rancher.service.kubernetes.ingress.IngressService;
import io.rancher.service.kubernetes.pod.PodService;
import io.rancher.service.kubernetes.replicaset.ReplicaSetService;
import io.rancher.service.kubernetes.secret.SecretService;
import io.rancher.service.kubernetes.statefulset.StatefulSetService;
import io.rancher.service.project.ProjectService;
import io.rancher.service.project.workload.WorkloadService;
import io.rancher.type.kubernetes.Service;
import io.rancher.type.kubernetes.cluster.Cluster;
import io.rancher.type.kubernetes.cluster.namespaces.Namespace;
import io.rancher.type.kubernetes.cluster.node.Node;
import io.rancher.type.kubernetes.configmap.ConfigMap;
import io.rancher.type.kubernetes.daemonset.DaemonSet;
import io.rancher.type.kubernetes.deployment.Deployment;
import io.rancher.type.kubernetes.ingress.Ingress;
import io.rancher.type.kubernetes.pod.Pod;
import io.rancher.type.kubernetes.replicaset.ReplicaSet;
import io.rancher.type.kubernetes.secret.Secret;
import io.rancher.type.kubernetes.statefulset.StatefulSet;
import io.rancher.type.project.Project;
import io.rancher.type.project.workload.Workload;

public class RancherUtils {

	static ConcurrentHashMap<String, RancherUtils> RANCHERSMAP = new ConcurrentHashMap<>();
	private RancherClient client;
	private static final Logger logger = Logger.getLogger(RancherUtils.class);
//	private Object service;
//
//	public Object getService() {
//		return service;
//	}
//
//	public void setService(Object service) {
//		this.service = service;
//	}

	public RancherClient getClient() {
		return client;
	}

	public void setClient(RancherClient client) {
		this.client = client;
	}

	public String info() {
		if (client != null)
			return "apis:" + client.getUrl();
		return null;
	}

	public String apiAddress() {
		if (client != null)
			return client.getUrl();
		return null;
	}

	private RancherUtils(RancherClient client) {
		this.client = client;
	}

	public void deleteRancherUtils(Config config) {
		if (config == null||!config.verify()) {
			logger.error("rancher connection config error!");
			return;
		}
		if (RANCHERSMAP.containsKey(config.getUrl().toString())) {
			RANCHERSMAP.remove(config.getUrl().toString());
		}
		RANCHERSMAP.remove(config.md5Key());
	}

	public static RancherUtils buildUtils(Config config) {
		if (config == null||!config.verify()) {
			logger.error("rancher connection config error!");
			return null;
		}
		String key = config.md5Key();
		if(RANCHERSMAP.containsKey(key))
			return RANCHERSMAP.get(key);
		
		RancherClient rancherClient = new RancherClient(config);
//		Call<TypeCollection<Object>> type = rancherClient.type(service);
		
		return new RancherUtils(rancherClient);

	}
	
	public List<Node> listNode(String clusterId) throws IOException{
		logger.info("list  node in cluster :"+clusterId);
		NodeService nodeService = client.type(NodeService.class);
		List<Node> nodeList = nodeService.list(clusterId).execute().body().getData();
		return nodeList;
		
	}
	
	public List<Cluster> listCluster() throws IOException{
		logger.info("list clusters!");
		ClusterService clusterService = client.type(ClusterService.class);
		List<Cluster> list = clusterService.list().execute().body().getData();
		return list;
	}
	
	public void createCluster(Cluster cluster) throws IOException{
		ClusterService clusterService = client.type(ClusterService.class);
		if(clusterService.create(cluster).execute().isSuccess()){
			logger.info("create cluster successfully!");			
		}
		else
			logger.error("create cluster failed!");
	}
	
	public List<Project> listProject() throws IOException{
		ProjectService projectService = client.type(ProjectService.class);
		List<Project> list = projectService.list().execute().body().getData();
		return list;
	}
	
	public void createProject(Project project) throws IOException{
		ProjectService projectService = client.type(ProjectService.class);
		if(projectService.create(project).execute().isSuccess()){
			logger.info("create project successfully!");
		}else
			logger.error("create project failed!");
	}
	
	public List<Project> listProjectByClusterId(String clusterId) throws IOException{
		ProjectService projectService = client.type(ProjectService.class);
		List<Project> list = projectService.listByClusterId(clusterId).execute().body().getData();
		return list;
	}
	
	public List<Pod> listPod(String projectid) throws IOException{
		PodService podService = client.type(PodService.class);
		List<Pod> list = podService.list(projectid).execute().body().getData();
		return list;
	}
	
	public void createPod(String projectId,Pod pod) throws IOException{
		PodService podService = client.type(PodService.class);
		if(podService.create(projectId, pod).execute().isSuccess()){
			logger.info("create pod successfully!");
		}else
			logger.error("create pod failed!");
	}
	
	public List<Workload> listWorkload(String projectId) throws IOException{
		WorkloadService workloadService = client.type(WorkloadService.class);
		List<Workload> list = workloadService.list(projectId).execute().body().getData();
		return list;
	}
	
	public void createWorkload(String projectId,Workload workload) throws IOException{
		WorkloadService workloadService = client.type(WorkloadService.class);
		if(workloadService.create(projectId, workload).execute().isSuccess())
			logger.info("create workload successfully!");
		else
			logger.error("create workload failed!");
	}
	
	public List<Ingress> listIngress(String projectId) throws IOException{
		IngressService ingressService = client.type(IngressService.class);
		List<Ingress> list = ingressService.list(projectId).execute().body().getData();
		return list;
	}
	
	public void createIngress(String projectId,Ingress ingress) throws IOException{
		IngressService ingressService = client.type(IngressService.class);
		if(ingressService.create(projectId, ingress).execute().isSuccess())
			logger.info("create ingress successfully!");
		else
			logger.error("create ingress failed!");
	}
	
	public List<ConfigMap> listConfigMap(String projectId) throws IOException{
		ConfigMapService configMapService = client.type(ConfigMapService.class);
		List<ConfigMap> list = configMapService.list(projectId).execute().body().getData();
		return list;
	}
	
	public void createConfigMap(String projectId,ConfigMap configMap) throws IOException{
		ConfigMapService configMapService = client.type(ConfigMapService.class);
		if(configMapService.create(projectId, configMap).execute().isSuccess())
			logger.info("create ConfigMap successfully!");
		else
			logger.error("create ConfigMap failed!");
	}
	
	public List<Deployment> listDeployment(String projectId) throws IOException{
		DeploymentService deploymentService = client.type(DeploymentService.class);
		List<Deployment> list = deploymentService.list(projectId).execute().body().getData();
		return list;
		
	}
	
	public void createDeployment(String projectId,Deployment deployment) throws IOException{
		DeploymentService deploymentService = client.type(DeploymentService.class);
		if(deploymentService.create(projectId, deployment).execute().isSuccess())
			logger.info("create Deployment successfully!");
		else
			logger.error("create Deployment failed!");
	}
	
	public List<DaemonSet> listDaemonSet(String projectId) throws IOException{
		DaemonSetService daemonSetService = client.type(DaemonSetService.class);
		List<DaemonSet> list = daemonSetService.list(projectId).execute().body().getData();
		return list;
		
	}
	
	public void createDaemonSet(String projectId,DaemonSet daemonSet) throws IOException{
		DaemonSetService daemonSetService = client.type(DaemonSetService.class);
		if(daemonSetService.create(projectId, daemonSet).execute().isSuccess())
			logger.info("create DaemonSet successfully!");
		else
			logger.error("create DaemonSet failed!");
	}
	
	public List<ReplicaSet> listReplicaSet(String projectId) throws IOException{
		ReplicaSetService replicaSetService = client.type(ReplicaSetService.class);
		List<ReplicaSet> list = replicaSetService.list(projectId).execute().body().getData();
		return list;
		
	}
	
	public void createReplicaSet(String projectId,ReplicaSet data) throws IOException{
		ReplicaSetService replicaSetService = client.type(ReplicaSetService.class);
		if(replicaSetService.create(projectId, data).execute().isSuccess())
			logger.info("create ReplicaSet successfully!");
		else
			logger.error("create ReplicaSet failed!");
	}
	
	public List<StatefulSet> listStatefulSet(String projectId) throws IOException{
		StatefulSetService statefulSetService = client.type(StatefulSetService.class);
		List<StatefulSet> list = statefulSetService.list(projectId).execute().body().getData();
		return list;
		
	}
	
	public void createStatefulSet(String projectId,StatefulSet data) throws IOException{
		StatefulSetService statefulSetService = client.type(StatefulSetService.class);
		if(statefulSetService.create(projectId, data).execute().isSuccess())
			logger.info("create StatefulSet successfully!");
		else
			logger.error("create StatefulSet failed!");
	}
	
	public List<Namespace> listNamespace(String clusterId) throws IOException{
		NamespaceService namespaceService = client.type(NamespaceService.class);
		List<Namespace> list = namespaceService.list(clusterId).execute().body().getData();
		return list;
	}
	
	public void createNamespace(String clusterId,Namespace data) throws IOException{
		NamespaceService namespaceService = client.type(NamespaceService.class);
		if(namespaceService.create(clusterId, data).execute().isSuccess())
			logger.info("create namespace successfully!");
		else
			logger.error("create namespace failed!");
	}
	
	public List<Service> listService(String clusterId) throws IOException{
		ServiceService serviceService = client.type(ServiceService.class);
		List<Service> list = serviceService.list(clusterId).execute().body().getData();
		return list;
	}
	
	public void createService(String projectId,Service data) throws IOException{
		ServiceService serviceService = client.type(ServiceService.class);
		if(serviceService.create(projectId, data).execute().isSuccess())
			logger.info("create service successfully!");
		else
			logger.error("create service failed!");
	}
	
	public List<Secret> listSecret(String clusterId) throws IOException{
		SecretService secretService = client.type(SecretService.class);
		List<Secret> list = secretService.list(clusterId).execute().body().getData();
		return list;
	}
	
	public void createSecret(String projectId,Secret data) throws IOException{
		SecretService secretService = client.type(SecretService.class);
		if(secretService.create(projectId, data).execute().isSuccess())
			logger.info("create service successfully!");
		else
			logger.error("create service failed!");
	}

	
	
	
	

}
