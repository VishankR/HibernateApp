package entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "shippers", schema = "northwind")
public class ShippersEntity extends Person {
    @OneToMany(mappedBy = "shippersByShipperId")
    private Collection<OrdersEntity> ordersById;

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @Override
    public String toString() {
        return "ShippersEntity{" +
                "ordersById=" + ordersById +
                '}';
    }
}
