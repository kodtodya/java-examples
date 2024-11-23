package com.kodtodya.practice.rating.system.model;

public class Review {
	public int id;
	public String heading;
	public String description;
	public int rating;

	@Override
	public String toString() {
		return "Review{" +
				"id=" + id +
				", heading='" + heading + '\'' +
				", description='" + description + '\'' +
				", rating=" + rating +
				'}';
	}
}