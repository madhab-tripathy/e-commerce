package com.programmer.ecommerce.RequestDTO;

import com.programmer.ecommerce.Enum.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequestDto {
    private int sellerId;
    private String productName;
    private int price;
    private int quantity;
    private ProductCategory productCategory;
}
