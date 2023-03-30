package com.programmer.ecommerce.Repository;

import com.programmer.ecommerce.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderedRepository extends JpaRepository<Order,Integer> {
}
