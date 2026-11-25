package com.mycompany.practicaspring.business.services;

import java.util.List;

import com.mycompany.practicaspring.business.entities.Product;

public interface ProductManager {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}
