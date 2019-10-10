package py.edu.upa.test.ws;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import py.edu.upa.test.business.ProveedorBC;
//import py.edu.upa.test.entity.Proveedor;

@Path("proveedor")
@RequestScoped
public class ProveedorService {

	@Inject
	private ProveedorBC bc;

//	http://localhost:8080/rest/productos
	@GET
	@Produces("application/json")
	public Response getAll() {
		try {
			return Response.ok().entity(bc.find()).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("ERROR_GENERICO")
					.build();
		}
	}
//	http://localhost:8080/rest/proveedors
//	@POST
//	@Consumes({ "application/json" })
//	@Produces({ "application/json" })
//	public Response add(Proveedor p) {
//		try {
//			bc.insert(p);
//			return Response.ok().entity(p).build();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("ERROR_GENERICO").build();
//		}
//	}

//	@GET
//	@Path("/{id_proveedor: \\d+}")
//	@Produces({ "application/json" })
//	public Response get(@PathParam("id_proveedor") Integer id_proveedor) {
//		try {
//			return Response.ok().entity(bc.findById(id_proveedor)).build();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("ERROR_GENERICO").build();
//		}
//	}
	
//	@PUT
//	@Path("/{id_proveedor: \\d+}")
//	@Consumes({"application/json"})
//	@Produces({"application/json"})
//	public Response update(@PathParam("id_proveedor") Integer id_proveedor, Proveedor p) {
//		try {
//			bc.update(id_proveedor, p);
//			return Response.ok().entity("OK").build();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
//					.entity("ERROR_GENERICO")
//					.build();
//		}
//	}
}
