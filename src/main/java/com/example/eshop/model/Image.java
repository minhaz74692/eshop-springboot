package com.example.eshop.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY) // Define as Primary Key
    private Long id;
    private  String fileName;
    private String filaType;
    private Blob image;
    private  String downloadUrl;

    @ManyToOne //defined the relation with product
    @JoinColumn(name = "product_id")
    private Product product;
}
