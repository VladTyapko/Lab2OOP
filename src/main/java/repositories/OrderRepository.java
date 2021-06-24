package repositories;

import entities.dao.Order;
import entities.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByProductId(Integer productId);
}
