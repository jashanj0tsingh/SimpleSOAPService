package genericsoap;

import javax.xml.ws.Endpoint;

/**
 *
 * @author jashanjotsingh 
 * service endpoint publisher
 */
public class CalculatorWSPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/calculator", new CalculatorWSImpl());
    }
}
