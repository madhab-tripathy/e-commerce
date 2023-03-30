package com.programmer.ecommerce.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int requiredQuantity;
    @ManyToOne
    @JoinColumn
    Order order;
    @OneToOne
    @JoinColumn
    Product product;
    @ManyToOne
    @JoinColumn
    Cart cart;

}
