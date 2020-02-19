package genericsoap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author jashanjotsingh 
 * service endpoint interface
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculatorWS {
    @WebMethod int add(int a, int b);
    @WebMethod int multiply(int a, int b);
}
