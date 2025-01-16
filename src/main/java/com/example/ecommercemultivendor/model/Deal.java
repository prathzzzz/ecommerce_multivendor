package com.example.ecommercemultivendor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Integer discount;
    
    @OneToOne
    private HomeCategory homeCategory;
}