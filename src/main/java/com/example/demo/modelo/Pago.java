package com.example.demo.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="pago")
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pag")
	@SequenceGenerator(name = "seq_pag",sequenceName = "seq_pag",allocationSize = 1)
	@Column(name = "pag_id")
	private Integer id;
	
	@Column(name = "pag_tarjeta")
	private String tarjeta;

    @OneToOne(mappedBy = "pago", cascade = CascadeType.ALL)
    private Renta renta;
	
	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public Renta getRenta() {
		return renta;
	}

	public void setRenta(Renta renta) {
		this.renta = renta;
	}

	@Override
	public String toString() {
		return "Pago [id=" + id + ", tarjeta=" + tarjeta + ", renta=" + renta + "]";
	}
	
	
	
	
	

}
