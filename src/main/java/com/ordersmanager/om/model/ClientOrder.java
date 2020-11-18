package com.ordersmanager.om.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Orders")
public class ClientOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date orderDate;
    @Enumerated(EnumType.STRING)
    private OrderCategory orderCategory;
    @Column(unique = true, nullable = false)
    private String description;
}
