package com.example.UberApplication.service;

import com.example.UberApplication.model.Review;
import com.example.UberApplication.reposistory.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

   private ReviewRepository reviewRepository;

   public ReviewService(ReviewRepository reviewRepository){
       this.reviewRepository=reviewRepository;
   }
    @Override
    public void run(String... args) throws Exception {

        Review r=Review
                .builder()
                .content("Amazing Services by uber")
                .rating("5 star")
                .build();
        System.out.println(r.toString());
        reviewRepository.save(r);
    }
}
