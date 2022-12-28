package entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "employees", schema = "northwind")
public class EmployeesEntity extends Person {
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<OrdersEntity> ordersById;
    @OneToMany(mappedBy = "employeesByCreatedBy")
    private Collection<PurchaseordersEntity> purchaseordersById;

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    public Collection<PurchaseordersEntity> getPurchaseordersById() {
        return purchaseordersById;
    }

    public void setPurchaseordersById(Collection<PurchaseordersEntity> purchaseordersById) {
        this.purchaseordersById = purchaseordersById;
    }

    @Override
    public String toString() {
        return "EmployeesEntity{" +
                " ordersById=" + ordersById +
                ", purchaseordersById=" + purchaseordersById +
                '}';
    }
}
