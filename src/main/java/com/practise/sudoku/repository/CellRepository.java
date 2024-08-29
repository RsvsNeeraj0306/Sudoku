package com.practise.sudoku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practise.sudoku.entity.Cell;


public interface CellRepository extends JpaRepository<Cell, Long> {


    
    
}
