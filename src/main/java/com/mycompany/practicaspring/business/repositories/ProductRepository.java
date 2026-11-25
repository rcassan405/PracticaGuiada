package com.mycompany.practicaspring.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.practicaspring.business.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}

