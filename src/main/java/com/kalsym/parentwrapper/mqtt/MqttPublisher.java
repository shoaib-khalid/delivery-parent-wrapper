package com.kalsym.parentwrapper.mqtt;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;


@Setter
@Getter
public class MqttPublisher {

    private MqttClient publisher;

    public MqttPublisher(String ip,String port, String clientId) throws MqttException {

        publisher = new MqttClient("tcp://"+ip+":"+port,clientId);
        publisher.connect();

        if(publisher.isConnected())
            System.out.println("############################ Mqtt Publisher Connected ##########################");
        else
            System.out.println("############################ Mqtt Publisher Not Connected ##########################");

    }

    public MqttPublisher(String url, String clientId) throws MqttException {

        publisher = new MqttClient("tcp://"+url,clientId);
        publisher.connect();

        if(publisher.isConnected())
            System.out.println("############################ Mqtt Publisher Connected ##########################");
        else
            System.out.println("############################ Mqtt Publisher Not Connected ##########################");

    }

    public void sendMessage(JSONObject message, String topic)  {
        MqttMessage msg = new MqttMessage();
        msg.setQos(2);
        msg.setPayload(message.toString().getBytes(StandardCharsets.UTF_8));
        if(publisher.isConnected()){
            try {
                publisher.publish(topic, msg);
            } catch (MqttException e) {
                System.out.println("Could not publish message, publisher not connected");
            }
            System.out.println("Message sent ! : [ "+msg+" ] to topic : { "+topic+" }");
        }
    }
}
