package nl.eshuis.webpackflow.model;

import java.io.Serializable;

public class OrderItemId implements Serializable {

    private String sourceItemId;
    private String sourceOrderId;

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
