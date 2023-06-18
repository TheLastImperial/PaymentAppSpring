package TLI.PaymentAppSpring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Objects;

@Entity(name="salary_details")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SalaryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;
    private String name;
    private Double conditionalValue;
    private boolean isDiscount;
    private boolean isMain;
    private boolean isQuantity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="role_id")
    private Role role;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}
