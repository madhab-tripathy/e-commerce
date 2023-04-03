package com.programmer.ecommerce.Repository;

import java.util.List;
import com.programmer.ecommerce.Enum.ProductCategory;
import com.programmer.ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
//    @Query(value = "select * from products p where p.product_category=:productCategory",nativeQuery = true)
//    List<Product> getProductByCategory(ProductCategory productCategory);
    List<Product> findAllByProductCategory(ProductCategory productCategory);
}
