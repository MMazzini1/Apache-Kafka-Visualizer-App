package com.example.demo.topics;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

<<<<<<< HEAD
=======

>>>>>>> 0ca2f94157c7365e65b82d509527e932458b1c25
@Configuration
public class KafkaTopicConfig {

	@Value(value = "${kafka.bootstrapAddress}")
	private String bootstrapAddress;

<<<<<<< HEAD
	@Value(value = "${kafka.topicOnePartition}")
	private String topicOnePartition;


	@Value(value = "${kafka.topicThreePartition}")
	private String topicThreePartition;


	@Value(value = "${kafka.topicFivePartition}")
	private String topicFivePartition;

=======
	@Value(value = "${kafka.testTopic}")
	private String topicName;


>>>>>>> 0ca2f94157c7365e65b82d509527e932458b1c25
	@Bean
	public KafkaAdmin kafkaAdmin() {
		Map<String, Object> configs = new HashMap<>();
		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
		return new KafkaAdmin(configs);
	}

	@Bean
	public NewTopic topic1() {
<<<<<<< HEAD
		return new NewTopic(topicOnePartition, 1, (short) 1);
	}


	@Bean
	public NewTopic topic3() {
		return new NewTopic(topicThreePartition, 3, (short) 1);
	}


	@Bean
	public NewTopic topic5() {
		return new NewTopic(topicFivePartition, 5, (short) 1);
=======
		return new NewTopic(topicName, 3, (short) 1);
>>>>>>> 0ca2f94157c7365e65b82d509527e932458b1c25
	}
}