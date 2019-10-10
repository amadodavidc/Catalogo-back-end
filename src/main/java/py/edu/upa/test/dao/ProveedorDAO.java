package py.edu.upa.test.dao;

import java.util.List;

import javax.ejb.Stateless;
//import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import py.edu.upa.test.entity.Proveedor;

@Stateless
public class ProveedorDAO {
	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Proveedor> findWithFilter(String filter) {

		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Proveedor.class);

		criteria.add(Restrictions.and(Restrictions.ilike("description", filter),
				Restrictions.or(Restrictions.eq("deleted", false), Restrictions.isNull("deleted"))));

		return criteria.list();

	}

	@SuppressWarnings("unchecked")
	public List<Proveedor> find() {

		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Proveedor.class);

//		criteria.add(Restrictions.or(Restrictions.eq("deleted", false), Restrictions.isNull("deleted")));

		return criteria.list();

	}

	public Proveedor findById(Integer id_proveedor) {

		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Proveedor.class);

		criteria.add(Restrictions.eq("id_proveedor", id_proveedor));

		return (Proveedor) criteria.uniqueResult();

	}

	public void insert(Proveedor p) {
		entityManager.persist(p);
	}

	public void update(Integer id, Proveedor p) {
		Proveedor prov = findById(id);
		prov.setNombre(p.getNombre());
		prov.setRUC(p.getRUC());
		prov.setDireccion(p.getDireccion());
		prov.setCorreoElectronico(p.getCorreoElectronico());
		prov.setNumeroTelefonico(p.getNumeroTelefonico());
		entityManager.merge(p);
	}
}