package com.example.StudentProtal.Repo;

import com.example.StudentProtal.Modal.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ILaptop extends JpaRepository<Laptop,String> {
}
