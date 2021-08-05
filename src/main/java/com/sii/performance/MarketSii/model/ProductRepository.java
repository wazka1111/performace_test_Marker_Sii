package com.sii.performance.MarketSii.model;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class ProductRepository {
    private  List<Product> productList;

    public String findAll() {
        fillList();
        return showList(this.productList);
    }

    private  List<Product> fillList() {
        this.productList = new ArrayList<>();
        this.productList.add(new Product(1, "IPad", true));
        this.productList.add(new Product(2, "Lenovo xc3400", true));
        this.productList.add(new Product(3, "Acer 200", true));
        this.productList.add(new Product(4, "Toshiba 2b", true));
        this.productList.add(new Product(5, "IPad 2.0", true));
        this.productList.add(new Product(6, "IPhone 1", true));
        this.productList.add(new Product(7, "IPhone 2", true));
        this.productList.add(new Product(8, "IPhone 3", true));
        this.productList.add(new Product(9, "IPhone 6", true));
        this.productList.add(new Product(10, "LG 300x", true));
        this.productList.add(new Product(11, "LG 200x", true));
        this.productList.add(new Product(12, "Toshiba 201", true));
        this.productList.add(new Product(13, "XBox", true));
        this.productList.add(new Product(14, "PlayStation", true));
        this.productList.add(new Product(15, "Xaomi 6s", true));
        this.productList.add(new Product(16, "Samsung 200", true));
        this.productList.add(new Product(17, "Samsung 250", true));
        this.productList.add(new Product(18, "Samsung 350", true));
        this.productList.add(new Product(19, "Samsung 450", true));
        this.productList.add(new Product(20, "Electrolux 44", true));
        this.productList.add(new Product(21, "Electrolux 88", true));
        this.productList.add(new Product(22, "Tic 5G", true));
        this.productList.add(new Product(23, "Astronomy 5h", true));
        this.productList.add(new Product(24, "SpaceX 33", true));
        this.productList.add(new Product(25, "Mercury 12v", true));
        this.productList.add(new Product(26, "Logitech 4z", true));
        this.productList.add(new Product(27, "Logitech 5z", true));
        this.productList.add(new Product(28, "Epson 1", true));
        this.productList.add(new Product(29, "Epson L355l", true));
        this.productList.add(new Product(30, "Epson L55q", true));
        return this.productList;
    }
    public String showList(List<Product> products) {
        String result="";
        for (Product p : products) {
          result = result + p.toString() + "\n";
        }
        return result;
    }

    public String removeProduct() {
        int counter=0;
        Random random = new Random();
        int randInt = random.nextInt(1000000000-500000000);
        for (int i = 0; i<=randInt; i++) {
            int result = i*randInt-1000000+3-8-9-7-4-3-4-5-6-6-6-5-4-4-33-2-44-56-77-44+(4444*21222)-444499944;
            String result2 = String.valueOf(result);
            Long bigNumber = Long.valueOf(result2.length() * result2.length()*3);
            counter++;
        }
        System.out.println(counter);
        return " >>>>>>>>>>   Product list is empty  <<<<<<<<<<" + "Message_id_"+randInt;
    }

}
