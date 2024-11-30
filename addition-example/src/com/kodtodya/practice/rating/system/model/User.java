package com.kodtodya.practice.rating.system.model;

public class User {
	public int id;
	public String firstName;
	public String lastName;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}



