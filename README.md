RestTemplate负载均衡
https://www.cnblogs.com/Howinfun/p/12111547.html



Spring Cloud Ribbon 是基于netflix Ribbon实现的一套客户端负载均衡工具
主要提供客户端软件的负载均衡算法和服务调用，Ribbon客户端组件提供一系列完善的配置项，如：链接超时，重试等。
简单来说，就是在配置文件中列出Load Balance后面所有的机器，Ribbon会自动帮助你基于某种规则（简单轮询，随机链接。。。）去链接这些机器
我们很容易使用Ribbon实现自定义的负载均衡算法

https://github.com/Netflix/ribbon/wiki/Getting-Started
