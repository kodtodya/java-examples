package com.kodtodya.practice.rating.system.service;

import com.kodtodya.practice.rating.system.model.Review;

import java.util.Scanner;

public class ReviewService {
    public Review acceptReviewData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter review id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls enter heading:");
        String heading = scanner.nextLine();
        System.out.println("Pls enter description:");
        String description = scanner.nextLine();
        System.out.println("Pls enter rating:");
        int rating = scanner.nextInt();

        // initialize entity
        Review review = new Review();
        review.id = id;
        review.heading = heading;
        review.description = description;
        review.rating = rating;
        return review;
    }
}
