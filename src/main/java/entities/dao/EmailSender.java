package entities.dao;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;

@Data
@Entity
@Table(name = "email_sender")
public class EmailSender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "recipient", nullable = false)
    private User recipient;

    @Column(name = "text_to_send", nullable = false)
    String textToSend;


}
