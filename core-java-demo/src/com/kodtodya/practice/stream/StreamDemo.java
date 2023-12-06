package com.kodtodya.practice.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        StreamDemo streamDemo = new StreamDemo();
        List<Product> products = streamDemo.generateListData();

        //-----------------------------------------------------------
        // without streams
        List<Float> productPriceList = new ArrayList<Float>();
        for (Product product : products) {
            // filtering data of list
            if (product.price() > 30000) {
                productPriceList.add(product.price());    // adding price to a productPriceList
            }
        }
        System.out.println("Without streams: " + productPriceList);   // displaying data
        //-----------------------------------------------------------

        // using streams
        List<Float> productPriceList2 = products.stream()
            .parallel() // parallel processing
            .filter(product -> product.price() > 30000)// filtering data
            .map(product -> product.price())// fetching price
            .toList(); // collecting as list
            //.collect(Collectors.toList()); // collecting as list

        System.out.println("With streams: " + productPriceList2);

        //-----------------------------------------------------------
        Map<Integer, Product> productMap = streamDemo.generateMapData();

        // iterating over map using iterator
        Iterator<Entry<Integer, Product>> iterator = productMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Product> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("---------------------------------");

        // parallel stream
        productMap.entrySet().parallelStream().forEach(entry -> {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        });

        System.out.println("Map with streams: " + productMap);

        // set demonstration
        Set<Product> newFilteredProductSet = productMap.entrySet().stream()
            .filter(entry -> entry.getKey() < 5)
            .map(Map.Entry::getValue)
            .limit(3) // limit demonstration
            .collect(Collectors.toSet());
        System.out.println("Set with streams: " + newFilteredProductSet);
    }

    // externalised data generation
    private List<Product> generateListData() {
        List<Product> products = new ArrayList<>();
        //Adding Products
        products.add(new Product(1, "HP Laptop", 25000f));
        products.add(new Product(2, "Dell Laptop", 30000f));
        products.add(new Product(3, "Lenevo Laptop", 28000f));
        products.add(new Product(4, "Sony Laptop", 28000f));
        products.add(new Product(5, "Apple Laptop", 90000f));
        return products;
    }

    // externalised data generation
    private Map<Integer, Product> generateMapData() {
        // collect() & Collectors.toMap() demonstration
        // Function.identity() usage
        return generateListData().stream()
            .collect(Collectors.toMap(Product::id, Function.identity()));
    }
}
