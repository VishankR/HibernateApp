package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "orderdetailsstatus", schema = "northwind")
public class OrderdetailsstatusEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String statusName;
    @OneToMany(mappedBy = "orderdetailsstatusByStatusId")
    private Collection<OrderdetailsEntity> orderdetailsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderdetailsstatusEntity that = (OrderdetailsstatusEntity) o;
        return id == that.id && Objects.equals(statusName, that.statusName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statusName);
    }

    public Collection<OrderdetailsEntity> getOrderdetailsById() {
        return orderdetailsById;
    }

    public void setOrderdetailsById(Collection<OrderdetailsEntity> orderdetailsById) {
        this.orderdetailsById = orderdetailsById;
    }

    @Override
    public String toString() {
        return "OrderdetailsstatusEntity{" +
                "id=" + id +
                ", statusName='" + statusName + '\'' +
                ", orderdetailsById=" + orderdetailsById +
                '}';
    }
}
