package com.programmer.ecommerce.Model;

import java.util.List;
import java.util.ArrayList;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String mobileNo;
    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    @JoinColumn
    Cart cart;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Card> cardList = new ArrayList<>();
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Order> orderList = new ArrayList<>();
}
