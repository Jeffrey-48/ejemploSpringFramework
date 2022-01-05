package inversion_of_control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// carga de xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		//obtener Bean
		Empleado juan = contexto.getBean("miEmpleado", Empleado.class);
		System.out.println(juan.getInforme());
		//cerrar el contexto
		contexto.close();
	}

}
