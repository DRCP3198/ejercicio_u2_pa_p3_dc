package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.modelo.Renta;
import com.example.demo.repository.IRentaRepo;

public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IRentaRepo iRentaRepo;
	@Override
	public void agregar(Renta renta) {
		// TODO Auto-generated method stub
		this.iRentaRepo.insertar(renta);
	}

}
