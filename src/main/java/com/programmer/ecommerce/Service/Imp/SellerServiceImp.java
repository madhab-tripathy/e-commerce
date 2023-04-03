package com.programmer.ecommerce.Service.Imp;

import com.programmer.ecommerce.Model.Seller;
import com.programmer.ecommerce.Repository.SellerRepository;
import com.programmer.ecommerce.RequestDTO.SellerRequestDto;
import com.programmer.ecommerce.convrter.SellerConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImp {
    @Autowired
    SellerRepository sellerRepository;
    public String addSeller(SellerRequestDto sellerRequestDto){
        Seller seller = SellerConverter.SellerRequestToSeller(sellerRequestDto);
        sellerRepository.save(seller);
        return "Congratulation!! you are ready to sell your products";
    }
}
