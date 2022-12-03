/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Produce;
import java.util.ArrayList;
/**
 *
 * @author rajsarode
 */
public class ProduceDirectory {
    private ArrayList<Produce> produceArray;
    
    public ProduceDirectory(){
        produceArray = new ArrayList();
    }

    public ArrayList<Produce> getProducts() {
        return produceArray;
    }

    public void setProducts(ArrayList<Produce> productsArray) {
        this.produceArray = productsArray;
    }
    
    public Produce newProduct(String prodName, double price, int quantity){
        Produce product = new Produce(prodName, price, quantity);
        produceArray.add(product);
        return product;
    }
    
    public void removeProduct(Produce product){
        produceArray.remove(product);
    }
}
