package inversion_of_control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleado juan = contexto.getBean("miEmpleado", Empleado.class);
		System.out.println("Inyeccion por constructor");
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		System.out.println("Inyeccion por setter");
		SecretarioEmpleado carlos = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(carlos.getTareas());
		System.out.println(carlos.getInforme());
		System.out.println(carlos.getEmail());
		System.out.println(carlos.getNombreEmpresa());
		contexto.close();
	}

}
