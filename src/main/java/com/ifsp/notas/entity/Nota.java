package com.ifsp.notas.entity;

import javax.persistence.*;

@Entity
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer nota;

    @Column(nullable = false)
    private String prova;
}
