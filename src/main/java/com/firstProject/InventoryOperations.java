package com.firstProject;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class InventoryOperations {

    // Method to filter the products expiring in 5 days

    public void filterExpiredProducts(List<Product> products, int expireTime) {

        System.out.println("Products Expired in "+ expireTime +" days are");
        List<Product> toBeExpired = products.stream().filter(product ->
                ChronoUnit.DAYS.between(LocalDateTime.now(), product.getExpiryDate()) < expireTime).toList();

        toBeExpired.forEach(product -> System.out.println(product.getName()));
    }

    // Method to group the products based on their zones and sum up their quantity
    public void groupZoneProducts(List<Product> products) {

        System.out.println("Group the products based on Zone and print the sum of quantities");
        Map<String, Integer> zoneSum = products.stream().collect(Collectors.groupingBy(
                product -> Optional.ofNullable(product.getWareHouseZone())
                        .filter(p -> !p.trim().isEmpty())
                        .orElse("Default"),
                Collectors.summingInt(Product::getQuantity)
        ));
        zoneSum.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public void sortExpiryDate(List<Product> products) {

        System.out.println("Products sorted in the ascending order of the Expired Date");

        List<Product> sortProducts = new ArrayList<>(products);
        sortProducts.sort(Comparator.comparing(Product::getExpiryDate));
        sortProducts.forEach(p -> System.out.println(p.getName() + " - " + p.getExpiryDate()));
    }

}
