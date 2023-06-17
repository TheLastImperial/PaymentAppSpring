package TLI.PaymentAppSpring.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="payslips")
public class Payslip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;
    private Double total;
    @OneToOne(cascade = CascadeType.ALL)
    @Column(name="employees")
    private Employee employee;
    @CreationTimestamp
    @Column(name="created_at")
    private Date createdAt;
    @UpdateTimestamp
    @Column(name="updated_at")
    private Date updatedAt;

    public Payslip() {
    }

    public Payslip(Long id, Double total, Employee employee, Date createdAt, Date updatedAt) {
        this.id = id;
        this.total = total;
        this.employee = employee;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        Payslip payslip = (Payslip) o;
        return Objects.equals(id, payslip.id) && Objects.equals(total, payslip.total) &&
                Objects.equals(employee, payslip.employee) && Objects.equals(createdAt, payslip.createdAt) &&
                Objects.equals(updatedAt, payslip.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, employee, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Payslip{" +
                "id=" + id +
                ", total=" + total +
                ", employee=" + employee +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
