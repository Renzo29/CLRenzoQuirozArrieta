package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.InterfaceService.IClienteService;
import org.cibertec.edu.pe.entity.Cliente;
import org.cibertec.edu.pe.interfaces.ICliente;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteService implements IClienteService {
	
	@Autowired
	private ICliente data;
	
	@Override
	public List<Cliente> Listado() {
		
		return (List<Cliente>)data.findAll();
	}

	@Override
	public int Grabar(Cliente ObjC) {
		int rpta = 0;
		Cliente c = data.save(ObjC);
		if(!c.equals(null))rpta = 1;
		return rpta;
	}

}
