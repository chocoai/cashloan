
package com.creditinfo.schemas._2012._09.multiconnector;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Timeout", targetNamespace = "http://creditinfo.com/schemas/2012/09/MultiConnector")
public class MultiConnectorServiceSchemaTimeoutFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Timeout faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MultiConnectorServiceSchemaTimeoutFaultFaultMessage(String message, Timeout faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public MultiConnectorServiceSchemaTimeoutFaultFaultMessage(String message, Timeout faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.creditinfo.schemas._2012._09.multiconnector.Timeout
     */
    public Timeout getFaultInfo() {
        return faultInfo;
    }

}
