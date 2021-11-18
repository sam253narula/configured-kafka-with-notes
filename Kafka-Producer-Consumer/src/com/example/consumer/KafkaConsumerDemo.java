package com.example.consumer;

public class KafkaConsumerDemo {

	   public static void main(String[] args) {
	        ExampleConsumer consumerThread = new ExampleConsumer("testtopic");
	        consumerThread.start();
	    }
	   
}
