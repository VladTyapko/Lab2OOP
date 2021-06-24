package entities.responce;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class OrderResponse {

    private int purId;

    private String fName;

    private String sName;

    private String email;

    private String phoneNumber;

    private String address;

    private int purPrice;
}
