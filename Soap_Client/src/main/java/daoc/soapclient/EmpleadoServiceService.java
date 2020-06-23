
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
@WebServiceClient(name = "EmpleadoServiceService", targetNamespace = "http://soapjaxws.daoc/", wsdlLocation = "http://localhost:8080/empleados?wsdl")
public class EmpleadoServiceService
    extends Service
{

    private final static URL EMPLEADOSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPLEADOSERVICESERVICE_EXCEPTION;
    private final static QName EMPLEADOSERVICESERVICE_QNAME = new QName("http://soapjaxws.daoc/", "EmpleadoServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/empleados?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPLEADOSERVICESERVICE_WSDL_LOCATION = url;
        EMPLEADOSERVICESERVICE_EXCEPTION = e;
    }

    public EmpleadoServiceService() {
        super(__getWsdlLocation(), EMPLEADOSERVICESERVICE_QNAME);
    }

    public EmpleadoServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPLEADOSERVICESERVICE_QNAME, features);
    }

    public EmpleadoServiceService(URL wsdlLocation) {
        super(wsdlLocation, EMPLEADOSERVICESERVICE_QNAME);
    }

    public EmpleadoServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPLEADOSERVICESERVICE_QNAME, features);
    }

    public EmpleadoServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpleadoServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IEmpleadoService
     */
    @WebEndpoint(name = "EmpleadoServicePort")
    public IEmpleadoService getEmpleadoServicePort() {
        return super.getPort(new QName("http://soapjaxws.daoc/", "EmpleadoServicePort"), IEmpleadoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IEmpleadoService
     */
    @WebEndpoint(name = "EmpleadoServicePort")
    public IEmpleadoService getEmpleadoServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soapjaxws.daoc/", "EmpleadoServicePort"), IEmpleadoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPLEADOSERVICESERVICE_EXCEPTION!= null) {
            throw EMPLEADOSERVICESERVICE_EXCEPTION;
        }
        return EMPLEADOSERVICESERVICE_WSDL_LOCATION;
    }

}
