package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="renta")

public class Renta {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_ren") 
	@SequenceGenerator(name="seq_ren",sequenceName="seq_ren",allocationSize = 1)
	@Column(name ="ren_id")
	private Integer id;
	
	@Column(name ="ren_fecha")
	private LocalDateTime fecha;
	
	@Column(name ="ren_numeroDias")
	private Integer numeroDias;
	
	@Column(name ="ren_valor")
	private BigDecimal valor;

	@OneToOne
	@JoinColumn(name ="renta_id_pago")
	private Pago pago;
	
	@ManyToOne
	@JoinColumn(name ="renta_id_auto")
	private Automovil automovil;
	
	@ManyToOne
	@JoinColumn(name = "renta_id_cliente")
	private Cliente cliente;
	
	
	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Integer getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(Integer numeroDias) {
		this.numeroDias = numeroDias;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Automovil getAutomovil() {
		return automovil;
	}

	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", numeroDias=" + numeroDias + ", valor=" + valor + ", pago="
				+ pago + ", automovil=" + automovil + ", cliente=" + cliente + "]";
	}
	
	

}
