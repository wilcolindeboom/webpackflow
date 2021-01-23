package nl.eshuis.webpackflow.model;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="store_front_id")
    private int StoreFrontId ;

    @Column(name="source_order_id")
    private String sourceOrderId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStoreFrontId() {
        return StoreFrontId;
    }

    public void setStoreFrontId(int storeFrontId) {
        StoreFrontId = storeFrontId;
    }

    public String getSourceOrderId() {
        return sourceOrderId;
    }

    public void setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
    }
}
