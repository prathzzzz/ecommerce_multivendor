package com.example.ecommercemultivendor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SellerReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Seller seller;
    private Long totalEarnings = 0L;
    private Long totalSales = 0L;
    private Long totalRefunds = 0L;
    private Long totalTax = 0L;
    private Long netEarnings = 0L;

    private Integer totalOrders = 0;

    private Integer cancelledOrders = 0;

    private Integer totalTransactions = 0;


}