
package servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dataPromocion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dataPromocion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precioTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nickProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataPromocion", propOrder = {
    "nombre",
    "descuento",
    "precioTotal",
    "nickProveedor"
})
public class DataPromocion {

    protected String nombre;
    protected int descuento;
    protected int precioTotal;
    protected String nickProveedor;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     */
    public void setDescuento(int value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad precioTotal.
     * 
     */
    public int getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Define el valor de la propiedad precioTotal.
     * 
     */
    public void setPrecioTotal(int value) {
        this.precioTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad nickProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickProveedor() {
        return nickProveedor;
    }

    /**
     * Define el valor de la propiedad nickProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickProveedor(String value) {
        this.nickProveedor = value;
    }

}
