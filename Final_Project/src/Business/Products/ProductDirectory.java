/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Products;
import java.util.ArrayList;
/**
 *
 * @author rajsarode
 */
public class ProductDirectory {
    private ArrayList<Product> productsArray;
    
    public ProductDirectory(){
        productsArray = new ArrayList();
    }

    public ArrayList<Product> getProducts() {
        return productsArray;
    }

    public void setProducts(ArrayList<Product> productsArray) {
        this.productsArray = productsArray;
    }
    
    public Product newProduct(String prodName, double price, int quantity){
        Product product = new Product(prodName, price, quantity);
        productsArray.add(product);
        return product;
    }
    
    public void removeProduct(Product product){
        productsArray.remove(product);
    }
}
