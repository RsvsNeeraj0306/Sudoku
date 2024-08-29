package com.practise.sudoku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.sudoku.entity.Grid;

public interface GridRepository extends JpaRepository<Grid, Long> {
    
}
