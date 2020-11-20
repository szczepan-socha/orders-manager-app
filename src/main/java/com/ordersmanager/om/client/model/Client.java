package com.ordersmanager.om.client.model;

import com.ordersmanager.om.order.model.ClientOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "Clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull(message = "First name is required")
    private String firstName;
    @NotNull(message = "Last name is required")
    private String lastName;
    @Size(min = 9, max = 9, message = "9 digits are required")
    private int mobileNumber;
    @Email
    private String email;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CLIENT_ID")
    List<ClientOrder> clientOrderList;
}
