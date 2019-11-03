/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class StorageUser {
    List<User> users;

    public StorageUser() {
        users = new ArrayList<>();
        users.add(new User(1l, "kata", "kata123","Katica","Milicevic", "kmilicevic@gmail.com"));
        users.add(new User(2l, "mariola", "mariola123","Marija","Savkovic", "msavkovic@gmail.com"));
        users.add(new User(3l, "dule", "dule123","Dusan","Milicevic", "dmilicevic@gmail.com"));
    }

    public List<User> getAll() {
        return users;
    }
    
    
    
}
