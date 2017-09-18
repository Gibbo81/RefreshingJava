package Tutorial04;

import Tutorial01.ExtendConsumer;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
        
public class Pink_Green_Consumer {
    
    private final static String QUEUE_NAME = "Tutorial4_Pink_Green_Consumer";
    private static final String Exchange_Name = "Direct_Tutorial4";
    private static final String Routing_Key_Green = "Green";
    private static final String Routing_Key_Pink = "Pink";
    private final static boolean Durable = true;
    private final static int PrefetchCount = 2;
    
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory fac = new ConnectionFactory();
        fac.setHost("localhost");
        Connection con = fac.newConnection();
        Channel cha = con.createChannel();  
        cha.basicQos(PrefetchCount);
        cha.queueDeclare(QUEUE_NAME, Durable, false, false, null);
        System.out.println("Consumer will be binded both on Pink and Green Routing Key");
        cha.queueBind(QUEUE_NAME, Exchange_Name, Routing_Key_Green);
        cha.queueBind(QUEUE_NAME, Exchange_Name, Routing_Key_Pink);
        
        System.out.println(" [Consumer] Waiting for messages. To exit press CTRL+C");
        cha.basicConsume(QUEUE_NAME, new ExtendConsumer(cha));
    }    
}
