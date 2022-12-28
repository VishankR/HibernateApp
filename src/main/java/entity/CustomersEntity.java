package entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "customers", schema = "northwind")
public class CustomersEntity extends Person{
    @OneToMany(mappedBy = "customersByCustomerId")
    private Collection<OrdersEntity> ordersById;

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @Override
    public String toString() {
        return "CustomersEntity{" +
                " ordersById=" + ordersById +
                '}';
    }
}
