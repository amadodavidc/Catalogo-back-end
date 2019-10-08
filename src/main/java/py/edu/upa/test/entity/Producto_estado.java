package py.edu.upa.test.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "producto_estado", schema = "publc")
public class Producto_estado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id_producto_estado;
	
	@Column
	private String descripcion;
	
	public Producto_estado() {
	}

	public Integer getId_producto_estado() {
		return id_producto_estado;
	}

	public void setId_producto_estado(Integer id_producto_estado) {
		this.id_producto_estado = id_producto_estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
