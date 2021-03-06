package daoc.soapclient;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapClientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		wsimport -keep -p daoc.soapclient http://localhost:8080/empleados?wsdl
		
//        URL url = new URL("http://localhost:8080/empleados?wsdl");
//        EmpleadoServiceService servicio = new EmpleadoServiceService(url);
        
        EmpService servicio = new EmpService();// En el wsdl: service name="EmpService"
        Emp proxy = servicio.getEmpPort();// En el wsdl: portType name="Emp"; port name="EmpPort" (con el prefijo get)
 
        proxy.createEmpleado("Diego", "profe");
        proxy.createEmpleado("Vero", "jefa");
        
        List<Empleado> empleados = proxy.getAllEmpleados();
        empleados.forEach(e -> System.out.println(String.format("Emp.[%d, %s, %s]", e.getId(), e.getNombre(), e.getCargo())));        
	}

}
