package bt1;

public class Customer {
	String Name;
	String Location;

	public Customer(String name, String location) {
		this.Name = name;
		this.Location = location;
	}

	void sendOrder() {
	}

	void receiveOrder() {
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		this.Location = location;
	}

}
