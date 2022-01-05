package inversion_of_control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		//carga de xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		//peticion de beans al contenedor spring 
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		//imprimimos los objetos y vemos que el espacio de memoria es el mismo
		System.out.println(maria);
		System.out.println(pedro);
		if (maria==pedro) {
			System.out.println("Apuntan al mismo objeto");
		}else {
			System.out.println("No apuntan a el mismo objeto");
		}
	}

}
