package nl.eshuis.webpackflow.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "orderitems")
public class OrderItem implements Serializable {

    @Id
    @Column(nullable = false, unique = true)
    private String sourceItemId;

    @Id
    @Column(nullable = false)
    private String sourceOrderId;



    public String getSourceItemId() {
        return sourceItemId;
    }

    public void setSourceItemId(String sourceItemId) {
        this.sourceItemId = sourceItemId;
    }
}
