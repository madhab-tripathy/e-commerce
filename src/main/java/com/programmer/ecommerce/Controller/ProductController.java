package com.programmer.ecommerce.Controller;

import com.programmer.ecommerce.Enum.ProductCategory;
import com.programmer.ecommerce.RequestDTO.ProductRequestDto;
import com.programmer.ecommerce.ResponseDTO.ProductResponseDto;
import com.programmer.ecommerce.Service.Imp.ProductServiceImp;
import com.programmer.ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductServiceImp productService;
    @PostMapping("/add")
    public ResponseEntity addProduct(@RequestBody ProductRequestDto productRequestDto){
        ProductResponseDto productResponseDto;
        try {
            productResponseDto = productService.addProduct(productRequestDto);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity(productResponseDto,HttpStatus.ACCEPTED);
    }
    @GetMapping("/get/category/{productCategory}")
    public List<ProductResponseDto> getAllProductByCategory(@PathVariable("productCategory") ProductCategory productCategory) throws Exception {
        return productService.getAllProductByCategory(productCategory);
    }
}
