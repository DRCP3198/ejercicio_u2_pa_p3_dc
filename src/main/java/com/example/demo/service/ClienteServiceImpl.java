package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IClienteRepo;

@Service
public class ClienteServiceImpl  implements IClienteService{

	@Autowired
	private IClienteRepo clienteRepo;
	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertar(cliente);
	}

	@Override
	public void modificar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizar(cliente);
	}

	@Override
	public Cliente encontrar(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscar(cedula);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.clienteRepo.borrar(cedula);
	}

}
