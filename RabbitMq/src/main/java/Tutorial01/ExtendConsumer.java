package Tutorial01;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import java.io.IOException;

public class ExtendConsumer extends DefaultConsumer {
    private Channel _channel;
        
    public ExtendConsumer(Channel channel) {
        super(channel);
        _channel = channel;
    }
    
    @Override
    public void handleDelivery(String consumerTag, Envelope envelope,
                             AMQP.BasicProperties properties, byte[] body)throws IOException 
    {
        long deliveryTag = envelope.getDeliveryTag();
        String message = new String(body, "UTF-8");
        System.out.println("Received and consumed message: " + message);
        _channel.basicAck(deliveryTag, false);
    }    
}
