package by.epam.tr.main;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class CustomerLogic {

	public boolean afterEnterCard(Customer cust) {
		int x = 40000;
		int y = 80000;
		int customer = cust.creditCard;
		if (customer > x && customer < y) {
			return true;
		} else {
			return false;
		}
	}

	public List<Customer> listByCard(List<Customer> cust) {
		List<Customer> result = new ArrayList<Customer>();
		for (int i = 0; i < cust.size(); i++) {
			Customer c = cust.get(i);
			if (afterEnterCard(c)) {
				result.add(c);

			}
		}
		return result;
	}

	public List<Customer> listBySort(List<Customer> cust) {
		List<Customer> result = new ArrayList<Customer>();
		result = cust;

		Collections.sort(result);
		return result;
	}

}
