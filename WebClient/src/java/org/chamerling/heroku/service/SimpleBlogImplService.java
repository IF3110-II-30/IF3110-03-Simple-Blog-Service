
package org.chamerling.heroku.service;

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
@WebServiceClient(name = "SimpleBlogImplService", targetNamespace = "http://service.heroku.chamerling.org/", wsdlLocation = "http://simple-blog-30.herokuapp.com/simple-blog?wsdl")
public class SimpleBlogImplService
    extends Service
{

    private final static URL SIMPLEBLOGIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SIMPLEBLOGIMPLSERVICE_EXCEPTION;
    private final static QName SIMPLEBLOGIMPLSERVICE_QNAME = new QName("http://service.heroku.chamerling.org/", "SimpleBlogImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://simple-blog-30.herokuapp.com/simple-blog?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIMPLEBLOGIMPLSERVICE_WSDL_LOCATION = url;
        SIMPLEBLOGIMPLSERVICE_EXCEPTION = e;
    }

    public SimpleBlogImplService() {
        super(__getWsdlLocation(), SIMPLEBLOGIMPLSERVICE_QNAME);
    }

    public SimpleBlogImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIMPLEBLOGIMPLSERVICE_QNAME, features);
    }

    public SimpleBlogImplService(URL wsdlLocation) {
        super(wsdlLocation, SIMPLEBLOGIMPLSERVICE_QNAME);
    }

    public SimpleBlogImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIMPLEBLOGIMPLSERVICE_QNAME, features);
    }

    public SimpleBlogImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SimpleBlogImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SimpleBlog
     */
    @WebEndpoint(name = "SimpleBlogImplPort")
    public SimpleBlog getSimpleBlogImplPort() {
        return super.getPort(new QName("http://service.heroku.chamerling.org/", "SimpleBlogImplPort"), SimpleBlog.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SimpleBlog
     */
    @WebEndpoint(name = "SimpleBlogImplPort")
    public SimpleBlog getSimpleBlogImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.heroku.chamerling.org/", "SimpleBlogImplPort"), SimpleBlog.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIMPLEBLOGIMPLSERVICE_EXCEPTION!= null) {
            throw SIMPLEBLOGIMPLSERVICE_EXCEPTION;
        }
        return SIMPLEBLOGIMPLSERVICE_WSDL_LOCATION;
    }

}