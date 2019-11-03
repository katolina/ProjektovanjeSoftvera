/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Product;
import domain.User;
import java.util.List;
import javax.swing.JOptionPane;
import storage.StorageProduct;
import storage.StorageUser;

/**
 *
 * @author Korisnik
 */
public class Controller {
    
    private static Controller instance;
   
    private StorageUser storageUser;
    private StorageProduct storageProduct;

    public Controller() {
        storageUser = new StorageUser();
        storageProduct = new StorageProduct();
    }

    public static Controller getInstance() {
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }
    
    
    public void saveProduct(Product product){
        storageProduct.save(product);
    }
    
    public List<Product> getAllProducts(){
        return storageProduct.getAllProducts();
    }
    
    public User login(String username, String password) throws Exception{
        List<User> users = storageUser.getAll();
        for(User user: users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
            return user;
            }
            else{
                throw new Exception("Error");
            }
        }
        throw new Exception("ERROR");
        
    }
    
}
