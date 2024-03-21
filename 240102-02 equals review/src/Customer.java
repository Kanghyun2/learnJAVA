
public class Customer {
	private String name;
	private String phoneNumber;
	private int roomNumber;
	
	public Customer(String name, String phoneNumber, int roomNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.roomNumber = roomNumber; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + roomNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		} else if (!phoneNumber.equals(other.phoneNumber)) {
			return false;
		}
		return true;
	}
	
	public boolean equalsStrict(Customer target) {
		if(this.equals(target) && this.roomNumber == target.roomNumber) {
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + ", roomNumber=" + roomNumber + "]";
	}
	
	
}
