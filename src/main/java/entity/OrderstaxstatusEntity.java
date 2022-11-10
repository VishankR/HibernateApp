package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "orderstaxstatus", schema = "northwind")
public class OrderstaxstatusEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private byte id;
    private String taxStatusName;
    @OneToMany(mappedBy = "orderstaxstatusByTaxStatusId")
    private Collection<OrdersEntity> ordersById;

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getTaxStatusName() {
        return taxStatusName;
    }

    public void setTaxStatusName(String taxStatusName) {
        this.taxStatusName = taxStatusName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderstaxstatusEntity that = (OrderstaxstatusEntity) o;
        return id == that.id && Objects.equals(taxStatusName, that.taxStatusName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taxStatusName);
    }

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @Override
    public String toString() {
        return "OrderstaxstatusEntity{" +
                "id=" + id +
                ", taxStatusName='" + taxStatusName + '\'' +
                ", ordersById=" + ordersById +
                '}';
    }
}
