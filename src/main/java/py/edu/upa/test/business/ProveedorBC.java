package py.edu.upa.test.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import py.edu.upa.test.dao.ProveedorDAO;
import py.edu.upa.test.entity.Proveedor;

@Stateless
public class ProveedorBC {

	@Inject
	private ProveedorDAO dao;
	
	public List<Proveedor> find() {
		return dao.find();
	}
	public Proveedor findById(Integer id_proveedor) {
		return dao.findById(id_proveedor);
	}
	public void insert(Proveedor p) {
		dao.insert(p);
	}
	public void update(Integer id_proveedor, Proveedor p) {
		dao.update(id_proveedor, p);
	}
}
