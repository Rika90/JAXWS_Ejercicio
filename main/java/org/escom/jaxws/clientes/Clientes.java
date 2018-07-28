package org.escom.jaxws.clientes;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface Clientes {

	public Cliente agregarCliente(Cliente cliente);
	public List<Cliente>obtenerClientes();
	public Cliente eliminarCliente(int id);
	public Cliente actualizarCliente(int id, Cliente cliente);
	
	public Cliente obtenerClienteId(int id);
}
