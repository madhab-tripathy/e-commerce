package com.programmer.ecommerce.Service;

import java.util.List;

import com.programmer.ecommerce.Enum.ProductCategory;
import com.programmer.ecommerce.RequestDTO.ProductRequestDto;
import com.programmer.ecommerce.ResponseDTO.ProductResponseDto;

public interface ProductService {
    public ProductResponseDto addProduct(ProductRequestDto productRequestDto);
    public List<ProductResponseDto> getAllProductByCategory(ProductCategory productCategory);
}
