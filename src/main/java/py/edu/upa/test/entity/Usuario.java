package py.edu.upa.test.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "usuario", schema = "public")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id_usuario;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column(name = "e_mail")
	private String eMail;
	
	@Column(name = "num_telefonico")
	private Integer numTelefonico;
	
	@Column(name = "id_tipo_usuario")
	private Integer idTipoUsuario;

	public Usuario() {
	}
	
	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Integer getNumTelefonico() {
		return numTelefonico;
	}

	public void setNumTelefonico(Integer numTelefonico) {
		this.numTelefonico = numTelefonico;
	}

	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
}
