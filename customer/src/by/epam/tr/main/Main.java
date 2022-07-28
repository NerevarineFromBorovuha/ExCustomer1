package by.epam.tr.main;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		CustomerData customerData = new CustomerData();
		customerData.add(new Customer(1, "Ivan", "Ivanov", "Minsk", 84536, 80953));
		customerData.add(new Customer(2, "Petr", "Petrov", "Moscow", 46897, 41251));
		customerData.add(new Customer(3, "Sidor", "Sidorov", "Petersburg", 25675, 87065));
		customerData.add(new Customer(4, "Begun", "Begunov", "Brest", 25686, 76978));
		customerData.add(new Customer(5, "Dmitriy", "Hohlov", "Minsk", 34654, 67468));
		customerData.add(new Customer(6, "Taras", "Tarasov", "Minsk", 85467, 67943));
		customerData.add(new Customer(7, "Kekov", "Pricolistov", "Petersburg", 12578, 97856));
		customerData.add(new Customer(8, "Naruto", "Uzumaki", "Moscow", 74341, 97857));
		customerData.add(new Customer(9, "Ivan", "Chai", "Minsk", 75247, 34579));
		customerData.add(new Customer(10, "Stepan", "Beglov", "Moscow", 85364, 25657));

		CustomerLogic logic = new CustomerLogic();
		List<Customer> result = logic.listByCard(customerData.getCustomers());
		for (Customer cus : result) {
			System.out.println("Name: " + cus.name + " Surname: " + cus.surname + " Card number: " + cus.creditCard);
		}

		System.out.println("List by Name");

		List<Customer> result1 = logic.listBySort(customerData.getCustomers());
		for (Customer cus : result1) {
			System.out.println("Name: " + cus.name + " Surname: " + cus.surname + " Card number: " + cus.creditCard);
		}

	}

}
