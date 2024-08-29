package com.practise.sudoku.services;


import org.springframework.stereotype.Service;

import com.practise.sudoku.entity.Cell;
import com.practise.sudoku.entity.Grid;
import com.practise.sudoku.repository.CellRepository;
import com.practise.sudoku.repository.GridRepository;

import lombok.RequiredArgsConstructor;

import java.util.*;


@Service
@RequiredArgsConstructor
public class CellService {

    private final CellRepository cellRepository;

    private final GridRepository gridRepository;


    public Cell createCell(Grid grid, int i, int j) {
        Cell cell = new Cell();

                cell.setRows(i);
                cell.setColumns(j);
                cell.setValue(0);
                cell.setGrid(grid);
        return cellRepository.save(cell);
    }


    public Cell getCell(Long id) {
        Optional<Cell> cell = cellRepository.findById(id);
        if(cell.isEmpty()) {
            return null;
        }

        return cellRepository.findById(id).get();
    }

    public int getCellValue(Long id) {
        Optional<Cell> cell = cellRepository.findById(id);
        if(cell.isEmpty()) {
            return -1;
        }

        return cellRepository.findById(id).get().getValue();
    }

    public Cell updateCellValue(Long id, int row , int column, int value) {
        Optional<Grid> grid = gridRepository.findById(id);
        if(!grid.isEmpty()) {
            Optional<Cell> cell = grid.get().getCells().stream().filter(c -> c.getRows() == row && c.getColumns() == column).findFirst();
            if(!cell.isEmpty()) {
                cell.get().setValue(value);
                return cellRepository.save(cell.get());
            }
        }
        return null;
    }
}