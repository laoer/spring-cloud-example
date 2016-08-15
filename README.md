#Spring Cloud Example

###这一个Spring Cloud的演示程序集

- config 配置服务，含Dockerfle
- config-file-simple 配置文件
- eureka-server Eureka服务
- hello Hello服务
- hello-message Hello消息服务，消息发送端
- base-service Mybatis数据查询的简单服务，包含消息接收端
- eureka-client 客户端调用程序
- docker docker-compose文件
- hystrix-dashboard Hystrix Dashboard
- zipkin-server Zipkin服务，采用Stream方式，后端RabbitMQ(可选Kafka)
- sleuth-service 简单Hello服务，采用Sleuth，Stream方式通过RabbitMQ(可选Kafka)，跟踪日志到Zipkin平台