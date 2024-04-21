package com.example.UberApplication.reposistory;

import com.example.UberApplication.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {


}
