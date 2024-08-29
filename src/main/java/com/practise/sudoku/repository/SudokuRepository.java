package com.practise.sudoku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.sudoku.entity.Sudoku;

public interface SudokuRepository extends JpaRepository<Sudoku, Long> {
}
