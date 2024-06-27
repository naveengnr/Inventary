package com.inventary.inventary.repository;

import com.inventary.inventary.entity.Inventary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InventaryRepository extends JpaRepository<Inventary,Integer> {

    List<Inventary> findByName(String name);
}
