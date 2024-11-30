package com.kodtodya.practice.rating.system;

import com.kodtodya.practice.rating.system.model.Product;
import com.kodtodya.practice.rating.system.model.Review;
import com.kodtodya.practice.rating.system.model.User;
import com.kodtodya.practice.rating.system.service.ProductService;
import com.kodtodya.practice.rating.system.service.ReviewService;
import com.kodtodya.practice.rating.system.service.UserService;

public class ReviewSystemDemo {
    public static void main(String[] args) {
        System.out.println("*** E-Commerce Review System ***");

        UserService userService = new UserService();
        User user = userService.acceptUserData();

        ProductService productService = new ProductService();
        Product product = productService.acceptProductData();

        ReviewService reviewService = new ReviewService();
        Review review = reviewService.acceptReviewData();

        // completed all processing
        // print data
        System.out.println("User details are: " + user);
        System.out.println("product details are: " + product);
        System.out.println("review details are: " + review);
    }
}
