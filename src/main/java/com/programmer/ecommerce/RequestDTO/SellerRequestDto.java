package com.programmer.ecommerce.RequestDTO;

import com.programmer.ecommerce.Service.SellerService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerRequestDto {
    @Autowired
    SellerService sellerService;
    @PostMapping("add")
    public String addSeller(@RequestBody SellerRequestDto sellerRequestDto){

    }
}
