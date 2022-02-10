package cigma.pfe.applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.application.controller.ClientsController;
import cigma.pfe.application.model.Clients;

public class MonApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ClientsController ctrl = (ClientsController) ctx.getBean("idCtrl");
		
		Clients c = new Clients("c1");
		ctrl.save(c);

	}

}
