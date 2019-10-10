package py.edu.upa.test.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import py.edu.upa.test.dao.CategoriaDAO;
import py.edu.upa.test.entity.Categoria;

@Stateless
public class CategoriaBC {

	@Inject
	private CategoriaDAO dao;
	
	public List<Categoria> find(){
		return dao.find();
	}
	public Categoria findById(Integer id_categoria) {
		return dao.findById(id_categoria);
	}
	public void update(Integer id_categoria, Categoria categoria) {
		dao.update(id_categoria, categoria);
	}
	public List<Categoria> getWithFilter(String filter) {
		return dao.findWithFilter(filter);
	}
}
