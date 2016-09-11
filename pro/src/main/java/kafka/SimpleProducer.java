package kafka;

import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.ProducerConfig;
import kafka.serializer.StringEncoder;


public class SimpleProducer {
	
	private Producer<String, String> producer;
	
	public SimpleProducer() {
		Properties props = new Properties();
		props.put("metadata.broker.list", "192.168.213.128:9092,192.168.213.128:9093,192.168.213.128:9094");
		props.put("serializer.class", "kafka.serializer.StringEncoder");
		props.put("request.required.acks", "1");
		
		ProducerConfig config = new ProducerConfig(props);
	}

}
