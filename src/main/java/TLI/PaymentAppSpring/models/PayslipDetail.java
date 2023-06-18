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

@Entity(name="payslip_details")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PayslipDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private double quantity;
    private double total;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="salary_detail_id")
    private SalaryDetail salaryDetail;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payslip_id")
    private PayslipDetail payslipDetail;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}
