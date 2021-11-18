package com.example.producer;

public class KafkaProducerDemo {
    public static final String TOPIC = "testtopic";
     
    public static void main(String[] args) {
        boolean isAsync = false;
        ExampleProducer producerThread = new ExampleProducer(TOPIC, isAsync);
        producerThread.start();
 
    }
}
