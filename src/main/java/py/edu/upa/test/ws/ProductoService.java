package py.edu.upa.test.ws;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import py.edu.upa.test.business.ProductoBC;
import py.edu.upa.test.entity.Producto;

@Path("producto")
@RequestScoped
public class ProductoService {
	@Inject
	private ProductoBC bc;
	
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
//	http://localhost:8080/rest/productos
	@POST
	@Consumes({"application/json"})
	@Produces({"application/json"})
	public Response add(Producto p) {
		try {
			bc.insert(p);
			return Response.ok().entity(p).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("ERROR_GENERICO")
					.build();
		}
	}
//	http://localhost:8080/rest/productos
	@GET
	@Path("/{id_producto: \\d+}")
	@Produces({"application/json"})
	public Response get(@PathParam("id_producto") Integer id_producto) {
		try {
			return Response.ok().entity(bc.findById(id_producto)).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("ERROR_GENERICO")
					.build();
		}
	}
//	http://localhost:8080/rest/productos/1
	@PUT
	@Path("/{id_producto: \\d+}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	public Response update(@PathParam("id_producto") Integer id_producto, Producto p) {
		try {
			bc.update(id_producto, p);
			return Response.ok().entity("OK").build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("ERROR_GENERICO")
					.build();
		}
	}
	@DELETE
	@Path("/{id_producto: \\d+}")
	@Produces({"application/json"})
	public Response delete(@PathParam("id_producto") Integer id_producto) {
		try {
			bc.delete(id_producto);
			return Response.ok().entity("OK").build();
		} catch (Exception e){
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("ERROR_GENERICO")
					.build();
		}
	}
//	http://localhost:8080/rest/producto/prueba?filter=xx
	@GET
	@Path("/pruebas")
	@Produces({"application/json"})
	public Response update(@QueryParam("filter") String filter) {
		try {
			return Response.ok().entity(bc.getWithFilter(filter)).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("ERROR_GENERICO")
					.build();
		}
	}
}
