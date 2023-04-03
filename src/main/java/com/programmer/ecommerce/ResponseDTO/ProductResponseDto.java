package com.programmer.ecommerce.ResponseDTO;

import com.programmer.ecommerce.Enum.ProductCategory;
import com.programmer.ecommerce.Enum.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseDto {
    private String name;
    private int price;
    private int quantity;
    private ProductStatus productStatus;
}
