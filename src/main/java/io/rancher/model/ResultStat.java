package io.rancher.model;

import io.rancher.utils.StringUtils;

/**
 */
public enum ResultStat {
    /**
     * if you need new result code, add it here and give it a good name
     */
	PORT_EXIST(2510),
	
	NO_SUPPORTED_FUNCTION(2509),
	
	
	
	IMAGE_PUSH_ERROR(2508),
	IMAGE_LOAD_ERROR(2507),
	IMAGE_FILE_NOT_EXIST(2506),
	BUILD_FAILED(2505),
	NO_JDK_TYPE(2501),
	NO_SUCH_FILE(2502),
	WRONG_FILE(2503),
	FILE_TYPE_NOT_MATCH(2503),
	
	OK(200),
    SERVER_INTERNAL_ERROR(500),

    PARAM_ERROR(400),

    FORBIDDEN(403),

    RESOURCE_NOT_EXIST(404),

    RESOURCE_NOT_ENOUGH(500),

    NODE_NOT_REGISTERD(404),

    KUBE_EXCEPTION(600),

    CREATOR_ERROR(700),

    // cluster related
    CLUSTER_NOT_LEGAL(1001),
    CLUSTER_NOT_EXIST(1002),
    CLUSTER_ALREADY_EXIST(1003),
    CANNOT_SET_CLUSTER(1004),
    CANNOT_DELETE_CLUSTER(1005),
    CANNOT_UPDATE_CLUSTER(1006),
    CLUSTER_WATCHER_NOT_READY(1007),

    // project related
    PROJECT_EXISTED(1100),
    PROJECT_NOT_EXIST(1101),
    PROJECT_NOT_LEGAL(1102),
    CANNOT_DELETE_PROJECT(1103),
    PROJECT_CODE_INFO_NOT_EXIST(1104),
    PROJECT_COLLECTION_NOT_LEGAL(1105),
    PROJECT_COLLECTION_EXISTED(1106),
    NO_USER_CORRELATION(1107),
    USER_PERMISSION_ERROR(1108),

    // deployment related
    HPA_INFO_EMPTY(1215),
    DEPLOYMENT_NOT_LEGAL(1200),
    DEPLOYMENT_NOT_EXIST(1201),
    CANNOT_DELETE_DEPLOYMENT(1202),
    DEPLOYMENT_EXIST(1203),
    DEPLOYMENT_STOP_FAILED(1204),
    DEPLOYMENT_START_FAILED(1205),
    DEPLOYMENT_GETVERSION_FAILED(1206),
    DEPLOYMENT_STATUS_NOT_ALLOW(1207),
    DEPLOYMENT_ABORT_EVENT_FAILED(1208),
    DEPLOY_COLLECTION_NOT_LEGAL(1209),
    DEPLOY_COLLECTION_NOT_EXIST(1210),
    DEPLOY_IN_DEPLOY_COLLECTION(1211),
    CANNOT_DELETE_DEPLOY_COLLECTION(1212),
    DEPLOY_COLLECTION_EXIST(1213),
    CANNOT_DELETE_INSTANCE(1214),

    // version related
    VERSION_NOT_EXIST(1300),
    CANNOT_DELETE_VERSION(1301),
    CANNOT_DEPRECATE_VERSION(1302),
    CANNOT_ENABLE_VERSION(1303),
    
    // build related
    BUILD_NOT_EXIST(1400),
    BUILD_GET_VALUE_ERROR(1401),
    BUILD_EXISTED(1402),
    DOCKERFILE_NOT_EXIST(1403),
    BUILD_INFO_NOT_EXIST(1404),
    BUILD_INFO_NOT_MATCH(1405),
    REGISTRY_NOT_EXIST(1406),
    WEBHOOK_ERROR(1407),
    RSAKEYPAIR_ERROR(1408),
    BUILD_ALREADY_STOPPED(1409),

    // base image related
    BASE_IMAGE_MAPPING_ERROR(1500),
    BASE_IMAGE_ERROR(1501),
    BASE_IMAGE_ALREADY_EXIST(1502),
    IMAGE_EXSIT_IN_REGISTRY(1503),
    SEND_JOB_ERROR(1504),
    DELETE_IMAGE_IN_REGISTRY_ERROR(1505),
    ITEM_NOT_EXIST(1506),

    // sshkey related
    DO(1600),
    SSHKEY_NOT_EXIST(1601),

    // deploymentRuntime related
    DEPLOYMENTRUNTIME_NOT_EXIST(1701),

    // instance related
    INSTANCE_NOT_EXIST(1801),

    DEPLOYMENTINFO_NOT_EXIST(1801),

    // git related
    GITLAB_INFO_NOT_EXIST(1901),
    GITLAB_GLOBAL_INFO_NOT_EXIST(1902),
    GITLAB_COMMIT_NOT_FOUND(1903),
    GIT_INFO_ALREADY_EXIST(1904),

    // auth user related
    USER_EXISTED(2000),
    USER_NOT_EXIST(2001),
    USER_NOT_AUTHORIZED(2002),
    USER_NOT_LEGAL(2003),
    USER_LIST_EMPTY(2004),
    AUTH_METHOD_NOT_LEGAL(2005),
    AUTH_PRIVATE_KEY_ERROR(2006),
    AUTH_TOKEN_ERROR(2007),
    // auth group related
    GROUP_EXISTED(2030),
    GROUP_NOT_EXIST(2031),
    GROUP_NOT_AUTHORIZED(2032),
    GROUP_NOT_LEGAL(2033),
    GROUP_LIST_EMPTY(2034),
    // group member related
    GROUP_MEMBER_FAILED(2050),
    GROUP_MEMBER_LIST_EMPTY(2051),
    GROUP_MEMBER_DELETE_ERROR(2502),
    GROUP_MEMBER_EDIT_ERROR(2503),
    // resource
    NAMESPACE_FAILED(2060),

    // deployment update related
    DEPLOYMENT_UPDATE_FAILED(2100),

    // deployment scale related
    DEPLOYMENT_SCALE_NO_RC_FOUND(2200),
    DEPLOYMENT_SCALE_BAD_RC_FOUND(2201),

    // monitor related
    TARGET_REQUEST_NOT_LEGAL(2300),
    MONITOR_DATA_REQUEST_NOT_LEGAL(2301),
    MONITOR_DATA_QUERY_ERROR(2302),

    // alarm related
    HOSTGROUP_NOT_LEGAL(2400),
    HOSTGROUP_EXISTED(2401),
    HOSTGROUP_NOT_EXISTED(2402),
    HOST_NOT_LEGAL(2403),
    HOST_NOT_EXISTED(2404),
    TEMPLATE_NOT_LEGAL(2405),
    TEMPLATE_EXISTED(2406),
    TEMPLATE_NOT_EXISTED(2407),
    MONITOR_DATA_ALARM_ERROR(2408),
    POST_ALARM_ERROR(2409),
    AGENT_NOT_READY(2410),
    USERGROUP_NOT_LEGAL(2400),
    USERGROUP_EXISTED(2401),
    USERGROUP_NOT_EXISTED(2402),

    // pod related
    POD_NOT_EXIST(2500),

    STORAGE_NOT_EXIST(2600),
    STORAGE_VOLUME_USED(2601),
    
    CONFIGURATION_USED(2700),
    
    // sso related
    SSO_NOT_SET(2800),
    SSO_SET_ERROR(2801),
    
    // load balancer related
    LOADBALANCER_COLLECTION_NOT_LEGAL(2900),
    LOADBALANCER_COLLECTION_EXIST(2901),
    LOADBALANCER_COLLECTION_NOT_EXIST(2902),
    CANNOT_DELETE_LOADBALANCER_COLLECTION(2903),
    CANNOT_UPDATE_LOADBALANCER_COLLECTION(2904),
    LOADBALANCER_NOT_LEGAL(2905),
    LOADBALANCER_EXIST(2906),
    LOADBALANCER_NOT_EXIST(2907),
    LOADBALANCER_PORT_USED(2908),
    CANNOT_DELETE_LOADBALANCER(2909),
    LOADBALANCER_START_FAILED(2910),
    LOADBALANCER_STOP_FAILED(2911),
    //service related
    SERVICE_EXIST(3000),
    
    // ingress related
    INGRESS_STOP_FAILED(2912),
    INGRESS_START_FAILED(2913),
    MAX(9999);
    //!!----------------do not modify code below------------------!!
    public final int responseCode;

    public <T> HttpResponseTemp<T> wrap(T data) {
        return wrap(data, null);
    }

    /**
     * wrap the result with a result code and result message
     * @param data result data
     * @param msg result message
     * @param <T> result type
     * @return
     */
    public <T> HttpResponseTemp<T> wrap(T data, String msg) {
        String message = this.name();
        if (!StringUtils.isBlank(msg)) {
            message = message + ":" + msg;
        }
        return new HttpResponseTemp<>(data, this, message);
    }

    private ResultStat(int code) {
        this.responseCode = code;
    }
}
