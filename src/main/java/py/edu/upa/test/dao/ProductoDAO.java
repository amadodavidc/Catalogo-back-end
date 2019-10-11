package py.edu.upa.test.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import py.edu.upa.test.entity.Producto;

@Stateless
public class ProductoDAO {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Producto> findWithFilter(String filter) {

		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Producto.class);
		
		criteria.add(Restrictions.and(
				Restrictions.ilike("nombre", filter),
				Restrictions.or(
						Restrictions.eq("deleted", false),
						Restrictions.isNull("deleted")
				)));
		
		return criteria.list();

	}
	
	@SuppressWarnings("unchecked")
	public List<Producto> find() {

		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Producto.class);
		
		criteria.add(Restrictions.or(
				Restrictions.eq("deleted", false),
				Restrictions.isNull("deleted")));
		
		return criteria.list();

	}
	
	public Producto findById(Integer id_producto) {

		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Producto.class);
		
		criteria.add(Restrictions.eq("id_producto", id_producto));
		
		return (Producto) criteria.uniqueResult();

	}
//	@SuppressWarnings ("unchecked")
//	public List<Producto> findByCategoria(String descripcionCategoria) {
//		
//		Session session = (Session) entityManager.getDelegate();
//		Criteria criteria = session.createCriteria(Producto.class);
//		criteria.createAlias("categoria", "categoria");
////		criteria.createAlias(associationPath, alias)
//		
////		criteria.add(Restrictions.eq("idCategoria", idCategoria));
//		criteria.add(Restrictions.and(
////				Restrictions.ilike(propertyName, value)
//				Restrictions.ilike("categoria.descripcion", descripcionCategoria),
//				Restrictions.or(
//						Restrictions.eq("deleted", false),
//						Restrictions.isNull("deleted")
//				)));
//		return criteria.list();
//
//	}
	
	public void insert(Producto p){
		entityManager.persist(p);
	}
	
	public void update(Integer id_producto, Producto producto){
		Producto p = findById(id_producto);
		p.setNombre(producto.getNombre());
		p.setPrecio(producto.getPrecio());
		p.setDisponible(producto.getDisponible());
		p.setProveedor(producto.getProveedor());
		p.setCategoria(producto.getCategoria());
		p.setFechaCompra(producto.getFechaCompra());
		p.setImage(producto.getImage());
		p.setFavorito(producto.getFavorito());
		p.setDeleted(producto.getDeleted());
		entityManager.merge(p);
	}
	
	public void delete(Integer id_producto){
		Producto p = findById(id_producto);
		p.setDeleted(true);
		entityManager.merge(p);
	}
}