package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ordersstatus", schema = "northwind")
public class OrdersstatusEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private byte id;
    private String statusName;
    @OneToMany(mappedBy = "ordersstatusByStatusId")
    private Collection<OrdersEntity> ordersById;

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
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
        OrdersstatusEntity that = (OrdersstatusEntity) o;
        return id == that.id && Objects.equals(statusName, that.statusName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statusName);
    }

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @Override
    public String toString() {
        return "OrdersstatusEntity{" +
                "id=" + id +
                ", statusName='" + statusName + '\'' +
                ", ordersById=" + ordersById +
                '}';
    }
}
