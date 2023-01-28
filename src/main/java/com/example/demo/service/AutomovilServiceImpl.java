package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImpl  implements IAutomovilService{

	
	@Autowired
	private IAutomovilRepo automovilRepo;
	
	@Autowired
	private IClienteService clienteService;
	
	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);
	}

	@Override
	public void realizarRenta(String placa, String cedula, Integer numDias, String numTarjeta) {
		// TODO Auto-generated method stub
		Automovil auto = this.automovilRepo.buscar(placa);
		Cliente cli = this.clienteService.encontrar(cedula);
		
	}
	
	


}
