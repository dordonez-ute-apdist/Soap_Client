
package daoc.soapclient;

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
@WebServiceClient(name = "EmpService", targetNamespace = "http://soapjaxws.daoc/", wsdlLocation = "http://localhost:8080/empleados?wsdl")
public class EmpService
    extends Service
{

    private final static URL EMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPSERVICE_EXCEPTION;
    private final static QName EMPSERVICE_QNAME = new QName("http://soapjaxws.daoc/", "EmpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/empleados?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPSERVICE_WSDL_LOCATION = url;
        EMPSERVICE_EXCEPTION = e;
    }

    public EmpService() {
        super(__getWsdlLocation(), EMPSERVICE_QNAME);
    }

    public EmpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPSERVICE_QNAME, features);
    }

    public EmpService(URL wsdlLocation) {
        super(wsdlLocation, EMPSERVICE_QNAME);
    }

    public EmpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPSERVICE_QNAME, features);
    }

    public EmpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Emp
     */
    @WebEndpoint(name = "EmpPort")
    public Emp getEmpPort() {
        return super.getPort(new QName("http://soapjaxws.daoc/", "EmpPort"), Emp.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Emp
     */
    @WebEndpoint(name = "EmpPort")
    public Emp getEmpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soapjaxws.daoc/", "EmpPort"), Emp.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPSERVICE_EXCEPTION!= null) {
            throw EMPSERVICE_EXCEPTION;
        }
        return EMPSERVICE_WSDL_LOCATION;
    }

}