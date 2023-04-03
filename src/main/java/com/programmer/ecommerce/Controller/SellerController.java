package com.programmer.ecommerce.Controller;

import com.programmer.ecommerce.RequestDTO.SellerRequestDto;
import com.programmer.ecommerce.Service.Imp.SellerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    SellerServiceImp sellerServiceImp;
    @PostMapping("add")
    public String addSeller(@RequestBody SellerRequestDto sellerRequestDto){
        return sellerServiceImp.addSeller(sellerRequestDto);
    }
    // Get all sellers
    // Get a seller by PAN Card
    // Find sellers of a particular age
}
