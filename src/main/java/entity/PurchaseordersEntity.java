package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "purchaseorders", schema = "northwind")
public class PurchaseordersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private Timestamp submittedDate;
    private Timestamp creationDate;
    private Timestamp expectedDate;
    private BigDecimal shippingFee;
    private BigDecimal taxes;
    private Timestamp paymentDate;
    private BigDecimal paymentAmount;
    private String paymentMethod;
    private String notes;
    private Integer approvedBy;
    private Timestamp approvedDate;
    private Integer submittedBy;
    @OneToMany(mappedBy = "purchaseordersByPurchaseOrderId")
    private Collection<InventorytransactionsEntity> inventorytransactionsById;
    @OneToMany(mappedBy = "purchaseordersByPurchaseOrderId")
    private Collection<PurchaseorderdetailsEntity> purchaseorderdetailsById;
    @ManyToOne
    @JoinColumn(name = "supplierId", referencedColumnName = "id")
    private SuppliersEntity suppliersBySupplierId;
    @ManyToOne
    @JoinColumn(name = "createdBy", referencedColumnName = "id")
    private EmployeesEntity employeesByCreatedBy;
    @ManyToOne
    @JoinColumn(name = "statusId", referencedColumnName = "id")
    private PurchaseorderstatusEntity purchaseorderstatusByStatusId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Timestamp submittedDate) {
        this.submittedDate = submittedDate;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Timestamp expectedDate) {
        this.expectedDate = expectedDate;
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

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Integer approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Timestamp getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Timestamp approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Integer getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(Integer submittedBy) {
        this.submittedBy = submittedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseordersEntity that = (PurchaseordersEntity) o;
        return id == that.id && Objects.equals(submittedDate, that.submittedDate) && Objects.equals(creationDate, that.creationDate) && Objects.equals(expectedDate, that.expectedDate) && Objects.equals(shippingFee, that.shippingFee) && Objects.equals(taxes, that.taxes) && Objects.equals(paymentDate, that.paymentDate) && Objects.equals(paymentAmount, that.paymentAmount) && Objects.equals(paymentMethod, that.paymentMethod) && Objects.equals(notes, that.notes) && Objects.equals(approvedBy, that.approvedBy) && Objects.equals(approvedDate, that.approvedDate) && Objects.equals(submittedBy, that.submittedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, submittedDate, creationDate, expectedDate, shippingFee, taxes, paymentDate, paymentAmount, paymentMethod, notes, approvedBy, approvedDate, submittedBy);
    }

    public Collection<InventorytransactionsEntity> getInventorytransactionsById() {
        return inventorytransactionsById;
    }

    public void setInventorytransactionsById(Collection<InventorytransactionsEntity> inventorytransactionsById) {
        this.inventorytransactionsById = inventorytransactionsById;
    }

    public Collection<PurchaseorderdetailsEntity> getPurchaseorderdetailsById() {
        return purchaseorderdetailsById;
    }

    public void setPurchaseorderdetailsById(Collection<PurchaseorderdetailsEntity> purchaseorderdetailsById) {
        this.purchaseorderdetailsById = purchaseorderdetailsById;
    }

    public SuppliersEntity getSuppliersBySupplierId() {
        return suppliersBySupplierId;
    }

    public void setSuppliersBySupplierId(SuppliersEntity suppliersBySupplierId) {
        this.suppliersBySupplierId = suppliersBySupplierId;
    }

    public EmployeesEntity getEmployeesByCreatedBy() {
        return employeesByCreatedBy;
    }

    public void setEmployeesByCreatedBy(EmployeesEntity employeesByCreatedBy) {
        this.employeesByCreatedBy = employeesByCreatedBy;
    }

    public PurchaseorderstatusEntity getPurchaseorderstatusByStatusId() {
        return purchaseorderstatusByStatusId;
    }

    public void setPurchaseorderstatusByStatusId(PurchaseorderstatusEntity purchaseorderstatusByStatusId) {
        this.purchaseorderstatusByStatusId = purchaseorderstatusByStatusId;
    }

    @Override
    public String toString() {
        return "PurchaseordersEntity{" +
                "id=" + id +
                ", submittedDate=" + submittedDate +
                ", creationDate=" + creationDate +
                ", expectedDate=" + expectedDate +
                ", shippingFee=" + shippingFee +
                ", taxes=" + taxes +
                ", paymentDate=" + paymentDate +
                ", paymentAmount=" + paymentAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", notes='" + notes + '\'' +
                ", approvedBy=" + approvedBy +
                ", approvedDate=" + approvedDate +
                ", submittedBy=" + submittedBy +
                ", inventorytransactionsById=" + inventorytransactionsById +
                ", purchaseorderdetailsById=" + purchaseorderdetailsById +
                ", suppliersBySupplierId=" + suppliersBySupplierId.getId() +
                ", employeesByCreatedBy=" + employeesByCreatedBy.getId() +
                ", purchaseorderstatusByStatusId=" + purchaseorderstatusByStatusId.getId() +
                '}';
    }
}
