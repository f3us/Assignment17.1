package Service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "CalcService")
public class CalcService {

    /**
     * This is a sample web service operation
     * @param firstNo
     * @param SecondNo
     * @return 
     */
    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "firstNo") int firstNo,@WebParam(name = "SecondNo") int SecondNo) {
        return "Hello web Service Addition " +(firstNo+SecondNo) + " !";
    }
}
