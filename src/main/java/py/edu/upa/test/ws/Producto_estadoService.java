package py.edu.upa.test.ws;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
//import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import py.edu.upa.test.business.Producto_estadoBC;
//import py.edu.upa.test.entity.Producto_estado;

@Path("producto_estado")
@RequestScoped
public class Producto_estadoService {

	@Inject
	private Producto_estadoBC bc;
	
//	http://localhost:8080/rest/producto_estados
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
//	http:localhost:8080/rest/producto_estados/1
//	@GET
//	@Path("/{id_producto_estado: \\d+}")
//	@Produces({"application/json"})
//	public Response get(@PathParam("id_producto_estado") Integer id_producto_estado) {
//		try {
//			return Response.ok().entity(bc.findById(id_producto_estado)).build();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
//					.entity("ERROR_GENERICO")
//					.build();
//		}
//	}
	
//	http://localhost:8080/rest/producto_estados/1
//	@PUT
//	@Path("/{id_producto_estado: \\d+}")
//	@Consumes({"application/json"})
//	@Produces({"application/json"})
//	public Response update(@PathParam("id_producto_estado") Integer id_producto_estado, Producto_estado productoEstado) {
//		try {
//			bc.update(id_producto_estado, productoEstado);
//			return Response.ok().entity("OK").build();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
//					.entity("ERROR_GENERICO")
//					.build();
//		}
//	}
}
