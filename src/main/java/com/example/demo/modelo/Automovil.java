package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil")

public class Automovil {
	
	@Id
	/*@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_aut") 
	@SequenceGenerator(name="seq_aut",sequenceName="seq_aut",allocationSize = 1)*/
	@Column(name = "aut_placa")
	private String placa;
	
	@Column(name = "aut_valorPorDia")
	private BigDecimal valorPorDia;

	@OneToMany(mappedBy = "automovil", cascade = CascadeType.ALL)
	private List<Renta> renta;
	
	
	//SET y GET
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getValorPorDia() {
		return valorPorDia;
	}

	public void setValorPorDia(BigDecimal valorPorDia) {
		this.valorPorDia = valorPorDia;
	}

	public List<Renta> getRenta() {
		return renta;
	}

	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}

	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", valorPorDia=" + valorPorDia + "]";
	}
	
	
	
	
	

}
