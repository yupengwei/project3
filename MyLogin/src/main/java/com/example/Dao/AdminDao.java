package com.example.Dao;


import com.example.entity.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminDao extends CrudRepository<Admin,Long> {

     Admin findAdminByAdminNameAndAdminPassword(String AdminName, String AdminPassword);

}
