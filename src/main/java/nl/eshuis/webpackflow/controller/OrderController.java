package nl.eshuis.webpackflow.controller;

import nl.eshuis.webpackflow.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderService orderservice;



    @GetMapping(value = "")
    public ResponseEntity getOrdersTest () {
        return ResponseEntity.status(200).body("Orders list");
    }

//    public ResponseEntity<Object> getOrders() {
//        return ResponseEntity.ok().body(orderService.getOrders());
//    }
}
