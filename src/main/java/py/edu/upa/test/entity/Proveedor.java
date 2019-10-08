package py.edu.upa.test.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name =  "proveedor", schema = "public")
public class Proveedor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id_proveedor;
	
	@Column
	private String nombre;
	
	@Column
	private String RUC;
	
	@Column
	private String direccion;
	
	@Column(name = "correo_electronico")
	private String correoElectronico;
	
	@Column(name = "numero_telefonico")
	private Integer numeroTelefonico;
	
	public Proveedor( ) {
	}

	public Integer getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(Integer id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRUC() {
		return RUC;
	}

	public void setRUC(String rUC) {
		RUC = rUC;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Integer getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(Integer numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
}
