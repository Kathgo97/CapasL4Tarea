package com.uca.capas.domain;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;


public class Product {
	
	@NotEmpty(message = "El campo no puede estar vacio")
	@Size(message= "El texto no puede ser de mas de 30 caracteres", max = 30)
	private String nombre;
	
	@NotEmpty(message = "El campo no puede estar vacio")
	@Size(message = "El texto no puede ser de mas de 30 caracteres", max = 30)
	private String marca;

	@NotEmpty(message = "El campo no puede estar vacio")
	@Size(message = "El texto no puede ser de mas de 30 caracteres", max = 30)
	private String descripcion;
	
	@NotNull(message = "El campo no puede estar vacio")
	@PositiveOrZero(message = "El campo no puede tener valores negativos")
	private BigDecimal precio;
	
	@NotEmpty(message = "El campo no puede estar vacio")
	@Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)", message = "El formato de fecha no es el correcto [dd/MM/yyyy]")
	private String fecha_de_expiracion;
	
	public Product() {
		
	}
	
	public Product(String p_nombre, String p_marca, String p_descripcion, BigDecimal p_precio, String p_fecha_de_expiracion) {
		this.nombre = p_nombre;
		this.marca = p_marca;
		this.descripcion = p_descripcion;
		this.precio = p_precio;
		this.fecha_de_expiracion = p_fecha_de_expiracion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public BigDecimal getPrecio() {
		return precio;
	}
	
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	public String getFecha_de_expiracion() {
		return fecha_de_expiracion;
	}
	
	public void setFecha_de_expiracion(String fecha_de_expiracion) {
		this.fecha_de_expiracion = fecha_de_expiracion;
	}
	
}

