package com.practise.sudoku.services;


import org.springframework.stereotype.Service;
import com.practise.sudoku.entity.Cell;
import com.practise.sudoku.entity.Grid;
import com.practise.sudoku.repository.GridRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GridService {

    private final GridRepository gridRepository;

    private final CellService cellService;

    public Grid getGridById(Long id) {
        return gridRepository.findById(id).orElse(null);
    }

    public Grid createGrid() {

        Grid grid = new Grid();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Cell cell = cellService.createCell(grid,i, j);
                grid.getCells().add(cell);
            }
        }
        return gridRepository.save(grid);
    }


    public List<Grid> getAllGrids() {
        return gridRepository.findAll();
    }



 



  
    
}
