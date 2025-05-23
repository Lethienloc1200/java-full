package com.project.shopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.project.shopapp.repositories")
@ComponentScan(basePackages = {
		"com.project.shopapp",
//		"com.project.shopapp.services",
//		"com.project.shopapp.components",
//		"com.project.shopapp.configurations",
//		"com.project.shopapp.filters"
})
//@ImportAutoConfiguration(AopAutoConfiguration.class)
//@SpringBootApplication(exclude = KafkaAutoConfiguration.class), disable in "application.yml"
public class ShopappApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShopappApplication.class, args);
	}

}
/*
cd "thư mục dự án"
Trong bài này của mình là(trong máy tính của các bạn có thể là thư mục khác):
MacOS
cd /Volumes/data/code/udemy/ShopApp/shopapp-backend
Windows:
cd C:\\code\\udemy\\ShopApp\\shopapp-backend
docker rm -f zookeeper-01 zookeeper-02 zookeeper-03 kafka-broker-01
docker-compose -f ./kafka-deployment.yaml down -v

docker-compose -f ./kafka-deployment.yaml up -d zookeeper-01
docker-compose -f ./kafka-deployment.yaml up -d zookeeper-02
docker-compose -f ./kafka-deployment.yaml up -d zookeeper-03

Đợi khoảng 10 giây sau đó chạy lệnh này
docker-compose -f ./kafka-deployment.yaml up -d kafka-broker-01

Những lần sau khi restart máy có thể bật lại các container:
docker restart zookeeper-01 zookeeper-02 zookeeper-03
đợi vài giây:
docker restart kafka-broker-01

*/
