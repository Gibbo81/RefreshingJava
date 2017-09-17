package Tutorial01;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
 
public class Send {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws IOException, TimeoutException {
        
        ConnectionFactory fac = new ConnectionFactory();
        fac.setHost("localhost");
        try (Connection con = fac.newConnection()){
            Channel cha = con.createChannel();  //we must close it manually because it does not implement Closeable
            cha.queueDeclare(QUEUE_NAME, true, false, false, null);
            Publish(QUEUE_NAME,"first Message",cha);
            Publish(QUEUE_NAME,"second Message",cha);
            Publish(QUEUE_NAME,"last Message",cha);
            cha.close();
        }

        
    }

    
    private static void Publish(String queueName, String message, Channel c) throws IOException{
        c.basicPublish("", queueName, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");
    }
}
