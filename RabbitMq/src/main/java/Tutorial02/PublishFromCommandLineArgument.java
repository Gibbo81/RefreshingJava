package Tutorial02;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
 

public class PublishFromCommandLineArgument {

    private final static String QUEUE_NAME = "hello";
    private final static boolean Durable = true;
    
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory fac = new ConnectionFactory();
        fac.setHost("localhost");
        try (Connection con = fac.newConnection()){
            Channel cha = con.createChannel();  //we must close it manually because it does not implement Closeable
            cha.queueDeclare(QUEUE_NAME, Durable, false, false, null);
            Publish(QUEUE_NAME,GetMessage(args),cha);
            cha.close();
        }
    }
    
    private static String GetMessage(String[] args){
        if (args.length<0)
            return "Hello Word";
        return Interlock(args, " ");
    }
    
    private static String Interlock(String[] args, String delimeter){
        String result ="";
        for(String s : args)
            result = result + s + delimeter;
        return result;
    }
    
    private static void Publish(String queueName, String message, Channel c) throws IOException{
        c.basicPublish("", queueName, MessageProperties.PERSISTENT_TEXT_PLAIN, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");
    }
}