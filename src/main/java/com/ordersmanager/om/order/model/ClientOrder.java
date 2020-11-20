package com.ordersmanager.om.order.model;


import com.ordersmanager.om.client.model.Client;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "Orders")
public class ClientOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Enumerated(EnumType.STRING)
    private OrderCategory orderCategory;
    @Column(unique = true, nullable = false)
    private String description;
    @ManyToOne
    private Client client;

}
