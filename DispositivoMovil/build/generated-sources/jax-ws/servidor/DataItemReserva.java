
package servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para dataItemReserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dataItemReserva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="esServico" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="servicio" type="{http://Servidor/}dataServicio" minOccurs="0"/>
 *         &lt;element name="promocion" type="{http://Servidor/}dataPromocion" minOccurs="0"/>
 *         &lt;element name="nickCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://Servidor/}estado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataItemReserva", propOrder = {
    "cantidad",
    "fechaInicio",
    "fechaFin",
    "esServico",
    "servicio",
    "promocion",
    "nickCliente",
    "estado"
})
public class DataItemReserva {

    protected int cantidad;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFin;
    protected boolean esServico;
    protected DataServicio servicio;
    protected DataPromocion promocion;
    protected String nickCliente;
    protected Estado estado;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFin(XMLGregorianCalendar value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad esServico.
     * 
     */
    public boolean isEsServico() {
        return esServico;
    }

    /**
     * Define el valor de la propiedad esServico.
     * 
     */
    public void setEsServico(boolean value) {
        this.esServico = value;
    }

    /**
     * Obtiene el valor de la propiedad servicio.
     * 
     * @return
     *     possible object is
     *     {@link DataServicio }
     *     
     */
    public DataServicio getServicio() {
        return servicio;
    }

    /**
     * Define el valor de la propiedad servicio.
     * 
     * @param value
     *     allowed object is
     *     {@link DataServicio }
     *     
     */
    public void setServicio(DataServicio value) {
        this.servicio = value;
    }

    /**
     * Obtiene el valor de la propiedad promocion.
     * 
     * @return
     *     possible object is
     *     {@link DataPromocion }
     *     
     */
    public DataPromocion getPromocion() {
        return promocion;
    }

    /**
     * Define el valor de la propiedad promocion.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPromocion }
     *     
     */
    public void setPromocion(DataPromocion value) {
        this.promocion = value;
    }

    /**
     * Obtiene el valor de la propiedad nickCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickCliente() {
        return nickCliente;
    }

    /**
     * Define el valor de la propiedad nickCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickCliente(String value) {
        this.nickCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link Estado }
     *     
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link Estado }
     *     
     */
    public void setEstado(Estado value) {
        this.estado = value;
    }

}
