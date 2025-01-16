package com.example.ecommercemultivendor.model;

import com.example.ecommercemultivendor.domain.PaymentMethod;
import com.example.ecommercemultivendor.domain.PaymentOrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PaymentOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Long amount;
    private PaymentMethod paymentMethod;
    private PaymentOrderStatus paymentOrderStatus = PaymentOrderStatus.PENDING;
    private String paymentLinkId;

    @ManyToOne
    private User user;

    @OneToMany
    private Set<Order> orders = new HashSet<>();

}

