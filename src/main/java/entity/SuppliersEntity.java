package entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "suppliers", schema = "northwind")
public class SuppliersEntity extends Person {
    @OneToMany(mappedBy = "suppliersBySupplierId")
    private Collection<PurchaseordersEntity> purchaseordersById;

    public Collection<PurchaseordersEntity> getPurchaseordersById() {
        return purchaseordersById;
    }

    public void setPurchaseordersById(Collection<PurchaseordersEntity> purchaseordersById) {
        this.purchaseordersById = purchaseordersById;
    }

    @Override
    public String toString() {
        return "SuppliersEntity{" +
                "purchaseordersById=" + purchaseordersById +
                '}';
    }
}
