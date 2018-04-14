
package servidor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servidor package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://Servidor/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servidor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DataInfoServicio }
     * 
     */
    public DataInfoServicio createDataInfoServicio() {
        return new DataInfoServicio();
    }

    /**
     * Create an instance of {@link DataFecha }
     * 
     */
    public DataFecha createDataFecha() {
        return new DataFecha();
    }

    /**
     * Create an instance of {@link DataProveedorArray }
     * 
     */
    public DataProveedorArray createDataProveedorArray() {
        return new DataProveedorArray();
    }

    /**
     * Create an instance of {@link DataCategoriaArray }
     * 
     */
    public DataCategoriaArray createDataCategoriaArray() {
        return new DataCategoriaArray();
    }

    /**
     * Create an instance of {@link DataPromocionArray }
     * 
     */
    public DataPromocionArray createDataPromocionArray() {
        return new DataPromocionArray();
    }

    /**
     * Create an instance of {@link DataPromocion }
     * 
     */
    public DataPromocion createDataPromocion() {
        return new DataPromocion();
    }

    /**
     * Create an instance of {@link DataServicio }
     * 
     */
    public DataServicio createDataServicio() {
        return new DataServicio();
    }

    /**
     * Create an instance of {@link DataItemReserva }
     * 
     */
    public DataItemReserva createDataItemReserva() {
        return new DataItemReserva();
    }

    /**
     * Create an instance of {@link DataInfoProveedor }
     * 
     */
    public DataInfoProveedor createDataInfoProveedor() {
        return new DataInfoProveedor();
    }

    /**
     * Create an instance of {@link DataCategoria }
     * 
     */
    public DataCategoria createDataCategoria() {
        return new DataCategoria();
    }

    /**
     * Create an instance of {@link DataEmpresa }
     * 
     */
    public DataEmpresa createDataEmpresa() {
        return new DataEmpresa();
    }

    /**
     * Create an instance of {@link DataCiudad }
     * 
     */
    public DataCiudad createDataCiudad() {
        return new DataCiudad();
    }

    /**
     * Create an instance of {@link DataInfoReserva }
     * 
     */
    public DataInfoReserva createDataInfoReserva() {
        return new DataInfoReserva();
    }

    /**
     * Create an instance of {@link DataInfoPromocion }
     * 
     */
    public DataInfoPromocion createDataInfoPromocion() {
        return new DataInfoPromocion();
    }

    /**
     * Create an instance of {@link DataServicioArray }
     * 
     */
    public DataServicioArray createDataServicioArray() {
        return new DataServicioArray();
    }

    /**
     * Create an instance of {@link DataInfoReservaArray }
     * 
     */
    public DataInfoReservaArray createDataInfoReservaArray() {
        return new DataInfoReservaArray();
    }

    /**
     * Create an instance of {@link DataProveedor }
     * 
     */
    public DataProveedor createDataProveedor() {
        return new DataProveedor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servidor/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
