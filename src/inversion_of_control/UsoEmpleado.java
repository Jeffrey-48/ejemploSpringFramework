package inversion_of_control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleado juan = contexto.getBean("miEmpleado", Empleado.class);
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		contexto.close();
	}

}
