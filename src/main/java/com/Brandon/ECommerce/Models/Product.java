package com.Brandon.ECommerce.Models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  //using java persistance to turn this class into a table
@Data    //getters, setters auto generation
@NoArgsConstructor  //set up default constructor
@AllArgsConstructor //sets up constructor using all values.
@RequiredArgsConstructor // constructor using only data tagged with @NonNull
public class Product {

    @Id //sets up primary key through implimenting Hibernate
    @GeneratedValue(strategy = GenerationType.IDENTITY) //every new product record or Tuple, auto gen ID
    private int id;

    @NonNull
    private String productName;  //auto becomes column name and auto tunes from camelCase to snake_case
    @NonNull
    private String description;
    @NonNull
    private Double price;

    //quick Lombok test to ensure it's properly functioning
//    public static void main(String[] args) {
//        Product card1 = new Product();  //no args constructor works
//        Product card2 = new Product(0, "", "", 100.00); //all args constructor works
//        Product card3 = new Product("Black Lotus", "Gives you Free MANA", 4299.99 ); //required args constructor also works
//  }



}
