package io.rancher.type.kubernetes.volumes.persistentvolume;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.PersistentVolumeTransitioningEnum;
import io.rancher.type.ObjectReference;
import io.rancher.type.OwnerReference;
import io.rancher.type.QuobyteVolumeSource;
import io.rancher.type.VolumeNodeAffinity;
import io.rancher.type.kubernetes.volumes.AwsElasticBlockStoreVolumeSource;
import io.rancher.type.kubernetes.volumes.AzureDiskVolumeSource;
import io.rancher.type.kubernetes.volumes.AzureFilePersistentVolumeSource;
import io.rancher.type.kubernetes.volumes.CephFSPersistentVolumeSource;
import io.rancher.type.kubernetes.volumes.CinderVolumeSource;
import io.rancher.type.kubernetes.volumes.CsiPersistentVolumeSource;
import io.rancher.type.kubernetes.volumes.FcVolumeSource;
import io.rancher.type.kubernetes.volumes.FlexPersistentVolumeSource;
import io.rancher.type.kubernetes.volumes.FlockerVolumeSource;
import io.rancher.type.kubernetes.volumes.GcePersistentDiskVolumeSource;
import io.rancher.type.kubernetes.volumes.GlusterfsVolumeSource;
import io.rancher.type.kubernetes.volumes.HostPathVolumeSource;
import io.rancher.type.kubernetes.volumes.IscsiPersistentVolumeSource;
import io.rancher.type.kubernetes.volumes.LocalVolumeSource;
import io.rancher.type.kubernetes.volumes.NfsVolumeSource;
import io.rancher.type.kubernetes.volumes.PhotonPersistentDiskVolumeSource;
import io.rancher.type.kubernetes.volumes.PortworxVolumeSource;
import io.rancher.type.kubernetes.volumes.RbdPersistentVolumeSource;
import io.rancher.type.kubernetes.volumes.ScaleIOPersistentVolumeSource;
import io.rancher.type.kubernetes.volumes.StorageOSPersistentVolumeSource;
import io.rancher.type.kubernetes.volumes.VsphereVirtualDiskVolumeSource;

public class PersistentVolume extends AbstractType {
    
    private List<String> accessModes;
    
    private Map<String, Object> annotations;
    
    private AwsElasticBlockStoreVolumeSource awsElasticBlockStore;
    
    private AzureDiskVolumeSource azureDisk;
    
    private AzureFilePersistentVolumeSource azureFile;
    
    private Map<String, Object> capacity;
    
    private CephFSPersistentVolumeSource cephfs;
    
    private CinderVolumeSource cinder;
    
    private ObjectReference claimRef;
    
    private String created;
    
    private String creatorId;
    
    private CsiPersistentVolumeSource csi;
    
    private String description;
    
    private FcVolumeSource fc;
    
    private FlexPersistentVolumeSource flexVolume;
    
    private FlockerVolumeSource flocker;
    
    private GcePersistentDiskVolumeSource gcePersistentDisk;
    
    private GlusterfsVolumeSource glusterfs;
    
    private HostPathVolumeSource hostPath;
    
    private IscsiPersistentVolumeSource iscsi;
    
    private Map<String, Object> labels;
    
    private LocalVolumeSource local;
    
    private List<String> mountOptions;
    /**
     * DnsLabel
     */
    private String name;
    
    private NfsVolumeSource nfs;
    
    private VolumeNodeAffinity nodeAffinity;
    
    private List<OwnerReference> ownerReferences;
    
    private String persistentVolumeReclaimPolicy;
    
    private PhotonPersistentDiskVolumeSource photonPersistentDisk;
    
    private PortworxVolumeSource portworxVolume;
    
    private QuobyteVolumeSource quobyte;
    
    private RbdPersistentVolumeSource rbd;
    
    private String removed;
    
    private ScaleIOPersistentVolumeSource scaleIO;
    
    private String state;
    
    private PersistentVolumeStatus status;
    
    private String storageClassId;
    
    private StorageOSPersistentVolumeSource storageos;
    
    private PersistentVolumeTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    private String volumeMode;
    
    private VsphereVirtualDiskVolumeSource vsphereVolume;
    
    public List<String> getAccessModes() {
        return this.accessModes;
    }

    public void setAccessModes(List<String> accessModes) {
      this.accessModes = accessModes;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
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
    
    public AzureFilePersistentVolumeSource getAzureFile() {
        return this.azureFile;
    }

    public void setAzureFile(AzureFilePersistentVolumeSource azureFile) {
      this.azureFile = azureFile;
    }
    
    public Map<String, Object> getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Map<String, Object> capacity) {
      this.capacity = capacity;
    }
    
    public CephFSPersistentVolumeSource getCephfs() {
        return this.cephfs;
    }

    public void setCephfs(CephFSPersistentVolumeSource cephfs) {
      this.cephfs = cephfs;
    }
    
    public CinderVolumeSource getCinder() {
        return this.cinder;
    }

    public void setCinder(CinderVolumeSource cinder) {
      this.cinder = cinder;
    }
    
    public ObjectReference getClaimRef() {
        return this.claimRef;
    }

    public void setClaimRef(ObjectReference claimRef) {
      this.claimRef = claimRef;
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
    
    public CsiPersistentVolumeSource getCsi() {
        return this.csi;
    }

    public void setCsi(CsiPersistentVolumeSource csi) {
      this.csi = csi;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public FcVolumeSource getFc() {
        return this.fc;
    }

    public void setFc(FcVolumeSource fc) {
      this.fc = fc;
    }
    
    public FlexPersistentVolumeSource getFlexVolume() {
        return this.flexVolume;
    }

    public void setFlexVolume(FlexPersistentVolumeSource flexVolume) {
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
    
    public IscsiPersistentVolumeSource getIscsi() {
        return this.iscsi;
    }

    public void setIscsi(IscsiPersistentVolumeSource iscsi) {
      this.iscsi = iscsi;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public LocalVolumeSource getLocal() {
        return this.local;
    }

    public void setLocal(LocalVolumeSource local) {
      this.local = local;
    }
    
    public List<String> getMountOptions() {
        return this.mountOptions;
    }

    public void setMountOptions(List<String> mountOptions) {
      this.mountOptions = mountOptions;
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
    
    public VolumeNodeAffinity getNodeAffinity() {
        return this.nodeAffinity;
    }

    public void setNodeAffinity(VolumeNodeAffinity nodeAffinity) {
      this.nodeAffinity = nodeAffinity;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getPersistentVolumeReclaimPolicy() {
        return this.persistentVolumeReclaimPolicy;
    }

    public void setPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
      this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
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
    
    public QuobyteVolumeSource getQuobyte() {
        return this.quobyte;
    }

    public void setQuobyte(QuobyteVolumeSource quobyte) {
      this.quobyte = quobyte;
    }
    
    public RbdPersistentVolumeSource getRbd() {
        return this.rbd;
    }

    public void setRbd(RbdPersistentVolumeSource rbd) {
      this.rbd = rbd;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public ScaleIOPersistentVolumeSource getScaleIO() {
        return this.scaleIO;
    }

    public void setScaleIO(ScaleIOPersistentVolumeSource scaleIO) {
      this.scaleIO = scaleIO;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public PersistentVolumeStatus getStatus() {
        return this.status;
    }

    public void setStatus(PersistentVolumeStatus status) {
      this.status = status;
    }
    
    public String getStorageClassId() {
        return this.storageClassId;
    }

    public void setStorageClassId(String storageClassId) {
      this.storageClassId = storageClassId;
    }
    
    public StorageOSPersistentVolumeSource getStorageos() {
        return this.storageos;
    }

    public void setStorageos(StorageOSPersistentVolumeSource storageos) {
      this.storageos = storageos;
    }
    
    public PersistentVolumeTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(PersistentVolumeTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getVolumeMode() {
        return this.volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
      this.volumeMode = volumeMode;
    }
    
    public VsphereVirtualDiskVolumeSource getVsphereVolume() {
        return this.vsphereVolume;
    }

    public void setVsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume) {
      this.vsphereVolume = vsphereVolume;
    }
    
}
