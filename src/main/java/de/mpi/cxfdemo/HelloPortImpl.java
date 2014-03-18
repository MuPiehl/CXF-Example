package de.mpi.cxfdemo;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import mpi.example.cxfdemo.v1.*;
import mpi.example.cxfdemo.v1_1.HelloPort;

@javax.jws.WebService(serviceName = "trytry")
        /*(
        serviceName = "CXFHelloExampleService",
        portName = "CXFHelloExampleService",
        targetNamespace = "http://cxfdemo.example.com/v1.1",
        endpointInterface = "mpi.example.cxfdemo.v1_1.HelloPort")
            */
public class HelloPortImpl{ //implements HelloPort {
    @WebMethod(operationName = "mpiOperation")
    public @WebResult(name = "mpiResult") SayHelloResponse sayHelloOperation(@WebParam(name = "mpiRequest") SayHello sayHello, @WebParam(name = "partnerId")String text) {
        SayHelloResponse hello = new SayHelloResponse();
        hello.setGreeting("Howdy! " + text);
        hello.setRequest(sayHello);
        return hello;
    }

}