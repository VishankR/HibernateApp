package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "purchaseorderstatus", schema = "northwind")
public class PurchaseorderstatusEntity extends Status {

    @OneToMany(mappedBy = "purchaseorderstatusByStatusId")
    private Collection<PurchaseordersEntity> purchaseordersById;

    public Collection<PurchaseordersEntity> getPurchaseordersById() {
        return purchaseordersById;
    }

    public void setPurchaseordersById(Collection<PurchaseordersEntity> purchaseordersById) {
        this.purchaseordersById = purchaseordersById;
    }

    @Override
    public String toString() {
        return "PurchaseorderstatusEntity{" +
                "purchaseordersById=" + purchaseordersById +
                '}';
    }
}
