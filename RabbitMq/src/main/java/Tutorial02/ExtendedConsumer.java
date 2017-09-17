package Tutorial02;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import java.io.IOException;

public class ExtendedConsumer extends DefaultConsumer {
    private Channel _channel;
    private String _invoker;
        
    public ExtendedConsumer(Channel channel, String invoker) {
        super(channel);
        _channel = channel;
        _invoker = invoker;
    }

    @Override
    public void handleDelivery(String consumerTag, Envelope envelope,
                             AMQP.BasicProperties properties, byte[] body)throws IOException 
    {
        long deliveryTag = envelope.getDeliveryTag();
        String message = new String(body, "UTF-8");
        doWork(message);
        System.out.println("Received and consumed message by " +_invoker+": " + message);
        _channel.basicAck(deliveryTag, false);
    }   
    
    private static void doWork(String task) {
        for (char ch : task.toCharArray()) {
            if (ch == '.') {
                try {
                 Thread.sleep(1000);
                } 
                catch (InterruptedException _ignored) {
                  Thread.currentThread().interrupt();
                }
            }
        }
    }
}