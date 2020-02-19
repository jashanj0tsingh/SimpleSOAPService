package genericsoap;

import javax.jws.WebService;

/**
 *
 * @author jashanjotsingh
 * service interface implementation
 */
@WebService(endpointInterface = "genericsoap.CalculatorWS")
public class CalculatorWSImpl implements CalculatorWS {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
    
}
