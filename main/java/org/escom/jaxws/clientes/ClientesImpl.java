package org.escom.jaxws.clientes;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "org.escom.jaxws.clientes.Clientes")
public class ClientesImpl implements Clientes {
	
	static List<Cliente> clientes = new ArrayList<>();

	@Override
	public Cliente agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		return cliente;
	}

	@Override
	public List<Cliente> obtenerClientes() {
		
		return clientes;
	}

	@Override
	public Cliente eliminarCliente(int id) {
		
		return clientes.remove(id);
	}

	@Override
	public Cliente actualizarCliente(int id, Cliente cliente) {
		
		return clientes.set(id,cliente);
	}

	@Override
	public Cliente obtenerClienteId(int id) {
		// TODO Auto-generated method stub
		return clientes.get(id);
	}

}
