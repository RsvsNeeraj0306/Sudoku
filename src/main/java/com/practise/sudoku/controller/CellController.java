package com.practise.sudoku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.practise.sudoku.entity.Cell;
import com.practise.sudoku.services.CellService;

@RestController
@RequestMapping("/api/cell")
public class CellController {

    @Autowired
    private CellService cellService;

    @GetMapping("/{id}")
    public Cell getCell(@PathVariable Long id) {
        return cellService.getCell(id);
    }

    @GetMapping("/value/{id}")
    public int getCellValue(@PathVariable Long id) {
        return cellService.getCellValue(id);
    }

    @GetMapping("/update/{id}/{i}/{j}/{value}")
    public void updateCellValue(@PathVariable Long id, @PathVariable int i, @PathVariable int j, @PathVariable int value) {
        cellService.updateCellValue(id, i, j, value);
    }
    



    

    
}
