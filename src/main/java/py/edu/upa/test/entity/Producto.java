package py.edu.upa.test.entity;

import java.io.Serializable;
import javax.persistence.*;

import py.edu.upa.test.entity.Categoria;
import py.edu.upa.test.entity.Proveedor;
import py.edu.upa.test.entity.Producto_estado;
import java.sql.Timestamp;

@Entity
@Table(name = "producto", schema = "public")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "producto_id_producto_seq", sequenceName = "producto_id_producto_seq", allocationSize = 1, schema= "public")
    @GeneratedValue(generator = "producto_id_producto_seq")
	private Integer id_producto;

	@Column
	private String nombre;
	
	@Column
	private Integer precio;
	
	@JoinColumn(name = "id_producto_estado")
	@ManyToOne
	private Producto_estado productoEstado;
	
	@JoinColumn(name = "id_proveedor")
	@ManyToOne
	private Proveedor proveedor;
	
	@JoinColumn (name = "id_categoria")
	@ManyToOne
	private Categoria categoria;
	
	@Column(name = "fecha_de_compra")
	private Timestamp fechaCompra;
	
	@Column
	private String image;
	
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

	public Producto_estado getIdProductoEstado() {
		return productoEstado;
	}

	public void setIdProductoEstado(Producto_estado productoEstado) {
		this.productoEstado = productoEstado;
	}

	public Proveedor getIdProveedor() {
		return proveedor;
	}

	public void setIdProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
