package com.example.UberApplication.reposistory;

import com.example.UberApplication.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Model,Long> {

}
