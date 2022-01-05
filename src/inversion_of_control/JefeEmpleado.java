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
	
	//Crear metodo init, ejecuta tareas antes de que el bean este disponible
	
	public void init() {
		System.out.println("Metodo init, instrucciones antes de que el bean este listo");
	}
	
	//crear metodo destroy, ejecuta tareas despues de que el bean haya sido utilizado
	
	public void destroy() {
		System.out.println("Metodo destroy, instrucciones despues de utilizar el bean");
	}
	
}
