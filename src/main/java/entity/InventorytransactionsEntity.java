package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "inventorytransactions", schema = "northwind")
public class InventorytransactionsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private byte transactionType;
    private Timestamp transactionCreatedDate;
    private Timestamp transactionModifiedDate;
    private int productId;
    private int quantity;
    private Integer purchaseOrderId;
    private Integer customerOrderId;
    private String comments;
    @ManyToOne
    @JoinColumn( referencedColumnName = "id", nullable = false)
    private InventorytransactiontypesEntity inventorytransactiontypesByTransactionType;
    @ManyToOne
    @JoinColumn( referencedColumnName = "id", nullable = false)
    private ProductsEntity productsByProductId;
    @ManyToOne
    @JoinColumn( referencedColumnName = "id")
    private PurchaseordersEntity purchaseordersByPurchaseOrderId;
    @ManyToOne
    @JoinColumn( referencedColumnName = "id")
    private OrdersEntity ordersByCustomerOrderId;
    @OneToMany(mappedBy = "inventorytransactionsByInventoryId")
    private Collection<PurchaseorderdetailsEntity> purchaseorderdetailsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(byte transactionType) {
        this.transactionType = transactionType;
    }

    public Timestamp getTransactionCreatedDate() {
        return transactionCreatedDate;
    }

    public void setTransactionCreatedDate(Timestamp transactionCreatedDate) {
        this.transactionCreatedDate = transactionCreatedDate;
    }

    public Timestamp getTransactionModifiedDate() {
        return transactionModifiedDate;
    }

    public void setTransactionModifiedDate(Timestamp transactionModifiedDate) {
        this.transactionModifiedDate = transactionModifiedDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Integer getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(Integer customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventorytransactionsEntity that = (InventorytransactionsEntity) o;
        return id == that.id && transactionType == that.transactionType && productId == that.productId && quantity == that.quantity && Objects.equals(transactionCreatedDate, that.transactionCreatedDate) && Objects.equals(transactionModifiedDate, that.transactionModifiedDate) && Objects.equals(purchaseOrderId, that.purchaseOrderId) && Objects.equals(customerOrderId, that.customerOrderId) && Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transactionType, transactionCreatedDate, transactionModifiedDate, productId, quantity, purchaseOrderId, customerOrderId, comments);
    }

    public InventorytransactiontypesEntity getInventorytransactiontypesByTransactionType() {
        return inventorytransactiontypesByTransactionType;
    }

    public void setInventorytransactiontypesByTransactionType(InventorytransactiontypesEntity inventorytransactiontypesByTransactionType) {
        this.inventorytransactiontypesByTransactionType = inventorytransactiontypesByTransactionType;
    }

    public ProductsEntity getProductsByProductId() {
        return productsByProductId;
    }

    public void setProductsByProductId(ProductsEntity productsByProductId) {
        this.productsByProductId = productsByProductId;
    }

    public PurchaseordersEntity getPurchaseordersByPurchaseOrderId() {
        return purchaseordersByPurchaseOrderId;
    }

    public void setPurchaseordersByPurchaseOrderId(PurchaseordersEntity purchaseordersByPurchaseOrderId) {
        this.purchaseordersByPurchaseOrderId = purchaseordersByPurchaseOrderId;
    }

    public OrdersEntity getOrdersByCustomerOrderId() {
        return ordersByCustomerOrderId;
    }

    public void setOrdersByCustomerOrderId(OrdersEntity ordersByCustomerOrderId) {
        this.ordersByCustomerOrderId = ordersByCustomerOrderId;
    }

    public Collection<PurchaseorderdetailsEntity> getPurchaseorderdetailsById() {
        return purchaseorderdetailsById;
    }

    public void setPurchaseorderdetailsById(Collection<PurchaseorderdetailsEntity> purchaseorderdetailsById) {
        this.purchaseorderdetailsById = purchaseorderdetailsById;
    }

    @Override
    public String toString() {
        return "InventorytransactionsEntity{" +
                "id=" + id +
                ", transactionType=" + transactionType +
                ", transactionCreatedDate=" + transactionCreatedDate +
                ", transactionModifiedDate=" + transactionModifiedDate +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", purchaseOrderId=" + purchaseOrderId +
                ", customerOrderId=" + customerOrderId +
                ", comments='" + comments + '\'' +
                ", inventorytransactiontypesByTransactionType=" + inventorytransactiontypesByTransactionType +
                ", productsByProductId=" + productsByProductId +
                ", purchaseordersByPurchaseOrderId=" + purchaseordersByPurchaseOrderId +
                ", ordersByCustomerOrderId=" + ordersByCustomerOrderId +
                ", purchaseorderdetailsById=" + purchaseorderdetailsById +
                '}';
    }
}
