package com.example.product.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Product4")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product4 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;

    @ManyToOne(targetEntity = Product3.class)
    @JoinColumn(name = "product3_id", referencedColumnName = "id")
    private Product3 product3s;


}
