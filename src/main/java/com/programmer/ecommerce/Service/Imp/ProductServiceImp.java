package com.programmer.ecommerce.Service.Imp;

import java.util.ArrayList;
import java.util.List;
import com.programmer.ecommerce.Enum.ProductCategory;
import com.programmer.ecommerce.Exceptions.SellerNotFoundException;
import com.programmer.ecommerce.Model.Product;
import com.programmer.ecommerce.Model.Seller;
import com.programmer.ecommerce.Repository.ProductRepository;
import com.programmer.ecommerce.Repository.SellerRepository;
import com.programmer.ecommerce.RequestDTO.ProductRequestDto;
import com.programmer.ecommerce.ResponseDTO.ProductResponseDto;
import com.programmer.ecommerce.convrter.ProductConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    SellerRepository sellerRepository;
    public ProductResponseDto addProduct(ProductRequestDto productRequestDto) throws SellerNotFoundException {
        Seller seller;
        try {
            seller = sellerRepository.findById(productRequestDto.getSellerId()).get();
        }catch (Exception e){
            throw new SellerNotFoundException("Invalid seller Id");
        }
        Product product = ProductConverter.ProductRequestDtoToProduct(productRequestDto);
        product.setSeller(seller);
        seller.getProductList().add(product);
        // saved seller and product
        sellerRepository.save(seller);
        ProductResponseDto productResponseDto = ProductConverter.ProductToProductResponseDto(product);
        return productResponseDto;
    }
    public List<ProductResponseDto> getAllProductByCategory(ProductCategory productCategory){
        List<Product> productList = productRepository.findAllByProductCategory(productCategory);
        List<ProductResponseDto> productResponseDtos = new ArrayList<>();
        for(Product product : productList){
            ProductResponseDto productResponseDto = ProductConverter.ProductToProductResponseDto(product);
            productResponseDtos.add(productResponseDto);
        }
        return productResponseDtos;
    }
}
