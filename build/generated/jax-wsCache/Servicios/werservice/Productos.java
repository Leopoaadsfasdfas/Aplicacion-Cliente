
package werservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion_producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="existencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre_producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio_liquidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio_mayoreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio_oferta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio_unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productos", propOrder = {
    "categoria",
    "descripcionProducto",
    "estado",
    "existencia",
    "imagen",
    "marca",
    "nombreProducto",
    "precioLiquidacion",
    "precioMayoreo",
    "precioOferta",
    "precioUnidad",
    "proveedor"
})
public class Productos {

    protected String categoria;
    @XmlElement(name = "descripcion_producto")
    protected String descripcionProducto;
    protected String estado;
    protected String existencia;
    protected String imagen;
    protected String marca;
    @XmlElement(name = "nombre_producto")
    protected String nombreProducto;
    @XmlElement(name = "precio_liquidacion")
    protected String precioLiquidacion;
    @XmlElement(name = "precio_mayoreo")
    protected String precioMayoreo;
    @XmlElement(name = "precio_oferta")
    protected String precioOferta;
    @XmlElement(name = "precio_unidad")
    protected String precioUnidad;
    protected String proveedor;

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * Define el valor de la propiedad descripcionProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionProducto(String value) {
        this.descripcionProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad existencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistencia() {
        return existencia;
    }

    /**
     * Define el valor de la propiedad existencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistencia(String value) {
        this.existencia = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Define el valor de la propiedad nombreProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProducto(String value) {
        this.nombreProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad precioLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioLiquidacion() {
        return precioLiquidacion;
    }

    /**
     * Define el valor de la propiedad precioLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioLiquidacion(String value) {
        this.precioLiquidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad precioMayoreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioMayoreo() {
        return precioMayoreo;
    }

    /**
     * Define el valor de la propiedad precioMayoreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioMayoreo(String value) {
        this.precioMayoreo = value;
    }

    /**
     * Obtiene el valor de la propiedad precioOferta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioOferta() {
        return precioOferta;
    }

    /**
     * Define el valor de la propiedad precioOferta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioOferta(String value) {
        this.precioOferta = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioUnidad() {
        return precioUnidad;
    }

    /**
     * Define el valor de la propiedad precioUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioUnidad(String value) {
        this.precioUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveedor(String value) {
        this.proveedor = value;
    }

}
