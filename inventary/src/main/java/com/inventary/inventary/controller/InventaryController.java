package com.inventary.inventary.controller;

import com.inventary.inventary.entity.Inventary;
import com.inventary.inventary.service.InventaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public Inventary getById(@PathVariable int id) {
        return inventaryService.getById(id);
    }

    @GetMapping("/name/{name}")
    public List<Inventary> getByName(@PathVariable String name) {
        return inventaryService.getByName(name);
    }
}
