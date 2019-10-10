package py.edu.upa.test.entity;

import java.io.Serializable;
import javax.persistence.*;

import py.edu.upa.test.entity.Categoria;
import py.edu.upa.test.entity.Proveedor;
import py.edu.upa.test.entity.Producto_estado;
import java.sql.Timestamp;

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
	
	@JoinColumn(name = "id_producto_estado")
	@ManyToOne
	private Producto_estado idProductoEstado;
	
	@JoinColumn(name = "id_proveedor")
	@ManyToOne
	private Proveedor idProveedor;
	
	@JoinColumn (name = "id_categoria")
	@ManyToOne
	private Categoria categoria;
	
	@Column(name = "fecha_compra")
	private Timestamp fechaCompra;
	
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

	public Producto_estado getIdProductoEstado() {
		return idProductoEstado;
	}

	public void setIdProductoEstado(Producto_estado idProductoEstado) {
		this.idProductoEstado = idProductoEstado;
	}

	public Proveedor getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Proveedor idProveedor) {
		this.idProveedor = idProveedor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Timestamp getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Timestamp fechaCompra) {
		this.fechaCompra = fechaCompra;
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
