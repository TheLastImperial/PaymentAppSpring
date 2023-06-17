package TLI.PaymentAppSpring.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="salary_details")
public class SalaryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;
    private String name;
    @Column(name="conditional_value")
    private boolean conditionalValue;
    @Column(name="is_discount")
    private boolean isDiscount;
    @Column(name="is_main")
    private boolean isMain;
    @Column(name="is_quantity")
    private boolean isQuantity;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="role_id", referencedColumnName = "id")
    private Role role;
    @CreationTimestamp
    @Column(name="created_at")
    private Date createdAt;
    @UpdateTimestamp
    @Column(name="updated_at")
    private Date updatedAt;

    public SalaryDetail() {
    }

    public SalaryDetail(Long id, String name, boolean conditionalValue, boolean isDiscount,
                        boolean isMain, boolean isQuantity, Role role, Date createdAt,
                        Date updatedAt) {
        this.id = id;
        this.name = name;
        this.conditionalValue = conditionalValue;
        this.isDiscount = isDiscount;
        this.isMain = isMain;
        this.isQuantity = isQuantity;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConditionalValue() {
        return conditionalValue;
    }

    public void setConditionalValue(boolean conditionalValue) {
        this.conditionalValue = conditionalValue;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public boolean isMain() {
        return isMain;
    }

    public void setMain(boolean main) {
        isMain = main;
    }

    public boolean isQuantity() {
        return isQuantity;
    }

    public void setQuantity(boolean quantity) {
        isQuantity = quantity;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
        SalaryDetail that = (SalaryDetail) o;
        return conditionalValue == that.conditionalValue && isDiscount == that.isDiscount &&
                isMain == that.isMain && isQuantity == that.isQuantity && Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) && Objects.equals(role, that.role) &&
                Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, conditionalValue, isDiscount, isMain,
                isQuantity, role, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "SalaryDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", conditionalValue=" + conditionalValue +
                ", isDiscount=" + isDiscount +
                ", isMain=" + isMain +
                ", isQuantity=" + isQuantity +
                ", role=" + role +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
