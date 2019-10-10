package py.edu.upa.test.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "categorias", schema = "public")
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id_categoria;
	
	@Column
	private String descripcion;
	
	public Categoria () {
	}

	public Integer getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
