package org.cibertec.edu.pe.InterfaceService;

import java.util.List;

import org.cibertec.edu.pe.entity.Cliente;

public interface IClienteService {
	public List<Cliente> Listado();
	public int Grabar(Cliente ObjC);
}
