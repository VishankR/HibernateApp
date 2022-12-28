package entity;

import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "orderdetailsstatus", schema = "northwind")
public class OrderdetailsstatusEntity extends Status {

    @OneToMany(mappedBy = "orderdetailsstatusByStatusId")
    private Collection<OrderdetailsEntity> orderdetailsById;

    public Collection<OrderdetailsEntity> getOrderdetailsById() {
        return orderdetailsById;
    }

    public void setOrderdetailsById(Collection<OrderdetailsEntity> orderdetailsById) {
        this.orderdetailsById = orderdetailsById;
    }

    @Override
    public String toString() {
        return "OrderdetailsstatusEntity{" +
                "orderdetailsById=" + orderdetailsById +
                '}';
    }
}
