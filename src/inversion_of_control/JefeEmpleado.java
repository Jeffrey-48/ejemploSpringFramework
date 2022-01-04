package inversion_of_control;

public class JefeEmpleado implements Empleado {

	private CreacionInforme informeNuevo;

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

}
