package inversion_of_control;

public class SecretarioEmpleado implements Empleado{
	
	private CreacionInforme informeNuevo;
	private String nombreEmpresa;
	private String email;
	
	@Override
	public String getTareas() {
		return "Gestiono la documentacion del jefe";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por secretario: " + informeNuevo.getInforme();
	}

	public void setInformeNuevo(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
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
