package entities.dao;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "product_quantity", nullable = false)
    private int productQuantity;

    @Column(name = "product_name",  unique = true)
    private String productName;

    @Column(name = "product_desc", nullable = false)
    private String productDesc;

    @Column(name = "product_img_url")
    private String productImgUrl;

    @Column(name = "product_price", nullable = false)
    private int productPrice;
}
