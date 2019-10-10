package py.edu.upa.test.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import py.edu.upa.test.dao.Producto_estadoDAO;
import py.edu.upa.test.entity.Producto_estado;

@Stateless
public class Producto_estadoBC {

	@Inject
	private Producto_estadoDAO dao;
	
	public List<Producto_estado> find() {
		return dao.find();
	}
	
	public Producto_estado findById(Integer id_producto_estado) {
		return dao.findById(id_producto_estado);
	}
	public void update(Integer id_producto_estado, Producto_estado productoEstado) {
		dao.update(id_producto_estado, productoEstado);
	}
//	public List<Producto_estado> findWithFilter(String filter) {
//		return dao.findWithFilter(filter);
//	}
}
