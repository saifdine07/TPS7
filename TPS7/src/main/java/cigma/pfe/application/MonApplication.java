package cigma.pfe.application;

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
		
		ctrl.save(new Clients("OMAR"));
		ctrl.save(new Clients("SIHAM"));
		ctrl.save(new Clients("AHMED"));
		ctrl.save(new Clients("FARAH"));
		// Test modify use case for client with id==1
		ctrl.update(new Clients(6,"new Name"));
		
		ctrl.delete(new Clients(8));
		
		ctrl.findById(2);
		
		

	}

}
