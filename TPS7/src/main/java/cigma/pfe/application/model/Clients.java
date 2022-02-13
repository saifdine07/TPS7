package cigma.pfe.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Clients {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	
	
	
	public Clients( String name) {
		
		this.name = name;
	}


	public Clients() {
		
	}
	
	


	public Clients(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public Clients(int id) {
		this.id = id;
	}
	
	

}
