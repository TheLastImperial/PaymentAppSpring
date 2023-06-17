package TLI.PaymentAppSpring.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="payslip_details")
public class PayslipDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private double quantity;
    private double total;
    @OneToOne(cascade = CascadeType.ALL)
    @Column(name ="salary_detail_id")
    private SalaryDetail salaryDetail;
    @OneToOne(cascade = CascadeType.ALL)
    @Column(name = "payslip_id")
    private PayslipDetail payslipDetail;
    @CreationTimestamp
    @Column(name="created_at")
    private Date createdAt;
    @UpdateTimestamp
    @Column(name="updated_at")
    private Date updatedAt;

    public PayslipDetail() {
    }

    public PayslipDetail(Long id, String description, double quantity, double total,
                         SalaryDetail salaryDetail, PayslipDetail payslipDetail,
                         Date createdAt, Date updatedAt) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.total = total;
        this.salaryDetail = salaryDetail;
        this.payslipDetail = payslipDetail;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public SalaryDetail getSalaryDetail() {
        return salaryDetail;
    }

    public void setSalaryDetail(SalaryDetail salaryDetail) {
        this.salaryDetail = salaryDetail;
    }

    public PayslipDetail getPayslipDetail() {
        return payslipDetail;
    }

    public void setPayslipDetail(PayslipDetail payslipDetail) {
        this.payslipDetail = payslipDetail;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayslipDetail that = (PayslipDetail) o;
        return Double.compare(that.quantity, quantity) == 0 && Double.compare(that.total, total) == 0 &&
                Objects.equals(id, that.id) && Objects.equals(description, that.description) &&
                Objects.equals(salaryDetail, that.salaryDetail) && Objects.equals(payslipDetail, that.payslipDetail) &&
                Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, quantity, total, salaryDetail, payslipDetail, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "PayslipDetail{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", total=" + total +
                ", salaryDetail=" + salaryDetail +
                ", payslipDetail=" + payslipDetail +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
