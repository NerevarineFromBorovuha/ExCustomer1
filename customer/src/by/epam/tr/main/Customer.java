package by.epam.tr.main;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
	/*
	 * Создать класс Customer, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий коллекцию типа Customer, с подходящими конструкторами и
	 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
	 * 
	 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
	 * номер банковского счета. Найти и вывести: a) список покупателей в алфавитном
	 * порядке; b) список покупателей, у которых номер кредитной карточки находится
	 * в заданном интервале
	 */
	int id;
	String name;
	String surname;
	String address;
	int creditCard;
	int bankAccount;

	public Customer() {
		this(0, "", "", "", 0, 0);
	}

	public Customer(int id, String name, String surname, String address, int creditCard, int bankAccount) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", address=" + address
				+ ", creditCard=" + creditCard + ", bankAccount=" + bankAccount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bankAccount, creditCard, id, name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && bankAccount == other.bankAccount
				&& creditCard == other.creditCard && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public int compareTo(Customer o) {
		return name.compareTo(o.name);
		

	}

}
