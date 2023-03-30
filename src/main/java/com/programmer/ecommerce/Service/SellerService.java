package com.programmer.ecommerce.Service;

import com.programmer.ecommerce.Repository.SellerRepository;
import com.programmer.ecommerce.RequestDTO.SellerRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;
    public String addSeller(SellerRequestDto sellerRequestDto){

    }
}
