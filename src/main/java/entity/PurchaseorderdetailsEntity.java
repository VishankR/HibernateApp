package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "purchaseorderdetails", schema = "northwind")
public class PurchaseorderdetailsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private int purchaseOrderId;
    private Integer productId;
    private BigDecimal quantity;
    private BigDecimal unitCost;
    private Timestamp dateReceived;
    private byte postedToInventory;
    private Integer inventoryId;
    @ManyToOne
    @JoinColumn( referencedColumnName = "id", nullable = false)
    private PurchaseordersEntity purchaseordersByPurchaseOrderId;
    @ManyToOne
    @JoinColumn( referencedColumnName = "id")
    private ProductsEntity productsByProductId;
    @ManyToOne
    @JoinColumn( referencedColumnName = "id")
    private InventorytransactionsEntity inventorytransactionsByInventoryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public Timestamp getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Timestamp dateReceived) {
        this.dateReceived = dateReceived;
    }

    public byte getPostedToInventory() {
        return postedToInventory;
    }

    public void setPostedToInventory(byte postedToInventory) {
        this.postedToInventory = postedToInventory;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseorderdetailsEntity that = (PurchaseorderdetailsEntity) o;
        return id == that.id && purchaseOrderId == that.purchaseOrderId && postedToInventory == that.postedToInventory && Objects.equals(productId, that.productId) && Objects.equals(quantity, that.quantity) && Objects.equals(unitCost, that.unitCost) && Objects.equals(dateReceived, that.dateReceived) && Objects.equals(inventoryId, that.inventoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, purchaseOrderId, productId, quantity, unitCost, dateReceived, postedToInventory, inventoryId);
    }

    public PurchaseordersEntity getPurchaseordersByPurchaseOrderId() {
        return purchaseordersByPurchaseOrderId;
    }

    public void setPurchaseordersByPurchaseOrderId(PurchaseordersEntity purchaseordersByPurchaseOrderId) {
        this.purchaseordersByPurchaseOrderId = purchaseordersByPurchaseOrderId;
    }

    public ProductsEntity getProductsByProductId() {
        return productsByProductId;
    }

    public void setProductsByProductId(ProductsEntity productsByProductId) {
        this.productsByProductId = productsByProductId;
    }

    public InventorytransactionsEntity getInventorytransactionsByInventoryId() {
        return inventorytransactionsByInventoryId;
    }

    public void setInventorytransactionsByInventoryId(InventorytransactionsEntity inventorytransactionsByInventoryId) {
        this.inventorytransactionsByInventoryId = inventorytransactionsByInventoryId;
    }

    @Override
    public String toString() {
        return "PurchaseorderdetailsEntity{" +
                "id=" + id +
                ", purchaseOrderId=" + purchaseOrderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", unitCost=" + unitCost +
                ", dateReceived=" + dateReceived +
                ", postedToInventory=" + postedToInventory +
                ", inventoryId=" + inventoryId +
                ", purchaseordersByPurchaseOrderId=" + purchaseordersByPurchaseOrderId +
                ", productsByProductId=" + productsByProductId +
                ", inventorytransactionsByInventoryId=" + inventorytransactionsByInventoryId +
                '}';
    }
}
