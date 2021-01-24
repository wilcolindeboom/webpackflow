package nl.eshuis.webpackflow.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="orders")
public class Order {

    @Id
    @Column(nullable = false, unique = true)
    private String sourceOrderId;

    @OneToMany(
            targetEntity = OrderItem.class,
            mappedBy = "sourceOrderId",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    private List<OrderItem> orderItems = new ArrayList<>();

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getSourceOrderId() {
        return sourceOrderId;
    }

    public void setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
    }
}
