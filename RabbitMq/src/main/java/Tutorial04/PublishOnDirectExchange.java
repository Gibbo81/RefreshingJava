package Tutorial04;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class PublishOnDirectExchange {

    private static final String Exchange_Name = "Direct_Tutorial4";
    
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory fac = new ConnectionFactory();
        fac.setHost("localhost");
        try (Connection con = fac.newConnection()){
            Channel cha = con.createChannel();  //we must close it manually because it does not implement Closeable
            cha.exchangeDeclare(Exchange_Name, "direct");            
            Publish(Exchange_Name, "Black","More Black Sea for all!",cha);
            Publish(Exchange_Name,"Green","More Green Sea for all!",cha);
            Publish(Exchange_Name,"Pink","More Pink Sea for all!",cha);
            cha.close();
        }
    }
    
    private static void Publish(String exchange, String routingKey, String message, Channel c) throws IOException{
        c.basicPublish(exchange, routingKey, MessageProperties.PERSISTENT_TEXT_PLAIN, message.getBytes());
        System.out.println(" [x] Sent '" + message + "' on routing key: "+ routingKey);
    }
}