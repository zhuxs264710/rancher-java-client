# zxscedar
此项目基于rancher版本v2.1.6的schema生成，rancherUtils中的已经测试通过，其他service还需要大家自行测试使用。相关参数请查阅K8s官网。

具体使用方法可以参照RancherUtils中的方法。
RancherUtils的使用示例如下：

Config config = new Config(new URL("https://192.168.1.1/v3"),"token-aasdf","asdffqwr123as");
RancherUtils ru = RancherUtils.buildUtils(config);
Config构造器第一个参数为rancher的地址，第二个和第三个参数是从rancher上申请的token，可以使用永久的token。
