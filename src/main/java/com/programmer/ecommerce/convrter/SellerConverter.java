package com.programmer.ecommerce.convrter;

import com.programmer.ecommerce.Model.Seller;
import com.programmer.ecommerce.RequestDTO.SellerRequestDto;
import lombok.experimental.UtilityClass;
@UtilityClass
public class SellerConverter {
    public static Seller SellerRequestToSeller(SellerRequestDto sellerRequestDto){
        return Seller.builder().name(sellerRequestDto.getName())
                .email(sellerRequestDto.getEmail())
                .mobileNo(sellerRequestDto.getMobileNo())
                .panNo(sellerRequestDto.getPanNo())
                .build();
    }
}
