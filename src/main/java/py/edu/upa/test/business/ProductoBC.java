package py.edu.upa.test.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import py.edu.upa.test.dao.ProductoDAO;
import py.edu.upa.test.entity.Producto;

@Stateless
public class ProductoBC {

	@Inject
	private ProductoDAO dao;
	
	public List<Producto> find() {
		return dao.find();
	}
	public Producto findById(Integer id_producto) {
		return dao.findById(id_producto);
	}
	public void insert(Producto p) {
		dao.insert(p);
	}
	public void update(Integer id_producto, Producto p) {
		dao.update(id_producto, p);
	}
	public void delete(Integer id_producto) {
		dao.delete(id_producto);
	}
	public List<Producto> getWithFilter(String filter){
		return dao.findWithFilter(filter);
	}
	public List<Producto> getWithCategoria(String descripcionCategoria){
		return dao.findByCategoria(descripcionCategoria);
	}
}
