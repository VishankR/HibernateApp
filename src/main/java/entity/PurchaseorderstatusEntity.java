package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "purchaseorderstatus", schema = "northwind")
public class PurchaseorderstatusEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String status;
    @OneToMany(mappedBy = "purchaseorderstatusByStatusId")
    private Collection<PurchaseordersEntity> purchaseordersById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseorderstatusEntity that = (PurchaseorderstatusEntity) o;
        return id == that.id && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status);
    }

    public Collection<PurchaseordersEntity> getPurchaseordersById() {
        return purchaseordersById;
    }

    public void setPurchaseordersById(Collection<PurchaseordersEntity> purchaseordersById) {
        this.purchaseordersById = purchaseordersById;
    }

    @Override
    public String toString() {
        return "PurchaseorderstatusEntity{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", purchaseordersById=" + purchaseordersById +
                '}';
    }
}
