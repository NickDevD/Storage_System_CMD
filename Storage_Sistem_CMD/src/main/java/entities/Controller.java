package entities;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    List<Product> products;

    public Controller() {
        products = new ArrayList<>();
    }

    // --- Métodos de Operação ---

    public void addProduct(Product product) {
        if(product != null) {
            products.add(product);
            System.out.println("Product " + product.getName() + " added with success!");
        }else {
            System.out.println("Error adding product!");
        }
    }

    public void removeProduct(int productID) {
        Product productToRemove = null;
        for(Product p : products){
            if(p.getId() == productID){
                productToRemove = p;
                break;
            }
        }
        if(productToRemove != null){
            products.remove(productToRemove);
            System.out.println("Product " + productToRemove.getName() + " removed with success!");
        }else {
            System.out.println("Product not found!");
        }
    }

    public void localizeProduct(int productID){
        Product productToLocate = null;
        for (Product l : products){
            if(l.getId() == productID){
                productToLocate = l;
                break;
            }
        }
        if(productToLocate != null){
            System.out.println("Product found!");
            System.out.println("Name: " + productToLocate.getName());
            System.out.println("ID: " + productToLocate.getId());
        }else {
            System.out.println("Product not found!");
        }
    }

    int sequence = 0;
    public void listProducts(){
        for (Product p : products){
            sequence++;
            System.out.println(sequence + "." + p.getName());
        }
    }

}
