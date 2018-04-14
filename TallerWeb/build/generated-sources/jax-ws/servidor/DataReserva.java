
package servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dataReserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dataReserva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaCreacion" type="{http://Servidor/}dataFecha" minOccurs="0"/>
 *         &lt;element name="fechaInicio" type="{http://Servidor/}dataFecha" minOccurs="0"/>
 *         &lt;element name="fechaFin" type="{http://Servidor/}dataFecha" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="estado" type="{http://Servidor/}estado" minOccurs="0"/>
 *         &lt;element name="nickCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataReserva", propOrder = {
    "identificador",
    "fechaCreacion",
    "fechaInicio",
    "fechaFin",
    "precio",
    "estado",
    "nickCliente"
})
public class DataReserva {

    protected int identificador;
    protected DataFecha fechaCreacion;
    protected DataFecha fechaInicio;
    protected DataFecha fechaFin;
    protected float precio;
    protected Estado estado;
    protected String nickCliente;

    /**
     * Obtiene el valor de la propiedad identificador.
     * 
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Define el valor de la propiedad identificador.
     * 
     */
    public void setIdentificador(int value) {
        this.identificador = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link DataFecha }
     *     
     */
    public DataFecha getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFecha }
     *     
     */
    public void setFechaCreacion(DataFecha value) {
        this.fechaCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link DataFecha }
     *     
     */
    public DataFecha getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFecha }
     *     
     */
    public void setFechaInicio(DataFecha value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link DataFecha }
     *     
     */
    public DataFecha getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFecha }
     *     
     */
    public void setFechaFin(DataFecha value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(float value) {
        this.precio = value;
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

}
