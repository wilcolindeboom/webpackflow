package nl.eshuis.webpackflow.service;

import nl.eshuis.webpackflow.model.Order;


import nl.eshuis.webpackflow.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrders() {
        return null;
    }
}
