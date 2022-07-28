package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerData {
	private List<Customer> customers;

	public CustomerData() {
		customers = new ArrayList<Customer>();
	}

	public void add(Customer customer) {
		customers.add(customer);

	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "CustomerData [customers=" + customers + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerData other = (CustomerData) obj;
		return Objects.equals(customers, other.customers);
	}

}
