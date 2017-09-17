package Tutorial02;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer1 {

    private final static String QUEUE_NAME = "hello";
    private final static boolean Durable = true;
    private final static int PrefetchCount = 2;
    
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory fac = new ConnectionFactory();
        fac.setHost("localhost");
        Connection con = fac.newConnection();
        Channel cha = con.createChannel();  //we must close it manually because it does not implement Closeable
        cha.basicQos(PrefetchCount);
        cha.queueDeclare(QUEUE_NAME, Durable, false, false, null);
        System.out.println(" [Consumer] Waiting for messages. To exit press CTRL+C");
        cha.basicConsume(QUEUE_NAME, new ExtendedConsumer(cha, "First Consumer"));
    }    
}