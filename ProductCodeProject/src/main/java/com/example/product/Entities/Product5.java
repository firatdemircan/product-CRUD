package com.example.product.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Product5")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product5 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;

    @ManyToOne(targetEntity = Product4.class)
    @JoinColumn(name = "product4_id", referencedColumnName = "id")
    private Product4 product4s;




}
