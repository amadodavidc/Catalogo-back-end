package py.edu.upa.test.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
//import org.hibernate.criterion.Restrictions;

import py.edu.upa.test.entity.Categoria;
@Stateless

	
	public class CategoriaDAO {
		@PersistenceContext
		EntityManager entityManager;
		
//		@SuppressWarnings("unchecked")
//		public List<Categoria> findWithFilter(String filter){
//		Session session = (Session) entityManager.getDelegate();
//		Criteria criteria = session.createCriteria(Categoria.class);
//		
//		criteria.add(Restrictions.and(
//				Restrictions.ilike("descripcion", filter)
//				));
//		return criteria.list();
//		}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> find() {
		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Categoria.class);

		return criteria.list();
	}
	
//	public Categoria findById(Integer id_categoria) {
//		Session session = (Session) entityManager.getDelegate();
//		Criteria criteria = session.createCriteria(Categoria.class);
//	
//		criteria.add(Restrictions.eq("id_categoria", id_categoria));
//		
//		return (Categoria) criteria.uniqueResult();
//	}
//	public void update(Integer id_categoria, Categoria categoria) {
//		Categoria c = findById(id_categoria);
//		c.setId_categoria(categoria.getId_categoria());
//		c.setDescripcion(categoria.getDescripcion());
//	}
}
