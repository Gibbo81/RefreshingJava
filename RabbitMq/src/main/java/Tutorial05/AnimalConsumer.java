package Tutorial05;

import Tutorial01.ExtendConsumer;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class AnimalConsumer {
    
    private final static String QUEUE_NAME = "Tutorial5_Animal_Consumer";
    private static final String Exchange_Name = "Topic_Tutorial5";
    private static final String Routing_Key_Animal = "animal.#";
    private final static boolean Durable = true;
    private final static int PrefetchCount = 2;
    
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory fac = new ConnectionFactory();
        fac.setHost("localhost");
        Connection con = fac.newConnection();
        Channel cha = con.createChannel();  
        cha.basicQos(PrefetchCount);
        cha.queueDeclare(QUEUE_NAME, Durable, false, false, null);
        System.out.println("Consumer will be binded for all animal");
        cha.queueBind(QUEUE_NAME, Exchange_Name, Routing_Key_Animal);
        
        System.out.println(" [Consumer] Waiting for messages.");
        cha.basicConsume(QUEUE_NAME, new ExtendConsumer(cha));
    }    
}
