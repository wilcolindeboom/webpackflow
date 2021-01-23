package nl.eshuis.webpackflow.repository;

import nl.eshuis.webpackflow.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, String> {
}
