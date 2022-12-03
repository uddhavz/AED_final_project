/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Vendor;

import Business.Order.Order;
import Business.Organization.Organization;
import Business.Produce.ProduceDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rajsarode
 */
public class Vendor extends Organization {
    private String vendorName;
    private ProduceDirectory productDirectory;
    private ArrayList<Order> ordersArray;

    public Vendor(String name) {
        super();
        this.vendorName = name;
        this.productDirectory = new ProduceDirectory();
        this.ordersArray = new ArrayList();
    }

    
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    
    public ProduceDirectory getProductDirectory() {
        return productDirectory;
    }
    
    public ArrayList<Order> getOrders() {
        return ordersArray;
    }

    public void addOrder(Order order) {
        this.ordersArray.add(order);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public String toString() {
        return this.vendorName;
    }
}
