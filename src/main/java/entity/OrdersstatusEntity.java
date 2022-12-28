package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ordersstatus", schema = "northwind")
public class OrdersstatusEntity extends Status {

    @OneToMany(mappedBy = "ordersstatusByStatusId")
    private Collection<OrdersEntity> ordersById;

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @Override
    public String toString() {
        return "OrdersstatusEntity{" +
                "ordersById=" + ordersById +
                '}';
    }
}
