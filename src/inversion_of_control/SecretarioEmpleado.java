package inversion_of_control;

public class SecretarioEmpleado implements Empleado{

	@Override
	public String getTareas() {
		return "Gestiono la documentacion del jefe";
	}

}
