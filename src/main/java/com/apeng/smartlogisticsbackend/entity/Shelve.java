package com.apeng.smartlogisticsbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shelve {

    @Id
    @GeneratedValue
    private Long id;

    private int posX, posY;
    private int capacity;
    private int loadFactor;

    @OneToMany
    private List<Order> orders = new ArrayList<>();

}
