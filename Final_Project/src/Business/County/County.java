/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.County;

import Business.Order.Order;
import Business.Organization.Organization;
import Business.Products.ProductDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tanmayzope
 */
public class County extends Organization{
    
    private String county;
    private ProductDirectory productDirectory;
    private ArrayList<Order> ordersArray;

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    
    
    public County(String county) {
        super();
        this.county = county;
        this.productDirectory = new ProductDirectory();
        this.ordersArray = new ArrayList();
    }
    
    public void addOrder(Order order){
        this.ordersArray.add(order);
    }
    
    public ArrayList<Order> getOrders() {
        return ordersArray;
    }
    
    @Override
    public String toString() {
        return this.county;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
