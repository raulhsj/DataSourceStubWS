//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.08.01 a las 08:30:50 AM CEST 
//


package com.ust.calc.calculadora.wsdlstub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para data complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="data"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecnac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctacte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadocivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecalta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipocontrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nsegsoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numtel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecbaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refCatastro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data", propOrder = {
    "id",
    "name",
    "email",
    "salary",
    "dni",
    "fecnac",
    "direccion",
    "ctacte",
    "estadocivil",
    "sexo",
    "fecalta",
    "categoria",
    "tipocontrato",
    "nsegsoc",
    "numtel",
    "fecbaja",
    "refCatastro"
})
public class Data {

    protected String id;
    protected String name;
    protected String email;
    protected String salary;
    protected String dni;
    protected String fecnac;
    protected String direccion;
    protected String ctacte;
    protected String estadocivil;
    protected String sexo;
    protected String fecalta;
    protected String categoria;
    protected String tipocontrato;
    protected String nsegsoc;
    protected String numtel;
    protected String fecbaja;
    protected String refCatastro;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad salary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalary() {
        return salary;
    }

    /**
     * Define el valor de la propiedad salary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalary(String value) {
        this.salary = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDni(String value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad fecnac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecnac() {
        return fecnac;
    }

    /**
     * Define el valor de la propiedad fecnac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecnac(String value) {
        this.fecnac = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad ctacte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtacte() {
        return ctacte;
    }

    /**
     * Define el valor de la propiedad ctacte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtacte(String value) {
        this.ctacte = value;
    }

    /**
     * Obtiene el valor de la propiedad estadocivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadocivil() {
        return estadocivil;
    }

    /**
     * Define el valor de la propiedad estadocivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadocivil(String value) {
        this.estadocivil = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad fecalta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecalta() {
        return fecalta;
    }

    /**
     * Define el valor de la propiedad fecalta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecalta(String value) {
        this.fecalta = value;
    }

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
     * Obtiene el valor de la propiedad tipocontrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipocontrato() {
        return tipocontrato;
    }

    /**
     * Define el valor de la propiedad tipocontrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipocontrato(String value) {
        this.tipocontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad nsegsoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsegsoc() {
        return nsegsoc;
    }

    /**
     * Define el valor de la propiedad nsegsoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsegsoc(String value) {
        this.nsegsoc = value;
    }

    /**
     * Obtiene el valor de la propiedad numtel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumtel() {
        return numtel;
    }

    /**
     * Define el valor de la propiedad numtel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumtel(String value) {
        this.numtel = value;
    }

    /**
     * Obtiene el valor de la propiedad fecbaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecbaja() {
        return fecbaja;
    }

    /**
     * Define el valor de la propiedad fecbaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecbaja(String value) {
        this.fecbaja = value;
    }

    /**
     * Obtiene el valor de la propiedad refCatastro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCatastro() {
        return refCatastro;
    }

    /**
     * Define el valor de la propiedad refCatastro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCatastro(String value) {
        this.refCatastro = value;
    }

	public Data(String id, String name, String email, String salary, String dni, String fecnac, String direccion,
			String ctacte, String estadocivil, String sexo, String fecalta, String categoria, String tipocontrato,
			String nsegsoc, String numtel, String fecbaja, String refCatastro) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.dni = dni;
		this.fecnac = fecnac;
		this.direccion = direccion;
		this.ctacte = ctacte;
		this.estadocivil = estadocivil;
		this.sexo = sexo;
		this.fecalta = fecalta;
		this.categoria = categoria;
		this.tipocontrato = tipocontrato;
		this.nsegsoc = nsegsoc;
		this.numtel = numtel;
		this.fecbaja = fecbaja;
		this.refCatastro = refCatastro;
	}
    
    

}
