package com.programmer.ecommerce.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;

@RestController
@RequestMapping("/seller")
public class SellerController {
    private String name;
    private int age;
    private String mobileNo;
    private String email;
    private String panNo;
}
