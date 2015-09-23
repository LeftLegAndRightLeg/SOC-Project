
package com.mkyong.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransformImplService", targetNamespace = "http://ws.mkyong.com/", wsdlLocation = "http://localhost:9999/ws/transform?wsdl")
public class TransformImplService
    extends Service
{

    private final static URL TRANSFORMIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSFORMIMPLSERVICE_EXCEPTION;
    private final static QName TRANSFORMIMPLSERVICE_QNAME = new QName("http://ws.mkyong.com/", "TransformImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/ws/transform?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSFORMIMPLSERVICE_WSDL_LOCATION = url;
        TRANSFORMIMPLSERVICE_EXCEPTION = e;
    }

    public TransformImplService() {
        super(__getWsdlLocation(), TRANSFORMIMPLSERVICE_QNAME);
    }

    public TransformImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSFORMIMPLSERVICE_QNAME, features);
    }

    public TransformImplService(URL wsdlLocation) {
        super(wsdlLocation, TRANSFORMIMPLSERVICE_QNAME);
    }

    public TransformImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSFORMIMPLSERVICE_QNAME, features);
    }

    public TransformImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransformImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Transform
     */
    @WebEndpoint(name = "TransformImplPort")
    public Transform getTransformImplPort() {
        return super.getPort(new QName("http://ws.mkyong.com/", "TransformImplPort"), Transform.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Transform
     */
    @WebEndpoint(name = "TransformImplPort")
    public Transform getTransformImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.mkyong.com/", "TransformImplPort"), Transform.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSFORMIMPLSERVICE_EXCEPTION!= null) {
            throw TRANSFORMIMPLSERVICE_EXCEPTION;
        }
        return TRANSFORMIMPLSERVICE_WSDL_LOCATION;
    }

}
