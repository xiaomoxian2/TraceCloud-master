package com.tracecloud.producer.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @Description
 * @Version V1.0
 */
@Entity
@Table(name="goods")
@Data
public class Goods {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "price")
    private String price;
}
