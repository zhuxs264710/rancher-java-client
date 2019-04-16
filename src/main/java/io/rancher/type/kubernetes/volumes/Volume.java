package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;
import io.rancher.type.QuobyteVolumeSource;
import io.rancher.type.kubernetes.configmap.ConfigMapVolumeSource;
import io.rancher.type.project.ProjectedVolumeSource;

public class Volume extends AbstractType {
    
    private AwsElasticBlockStoreVolumeSource awsElasticBlockStore;
    
    private AzureDiskVolumeSource azureDisk;
    
    private AzureFileVolumeSource azureFile;
    
    private CephFSVolumeSource cephfs;
    
    private CinderVolumeSource cinder;
    
    private ConfigMapVolumeSource configMap;
    
    private DownwardAPIVolumeSource downwardAPI;
    
    private EmptyDirVolumeSource emptyDir;
    
    private FcVolumeSource fc;
    
    private FlexVolumeSource flexVolume;
    
    private FlockerVolumeSource flocker;
    
    private GcePersistentDiskVolumeSource gcePersistentDisk;
    
    private GitRepoVolumeSource gitRepo;
    
    private GlusterfsVolumeSource glusterfs;
    
    private HostPathVolumeSource hostPath;
    
    private IscsiVolumeSource iscsi;
    
    private String name;
    
    private NfsVolumeSource nfs;
    
    private PersistentVolumeClaimVolumeSource persistentVolumeClaim;
    
    private PhotonPersistentDiskVolumeSource photonPersistentDisk;
    
    private PortworxVolumeSource portworxVolume;
    
    private ProjectedVolumeSource projected;
    
    private QuobyteVolumeSource quobyte;
    
    private RbdVolumeSource rbd;
    
    private ScaleIOVolumeSource scaleIO;
    
    private SecretVolumeSource secret;
    
    private StorageOSVolumeSource storageos;
    
    private VsphereVirtualDiskVolumeSource vsphereVolume;
    
    public AwsElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
        return this.awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(AwsElasticBlockStoreVolumeSource awsElasticBlockStore) {
      this.awsElasticBlockStore = awsElasticBlockStore;
    }
    
    public AzureDiskVolumeSource getAzureDisk() {
        return this.azureDisk;
    }

    public void setAzureDisk(AzureDiskVolumeSource azureDisk) {
      this.azureDisk = azureDisk;
    }
    
    public AzureFileVolumeSource getAzureFile() {
        return this.azureFile;
    }

    public void setAzureFile(AzureFileVolumeSource azureFile) {
      this.azureFile = azureFile;
    }
    
    public CephFSVolumeSource getCephfs() {
        return this.cephfs;
    }

    public void setCephfs(CephFSVolumeSource cephfs) {
      this.cephfs = cephfs;
    }
    
    public CinderVolumeSource getCinder() {
        return this.cinder;
    }

    public void setCinder(CinderVolumeSource cinder) {
      this.cinder = cinder;
    }
    
    public ConfigMapVolumeSource getConfigMap() {
        return this.configMap;
    }

    public void setConfigMap(ConfigMapVolumeSource configMap) {
      this.configMap = configMap;
    }
    
    public DownwardAPIVolumeSource getDownwardAPI() {
        return this.downwardAPI;
    }

    public void setDownwardAPI(DownwardAPIVolumeSource downwardAPI) {
      this.downwardAPI = downwardAPI;
    }
    
    public EmptyDirVolumeSource getEmptyDir() {
        return this.emptyDir;
    }

    public void setEmptyDir(EmptyDirVolumeSource emptyDir) {
      this.emptyDir = emptyDir;
    }
    
    public FcVolumeSource getFc() {
        return this.fc;
    }

    public void setFc(FcVolumeSource fc) {
      this.fc = fc;
    }
    
    public FlexVolumeSource getFlexVolume() {
        return this.flexVolume;
    }

    public void setFlexVolume(FlexVolumeSource flexVolume) {
      this.flexVolume = flexVolume;
    }
    
    public FlockerVolumeSource getFlocker() {
        return this.flocker;
    }

    public void setFlocker(FlockerVolumeSource flocker) {
      this.flocker = flocker;
    }
    
    public GcePersistentDiskVolumeSource getGcePersistentDisk() {
        return this.gcePersistentDisk;
    }

    public void setGcePersistentDisk(GcePersistentDiskVolumeSource gcePersistentDisk) {
      this.gcePersistentDisk = gcePersistentDisk;
    }
    
    public GitRepoVolumeSource getGitRepo() {
        return this.gitRepo;
    }

    public void setGitRepo(GitRepoVolumeSource gitRepo) {
      this.gitRepo = gitRepo;
    }
    
    public GlusterfsVolumeSource getGlusterfs() {
        return this.glusterfs;
    }

    public void setGlusterfs(GlusterfsVolumeSource glusterfs) {
      this.glusterfs = glusterfs;
    }
    
    public HostPathVolumeSource getHostPath() {
        return this.hostPath;
    }

    public void setHostPath(HostPathVolumeSource hostPath) {
      this.hostPath = hostPath;
    }
    
    public IscsiVolumeSource getIscsi() {
        return this.iscsi;
    }

    public void setIscsi(IscsiVolumeSource iscsi) {
      this.iscsi = iscsi;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public NfsVolumeSource getNfs() {
        return this.nfs;
    }

    public void setNfs(NfsVolumeSource nfs) {
      this.nfs = nfs;
    }
    
    public PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
        return this.persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
      this.persistentVolumeClaim = persistentVolumeClaim;
    }
    
    public PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
        return this.photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk) {
      this.photonPersistentDisk = photonPersistentDisk;
    }
    
    public PortworxVolumeSource getPortworxVolume() {
        return this.portworxVolume;
    }

    public void setPortworxVolume(PortworxVolumeSource portworxVolume) {
      this.portworxVolume = portworxVolume;
    }
    
    public ProjectedVolumeSource getProjected() {
        return this.projected;
    }

    public void setProjected(ProjectedVolumeSource projected) {
      this.projected = projected;
    }
    
    public QuobyteVolumeSource getQuobyte() {
        return this.quobyte;
    }

    public void setQuobyte(QuobyteVolumeSource quobyte) {
      this.quobyte = quobyte;
    }
    
    public RbdVolumeSource getRbd() {
        return this.rbd;
    }

    public void setRbd(RbdVolumeSource rbd) {
      this.rbd = rbd;
    }
    
    public ScaleIOVolumeSource getScaleIO() {
        return this.scaleIO;
    }

    public void setScaleIO(ScaleIOVolumeSource scaleIO) {
      this.scaleIO = scaleIO;
    }
    
    public SecretVolumeSource getSecret() {
        return this.secret;
    }

    public void setSecret(SecretVolumeSource secret) {
      this.secret = secret;
    }
    
    public StorageOSVolumeSource getStorageos() {
        return this.storageos;
    }

    public void setStorageos(StorageOSVolumeSource storageos) {
      this.storageos = storageos;
    }
    
    public VsphereVirtualDiskVolumeSource getVsphereVolume() {
        return this.vsphereVolume;
    }

    public void setVsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume) {
      this.vsphereVolume = vsphereVolume;
    }
    
}
