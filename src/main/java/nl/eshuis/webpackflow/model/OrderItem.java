package nl.eshuis.webpackflow.model;

import javax.persistence.*;

@Entity
@Table (name = "orderitems")
public class OrderItem {

    @Id
    @Column(nullable = false, unique = true)
    private String sourceItemId;


    public String getSourceItemId() {
        return sourceItemId;
    }

    public void setSourceItemId(String sourceItemId) {
        this.sourceItemId = sourceItemId;
    }
}
