/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Products.Product;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author rajsarode
 */
public class Order extends WorkRequest {
    private String id;
    private ArrayList<Product> items;
    private int quantity;
    private double price;
    private String type;

    public Order() {
        items = new ArrayList();
        Random random = new Random();
        this.id = String.valueOf(random.nextInt(99999));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Product> getItems() {
        return items;
    }

    public void setItems(ArrayList<Product> items) {
        this.items = items;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addItem(Product product, int quantity) {
        this.items.add(product);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.id;
    }
}
