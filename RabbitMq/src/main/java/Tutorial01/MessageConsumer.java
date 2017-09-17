package Tutorial01;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class MessageConsumer {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory fac = new ConnectionFactory();
        fac.setHost("localhost");
        Connection con = fac.newConnection();
        Channel cha = con.createChannel();  //we must close it manually because it does not implement Closeable
        cha.queueDeclare(QUEUE_NAME, true, false, false, null);
        System.out.println(" [Consumer] Waiting for messages. To exit press CTRL+C");
        cha.basicConsume(QUEUE_NAME, new ExtendConsumer(cha));
    } 
}