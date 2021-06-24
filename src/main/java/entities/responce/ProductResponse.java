package entities.responce;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProductResponse {

    private int productId;

    private int productQuantity;

    private String productName;

    private int productPrice;
}
