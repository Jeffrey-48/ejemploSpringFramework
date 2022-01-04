package inversion_of_control;

public class SecretarioEmpleado implements Empleado{
	
	private CreacionInforme informeNuevo;
	
	
	//Creacion de constructor que inyecta la dependencia
	public SecretarioEmpleado(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		return "Gestiono la documentacion del jefe";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por secretario: " + informeNuevo.getInforme();
	}

}
