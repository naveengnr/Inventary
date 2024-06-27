package com.inventary.inventary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Inventary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;
    public String Name;
    public int Quantity;
    public int price;
}
