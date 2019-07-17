package com.example.Dao;

import com.example.entity.Associate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssociateDao extends CrudRepository<Associate,Long> {
        List<Associate> findAll();

}
