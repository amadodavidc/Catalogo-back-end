package py.edu.upa.test.ws;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import py.edu.upa.test.business.CategoriaBC;


@Path("tasks")
public class CategoriaService {

	@PersistenceContext
	EntityManager entityManager;

	@Inject
	private CategoriaBC bc;

	@GET
	@Produces("application/json")
	public Response getAll() {
		try {
			return Response.ok().entity(bc.find()).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("ERROR_GENERICO").build();
		}
	
}
}