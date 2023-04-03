package com.programmer.ecommerce.convrter;

import com.programmer.ecommerce.Enum.ProductStatus;
import com.programmer.ecommerce.Model.Product;
import com.programmer.ecommerce.RequestDTO.ProductRequestDto;
import com.programmer.ecommerce.ResponseDTO.ProductResponseDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductConverter {
    public static Product ProductRequestDtoToProduct(ProductRequestDto productRequestDto){
        return Product.builder().name(productRequestDto.getProductName())
                .price(productRequestDto.getPrice())
                .quantity(productRequestDto.getQuantity())
                .productCategory(productRequestDto.getProductCategory())
                .productStatus(ProductStatus.AVAILABLE)
                .build();
    }
    public static ProductResponseDto ProductToProductResponseDto(Product product){
        return ProductResponseDto.builder()
                .name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .productStatus(product.getProductStatus())
                .build();
    }
}
