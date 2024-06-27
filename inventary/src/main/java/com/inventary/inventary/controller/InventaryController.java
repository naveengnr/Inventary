package com.inventary.inventary.controller;

import com.inventary.inventary.entity.Inventary;
import com.inventary.inventary.service.InventaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventaryController {
    @Autowired
    public InventaryService inventaryService;

    @GetMapping
    public List<Inventary> getAll()
    {
        return inventaryService.getAll();
    }

    @GetMapping("/{name}")
    public List<Inventary> getbyName(@RequestParam int Id)
    {
        return inventaryService.getbyanme(Id);
    }

}
