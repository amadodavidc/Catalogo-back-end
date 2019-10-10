package py.edu.upa.test.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import py.edu.upa.test.entity.Producto_estado;

@Stateless
public class Producto_estadoDAO {
	@PersistenceContext
	EntityManager entityManager;
	
//	@SuppressWarnings("unchecked")
//	public List<Producto_estado> findWithFilter(String filter){
//		Session session = (Session) entityManager.getDelegate();
//		Criteria criteria = session.createCriteria(Producto_estado.class);
//		
//		criteria.add(Restrictions.and(
//				Restrictions.ilike("descripcion", filter)
//				));
//		return criteria.list();
//	}
	
	@SuppressWarnings("unchecked")
	public List<Producto_estado> find() {
		
		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Producto_estado.class);
		
		return criteria.list();
	}
	
	public Producto_estado findById(Integer id_producto_estado) {
		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Producto_estado.class);
		
		criteria.add(Restrictions.eq("id_producto_estado", id_producto_estado));
	
		return (Producto_estado) criteria.uniqueResult();
	}
	public void update(Integer id_producto_estado, Producto_estado productoEstado) {
		Producto_estado pe = findById(id_producto_estado);
		pe.setId_producto_estado(productoEstado.getId_producto_estado());
		pe.setDescripcion(productoEstado.getDescripcion());
		entityManager.merge(pe);
	}
}
