package core.Spring.DI;

public class Airtel {

	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void display() {
		service.service();
	}
}
