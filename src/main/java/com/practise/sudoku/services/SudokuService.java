package com.practise.sudoku.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practise.sudoku.entity.Sudoku;
import com.practise.sudoku.repository.SudokuRepository;



@Service
public class SudokuService {

    @Autowired
    private SudokuRepository sudokuRepository;


    @Autowired
    private GridService gridService;


    public Sudoku createSudoku() {
        Sudoku sudoku = new Sudoku();
        sudoku.setGrid(gridService.createGrid());
        return sudokuRepository.save(sudoku);
    }

        
    public Sudoku getSudoku(Long id) {
        return sudokuRepository.findById(id).get();
    }
    }




