package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "orderstaxstatus", schema = "northwind")
public class OrderstaxstatusEntity extends Status {

    @OneToMany(mappedBy = "orderstaxstatusByTaxStatusId")
    private Collection<OrdersEntity> ordersById;

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @Override
    public String toString() {
        return "OrderstaxstatusEntity{" +
                "ordersById=" + ordersById +
                '}';
    }
}
