package com.firstProject;

import com.firstProject.InventoryOperations;
import com.firstProject.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryOperationsTest {

    static InventoryOperations operations = new InventoryOperations();

    static List<Product> products = new ArrayList<>();

    private static Product addProduct(String id, String name, LocalDateTime expiryDate, Integer quantity, String warehouseZone) {
        return new Product(id, name, expiryDate, quantity, warehouseZone);
    }

    private static void createSampleData() {
        Object[][] data = {
                {"101", "Chocolates", 5, 10, "A"},
                {"102", "Ice Creams", 4, 20, "B"},
                {"103", "Flowers", 3, 30, "C"},
                {"104", "Eggs", 2, 40, ""},
                {"105", "Meat", 5, 50, ""},
                {"106", "Snickers", 6, 60, "E"},
                {"107", "Fruits", 7, 70, "F"},
                {"108", "Vegetables", 8, 80, "G"},
                {"109", "Salads", 9, 90, "H"},
                {"110", "Smoothies", 10, 100, "A"}
        };

        for (Object[] entry : data) {
            products.add(addProduct(
                    (String) entry[0],
                    (String) entry[1],
                    LocalDateTime.now().plusDays((int) entry[2]),
                    (int) entry[3],
                    (String) entry[4]
            ));
        }
    }

    static void testInventoryOperations() {
        operations.filterExpiredProducts(Arrays.asList(products.get(0), products.get(1), products.get(4), products.get(5),  products.get(6),  products.get(7)) , 5);
        operations.groupZoneProducts(products);
        operations.sortExpiryDate(products);
    }

    static void testNullWareHouseZone() {
        operations.filterExpiredProducts(Arrays.asList(products.get(2), products.get(3)), 1);
        operations.groupZoneProducts(products);
        operations.sortExpiryDate(products);
    }

    public static void main(String[] args) {
        createSampleData();
        testInventoryOperations();
        testNullWareHouseZone();
    }

}
