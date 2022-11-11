package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "northwind")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private Timestamp orderDate;
    private Timestamp shippedDate;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipStateProvince;
    private String shipZipPostalCode;
    private String shipCountryRegion;
    private BigDecimal shippingFee;
    private BigDecimal taxes;
    private String paymentType;
    private Timestamp paidDate;
    private String notes;
    private Double taxRate;
    @OneToMany(mappedBy = "ordersByCustomerOrderId")
    private Collection<InventorytransactionsEntity> inventorytransactionsById;
    @OneToMany(mappedBy = "ordersByOrderId")
    private Collection<InvoicesEntity> invoicesById;
    @OneToMany(mappedBy = "ordersByOrderId")
    private Collection<OrderdetailsEntity> orderdetailsById;
    @ManyToOne
    @JoinColumn(name = "employeeId", referencedColumnName = "id")
    private EmployeesEntity employeesByEmployeeId;
    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    private CustomersEntity customersByCustomerId;
    @ManyToOne
    @JoinColumn(name = "shipperId", referencedColumnName = "id")
    private ShippersEntity shippersByShipperId;
    @ManyToOne
    @JoinColumn(name = "taxStatusId", referencedColumnName = "id")
    private OrderstaxstatusEntity orderstaxstatusByTaxStatusId;
    @ManyToOne
    @JoinColumn(name = "statusId", referencedColumnName = "id")
    private OrdersstatusEntity ordersstatusByStatusId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Timestamp getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Timestamp shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipStateProvince() {
        return shipStateProvince;
    }

    public void setShipStateProvince(String shipStateProvince) {
        this.shipStateProvince = shipStateProvince;
    }

    public String getShipZipPostalCode() {
        return shipZipPostalCode;
    }

    public void setShipZipPostalCode(String shipZipPostalCode) {
        this.shipZipPostalCode = shipZipPostalCode;
    }

    public String getShipCountryRegion() {
        return shipCountryRegion;
    }

    public void setShipCountryRegion(String shipCountryRegion) {
        this.shipCountryRegion = shipCountryRegion;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Timestamp getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Timestamp paidDate) {
        this.paidDate = paidDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return id == that.id && Objects.equals(orderDate, that.orderDate) && Objects.equals(shippedDate, that.shippedDate) && Objects.equals(shipName, that.shipName) && Objects.equals(shipAddress, that.shipAddress) && Objects.equals(shipCity, that.shipCity) && Objects.equals(shipStateProvince, that.shipStateProvince) && Objects.equals(shipZipPostalCode, that.shipZipPostalCode) && Objects.equals(shipCountryRegion, that.shipCountryRegion) && Objects.equals(shippingFee, that.shippingFee) && Objects.equals(taxes, that.taxes) && Objects.equals(paymentType, that.paymentType) && Objects.equals(paidDate, that.paidDate) && Objects.equals(notes, that.notes) && Objects.equals(taxRate, that.taxRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate, shippedDate, shipName, shipAddress, shipCity, shipStateProvince, shipZipPostalCode, shipCountryRegion, shippingFee, taxes, paymentType, paidDate, notes, taxRate);
    }

    public Collection<InventorytransactionsEntity> getInventorytransactionsById() {
        return inventorytransactionsById;
    }

    public void setInventorytransactionsById(Collection<InventorytransactionsEntity> inventorytransactionsById) {
        this.inventorytransactionsById = inventorytransactionsById;
    }

    public Collection<InvoicesEntity> getInvoicesById() {
        return invoicesById;
    }

    public void setInvoicesById(Collection<InvoicesEntity> invoicesById) {
        this.invoicesById = invoicesById;
    }

    public Collection<OrderdetailsEntity> getOrderdetailsById() {
        return orderdetailsById;
    }

    public void setOrderdetailsById(Collection<OrderdetailsEntity> orderdetailsById) {
        this.orderdetailsById = orderdetailsById;
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }

    public CustomersEntity getCustomersByCustomerId() {
        return customersByCustomerId;
    }

    public void setCustomersByCustomerId(CustomersEntity customersByCustomerId) {
        this.customersByCustomerId = customersByCustomerId;
    }

    public ShippersEntity getShippersByShipperId() {
        return shippersByShipperId;
    }

    public void setShippersByShipperId(ShippersEntity shippersByShipperId) {
        this.shippersByShipperId = shippersByShipperId;
    }

    public OrderstaxstatusEntity getOrderstaxstatusByTaxStatusId() {
        return orderstaxstatusByTaxStatusId;
    }

    public void setOrderstaxstatusByTaxStatusId(OrderstaxstatusEntity orderstaxstatusByTaxStatusId) {
        this.orderstaxstatusByTaxStatusId = orderstaxstatusByTaxStatusId;
    }

    public OrdersstatusEntity getOrdersstatusByStatusId() {
        return ordersstatusByStatusId;
    }

    public void setOrdersstatusByStatusId(OrdersstatusEntity ordersstatusByStatusId) {
        this.ordersstatusByStatusId = ordersstatusByStatusId;
    }

    @Override
    public String toString() {
        return "OrdersEntity{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", shippedDate=" + shippedDate +
                ", shipName='" + shipName + '\'' +
                ", shipAddress='" + shipAddress + '\'' +
                ", shipCity='" + shipCity + '\'' +
                ", shipStateProvince='" + shipStateProvince + '\'' +
                ", shipZipPostalCode='" + shipZipPostalCode + '\'' +
                ", shipCountryRegion='" + shipCountryRegion + '\'' +
                ", shippingFee=" + shippingFee +
                ", taxes=" + taxes +
                ", paymentType='" + paymentType + '\'' +
                ", paidDate=" + paidDate +
                ", notes='" + notes + '\'' +
                ", taxRate=" + taxRate +
                ", inventorytransactionsById=" + inventorytransactionsById +
                ", invoicesById=" + invoicesById +
                ", orderdetailsById=" + orderdetailsById +
                ", employeesByEmployeeId=" + employeesByEmployeeId.getId() +
                ", customersByCustomerId=" + customersByCustomerId.getId() +
                ", shippersByShipperId=" + shippersByShipperId.getId() +
                ", orderstaxstatusByTaxStatusId=" /*+ orderstaxstatusByTaxStatusId.getId()*/ +
                ", ordersstatusByStatusId=" + ordersstatusByStatusId.getId() +
                '}';
    }
}
