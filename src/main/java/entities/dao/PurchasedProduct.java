package entities.dao;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchased_product")
public class PurchasedProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purId;

    @ManyToOne
    @JoinColumn(name = "pur_product_id", nullable = false)
    private Product purProductId;

    @ManyToOne
    @Column(name = "pur_buyer", nullable = false)
    private User purBuyer;

    @Column(name = "pur_date_and_time", nullable = false)
    private LocalDateTime purDateAndTime = LocalDateTime.now();

    @Column(name = "pur_quantity", nullable = false)
    private int purQuantity;

}
