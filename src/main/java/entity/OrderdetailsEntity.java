package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "orderdetails", schema = "northwind")
public class OrderdetailsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private int orderId;
    private Integer productId;
    private BigDecimal quantity;
    private BigDecimal unitPrice;
    private double discount;
    private Integer statusId;
    private Timestamp dateAllocated;
    private Integer purchaseOrderId;
    private Integer inventoryId;
    @ManyToOne
    @JoinColumn( referencedColumnName = "id", nullable = false)
    private OrdersEntity ordersByOrderId;
    @ManyToOne
    @JoinColumn( referencedColumnName = "id")
    private ProductsEntity productsByProductId;
    @ManyToOne
    @JoinColumn( referencedColumnName = "id")
    private OrderdetailsstatusEntity orderdetailsstatusByStatusId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Timestamp getDateAllocated() {
        return dateAllocated;
    }

    public void setDateAllocated(Timestamp dateAllocated) {
        this.dateAllocated = dateAllocated;
    }

    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
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
        OrderdetailsEntity that = (OrderdetailsEntity) o;
        return id == that.id && orderId == that.orderId && Double.compare(that.discount, discount) == 0 && Objects.equals(productId, that.productId) && Objects.equals(quantity, that.quantity) && Objects.equals(unitPrice, that.unitPrice) && Objects.equals(statusId, that.statusId) && Objects.equals(dateAllocated, that.dateAllocated) && Objects.equals(purchaseOrderId, that.purchaseOrderId) && Objects.equals(inventoryId, that.inventoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, productId, quantity, unitPrice, discount, statusId, dateAllocated, purchaseOrderId, inventoryId);
    }

    public OrdersEntity getOrdersByOrderId() {
        return ordersByOrderId;
    }

    public void setOrdersByOrderId(OrdersEntity ordersByOrderId) {
        this.ordersByOrderId = ordersByOrderId;
    }

    public ProductsEntity getProductsByProductId() {
        return productsByProductId;
    }

    public void setProductsByProductId(ProductsEntity productsByProductId) {
        this.productsByProductId = productsByProductId;
    }

    public OrderdetailsstatusEntity getOrderdetailsstatusByStatusId() {
        return orderdetailsstatusByStatusId;
    }

    public void setOrderdetailsstatusByStatusId(OrderdetailsstatusEntity orderdetailsstatusByStatusId) {
        this.orderdetailsstatusByStatusId = orderdetailsstatusByStatusId;
    }

    @Override
    public String toString() {
        return "OrderdetailsEntity{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", discount=" + discount +
                ", statusId=" + statusId +
                ", dateAllocated=" + dateAllocated +
                ", purchaseOrderId=" + purchaseOrderId +
                ", inventoryId=" + inventoryId +
                ", ordersByOrderId=" + ordersByOrderId +
                ", productsByProductId=" + productsByProductId +
                ", orderdetailsstatusByStatusId=" + orderdetailsstatusByStatusId +
                '}';
    }
}
