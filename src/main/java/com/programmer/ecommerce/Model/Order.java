package com.programmer.ecommerce.Model;

import java.util.List;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    private Date orderDate;
    private int totalCost;
    private int deliveryCharge;
    private String cardUsedForPayment;
    @ManyToOne
    @JoinColumn
    Customer customer;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    List<Item> orderedItems = new ArrayList<>();


}
