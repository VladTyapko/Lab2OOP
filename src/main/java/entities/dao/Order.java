package entities.dao;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purId;

    @Column(nullable = false)
    private String fName;

    @Column(nullable = false)
    private String sName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;


    @Column(name = "pur_price", nullable = false)
    private int purPrice;
}
