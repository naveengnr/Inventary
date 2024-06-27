package com.inventary.inventary.service;

import com.inventary.inventary.entity.Inventary;
import com.inventary.inventary.repository.InventaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventaryService {

    @Autowired
    public InventaryRepository inventaryRepository;

    public List<Inventary> getAll(){
        return inventaryRepository.findAll();
    }

    public List<Inventary> getbyanme(int Id){
        return inventaryRepository.getbyname(Id);
    }
}