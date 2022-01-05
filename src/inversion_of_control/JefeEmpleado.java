package inversion_of_control;

public class JefeEmpleado implements Empleado {

	private CreacionInforme informeNuevo;
	private String nombreEmpresa;
	private String email;

	// Creacion de constructor que inyecta la dependencia
	public JefeEmpleado(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestiono las tareas de mis empleados";
	}

	@Override
	public String getInforme() {
		return "Informe presentado por jefe: " + informeNuevo.getInforme();
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
