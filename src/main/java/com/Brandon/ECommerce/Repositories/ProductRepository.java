package com.Brandon.ECommerce.Repositories;


import com.Brandon.ECommerce.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data JPA is a library/framework that adds an
 * extra layer of abstraction on top of JPA provider
 */

@Repository //not necessary due to extends JpaRepository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    //Spring Data auto Generates all session methods .save(), .delete(), .update()

    //Jpa Property Expressions and Query creation auto creates the SQL queries


}
