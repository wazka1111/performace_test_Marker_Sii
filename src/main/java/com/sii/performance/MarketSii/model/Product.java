package com.sii.performance.MarketSii.model;

public class Product {
    private long id;
    private String name;
    private boolean available;

    public Product(long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", available= " + available +
                '}' +
                "\n";
    }
}
