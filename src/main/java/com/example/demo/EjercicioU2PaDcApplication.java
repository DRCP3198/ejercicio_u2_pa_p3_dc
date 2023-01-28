package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.service.IAutomovilService;
import com.example.demo.service.IClienteService;

@SpringBootApplication
public class EjercicioU2PaDcApplication  implements CommandLineRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaDcApplication.class, args);
	}

	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IAutomovilService automovilService;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Dillan");
		cliente.setCedula("1751457162");
		
		List<Renta> rentaCli = new ArrayList<>();
		Renta renta = new Renta();
		renta.setNumeroDias(15);
		renta.setFecha(LocalDateTime.now());
		renta.setCliente(cliente);
		rentaCli.add(renta);
		
		
		Automovil automovil = new Automovil();
		automovil.setPlaca("PDA308");
		automovil.setValorPorDia(new BigDecimal(25));
		renta.setAutomovil(automovil);
		
		this.clienteService.agregar(cliente);
		this.automovilService.agregar(automovil);
		
		
		
		
	}

}
