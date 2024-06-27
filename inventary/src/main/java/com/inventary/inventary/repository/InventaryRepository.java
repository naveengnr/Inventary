package com.inventary.inventary.repository;

import com.inventary.inventary.entity.Inventary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventaryRepository extends JpaRepository<Inventary,Integer> {

    List<Inventary> getbyname(int id);
}
