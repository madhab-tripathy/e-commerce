package com.programmer.ecommerce.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerRequestDto {
    private String name;
    private int age;
    private String mobileNo;
    private String email;
    private String panNo;
}
