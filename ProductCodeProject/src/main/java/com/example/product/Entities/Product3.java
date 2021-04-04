package com.example.product.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Product3")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;

    @ManyToOne(targetEntity = Product2.class)
    @JoinColumn(name = "product2_id", referencedColumnName = "id")
    private Product2 product2s;


}
