/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import db.DBBroker;
import domain.Manufacturer;
import domain.Product;
import domain.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import storage.StorageProduct;
import storage.StorageUser;

/**
 *
 * @author Korisnik
 */
public class Controller {
    DBBroker db;
    private static Controller instance;
   
    private StorageUser storageUser;
    private StorageProduct storageProduct;

    public Controller() {
        db = new DBBroker();
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
        
       
        List<User> users = getAllUsers();
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

    public List<Manufacturer> getAllManufacturer() {
        List<Manufacturer> manufacturers = new ArrayList<>();
        
        try {
            db.loadDriver();
            db.openConnection();
            
             manufacturers = db.getAllManufacturer();
                    
                    
                   
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
         return manufacturers;
    }

    private List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            db.loadDriver(); 
            db.openConnection();
            users = db.getAllUsers();
            
            db.closeConnection();
            
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
      
        return users;
        
    }
    
}
