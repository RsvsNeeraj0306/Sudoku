package com.practise.sudoku.entity;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Grid")
public class Grid implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "grid", cascade = CascadeType.ALL)
    @JsonIgnore
private List<Cell> cells = new ArrayList <>();
    
}
