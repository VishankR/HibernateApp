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
    private BigDecimal quantity;
    private BigDecimal unitPrice;
    private double discount;
    private Timestamp dateAllocated;
    private Integer purchaseOrderId;
    private Integer inventoryId;
    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "id", nullable = false)
    private OrdersEntity ordersByOrderId;
    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private ProductsEntity productsByProductId;
    @ManyToOne
    @JoinColumn(name = "statusId", referencedColumnName = "id")
    private OrderdetailsstatusEntity orderdetailsstatusByStatusId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return id == that.id && Double.compare(that.discount, discount) == 0 && Objects.equals(quantity, that.quantity) && Objects.equals(unitPrice, that.unitPrice) && Objects.equals(dateAllocated, that.dateAllocated) && Objects.equals(purchaseOrderId, that.purchaseOrderId) && Objects.equals(inventoryId, that.inventoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, unitPrice, discount, dateAllocated, purchaseOrderId, inventoryId);
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
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", discount=" + discount +
                ", dateAllocated=" + dateAllocated +
                ", purchaseOrderId=" + purchaseOrderId +
                ", inventoryId=" + inventoryId +
                ", ordersByOrderId=" + ordersByOrderId.getId() +
                ", productsByProductId=" + productsByProductId.getId() +
                ", orderdetailsstatusByStatusId=" + orderdetailsstatusByStatusId.getId() +
                '}';
    }
}
