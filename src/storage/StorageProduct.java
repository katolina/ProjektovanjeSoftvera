/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class StorageProduct {
    List<Product> products;

    public StorageProduct() {
    products = new ArrayList<Product>();
    }

    public List<Product> getAllProducts() {
        return products;
    }
    
   public void save(Product product){
       products.add(product);
   }
}
