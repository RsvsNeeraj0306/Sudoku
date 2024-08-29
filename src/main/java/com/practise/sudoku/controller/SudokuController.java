package com.practise.sudoku.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.practise.sudoku.entity.Grid;
import com.practise.sudoku.entity.Sudoku;
import com.practise.sudoku.services.GridService;
import com.practise.sudoku.services.SudokuService;



@RestController
@RequestMapping("/api/sudoku")
public class SudokuController {

    @Autowired
    private SudokuService sudokuService;


    @GetMapping("/create")
    public Sudoku createGrid() {
        return sudokuService.createSudoku();
    }

    @GetMapping("/{id}")
    public Sudoku getGrid(@PathVariable Long id) {
        return sudokuService.getSudoku(id);
    }
}
