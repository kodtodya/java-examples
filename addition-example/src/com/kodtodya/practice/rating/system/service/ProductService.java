package com.kodtodya.practice.rating.system.service;

import com.kodtodya.practice.rating.system.model.Product;

import java.util.Scanner;

public class ProductService {
    // void = blank
    public Product acceptProductData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter product id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls enter product name:");
        String name = scanner.nextLine();
        System.out.println("Pls enter product price:");
        double price = scanner.nextDouble();

        // initialize entity
        Product product = new Product();
        product.id = id;
        product.name = name;
        product.price = price;

        return product;
    }
}
