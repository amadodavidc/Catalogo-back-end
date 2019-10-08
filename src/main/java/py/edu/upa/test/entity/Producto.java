package py.edu.upa.test.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Producto", schema = "public")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id_producto;

	@Column
	private String nombre;
	
	@Column
	private Integer precio;
	
	@Column(name = "stock_total")
	private Integer stockTotal;
	
	@Column(name = "stock_actual")
	private Integer stockActual;
	
	@Column(name =  "id_producto_estado")
	private Integer idProductoEstado;
	
	@Column(name = "id_proveedor")
	private Integer idProveedor;
	
	@Column(name = "id_categoria")
	private Integer idCategoria;
	
	@Column
	private Boolean favorito;
	
	@Column
	private Boolean deleted;
	
	public Producto() {
	}

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getStockTotal() {
		return stockTotal;
	}

	public void setStockTotal(Integer stockTotal) {
		this.stockTotal = stockTotal;
	}

	public Integer getStockActual() {
		return stockActual;
	}

	public void setStockActual(Integer stockActual) {
		this.stockActual = stockActual;
	}

	public Integer getIdProductoEstado() {
		return idProductoEstado;
	}

	public void setIdProductoEstado(Integer idProductoEstado) {
		this.idProductoEstado = idProductoEstado;
	}

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Boolean getFavorito() {
		return favorito;
	}

	public void setFavorito(Boolean favorito) {
		this.favorito = favorito;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
}
