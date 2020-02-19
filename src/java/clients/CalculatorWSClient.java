package clients;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import genericsoap.CalculatorWS;

/**
 *
 * @author jashanjotsingh
 */
public class CalculatorWSClient {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8888/ws/calculator?wsdl");

        //new QName(service URI,service name) refer to WSDL
        QName qname = new QName("http://genericsoap/", "CalculatorWSImplService");
        Service service = Service.create(url, qname);
        CalculatorWS calc = service.getPort(CalculatorWS.class);
        //TODO: refactor as test
        if (calc.add(2, 5) == 7)
           System.out.println("Success: add operation tested!");
    }
}
