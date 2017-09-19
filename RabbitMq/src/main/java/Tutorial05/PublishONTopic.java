package Tutorial05;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class PublishONTopic {

    private static final String Exchange_Name = "Topic_Tutorial5";
    private static final Boolean Durable = true;
            
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory fac = new ConnectionFactory();
        fac.setHost("localhost");
        try (Connection con = fac.newConnection()){
            Channel cha = con.createChannel();  //we must close it manually because it does not implement Closeable
            cha.exchangeDeclare(Exchange_Name, "topic", Durable);            
            Publish(Exchange_Name, "animal.big.red" ,    "Our animal is: animal.big.red!",cha);
            Publish(Exchange_Name, "animal.small.green" ,"Our animal is: animal.small.green!",cha);
            Publish(Exchange_Name, "plant.big.green"  , "Our plant is: plant.big.green!",cha);
            Publish(Exchange_Name, "animal.medium.green" ,"Our animal is: animal.medium.green",cha);
            Publish(Exchange_Name, "animal.big.green" ,    "Our animal is: animal.big.green!",cha);
            cha.close();
        }
    }
    
    private static void Publish(String exchange, String routingKey, String message, Channel c) throws IOException{
        c.basicPublish(exchange, routingKey, MessageProperties.PERSISTENT_TEXT_PLAIN, message.getBytes());
        System.out.println(" [x] Sent '" + message + "' on routing key: "+ routingKey);
    }
}