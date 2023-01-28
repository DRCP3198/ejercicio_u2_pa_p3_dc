package com.example.demo.service;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {
	
	public void agregar(Automovil automovil);
	public void realizarRenta(String placa,String cedula,Integer numDias,String numTarjeta);

}
