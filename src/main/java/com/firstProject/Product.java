package com.firstProject;

import java.time.LocalDateTime;

public class Product {

    String Id;

    String name;

    LocalDateTime expiryDate;

    Integer quantity;

    String wareHouseZone;

    public Product() {
    }

    public Product(String id, String name, LocalDateTime expiryDate, Integer quantity, String wareHouseZone) {
        Id = id;
        this.name = name;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.wareHouseZone = wareHouseZone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getWareHouseZone() {
        return wareHouseZone;
    }

    public void setWareHouseZone(String wareHouseZone) {
        this.wareHouseZone = wareHouseZone;
    }
}
