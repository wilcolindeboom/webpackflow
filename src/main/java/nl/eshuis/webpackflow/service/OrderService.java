package nl.eshuis.webpackflow.service;

import nl.eshuis.webpackflow.model.Order;

import java.util.List;

public interface OrderService {

    public abstract List<Order> getOrders();
}
