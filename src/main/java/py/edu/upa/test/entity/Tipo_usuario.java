package py.edu.upa.test.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tipo_usuario", schema = "public")
public class Tipo_usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id_tipo_usuario;
	
	@Column
	private String descripcion;
	
	public Tipo_usuario() {
	}

	public Integer getId_tipo_usuario() {
		return id_tipo_usuario;
	}

	public void setId_tipo_usuario(Integer id_tipo_usuario) {
		this.id_tipo_usuario = id_tipo_usuario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
