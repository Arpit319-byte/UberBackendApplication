package com.example.UberApplication.service;

import com.example.UberApplication.model.Model;
import com.example.UberApplication.reposistory.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

   private ReviewRepository reviewRepository;

   public ReviewService(ReviewRepository reviewRepository){
       this.reviewRepository=reviewRepository;
   }
    @Override
    public void run(String... args) throws Exception {

        Model r= Model
                .builder()
                .content("Amazing Services by uber")
                .rating("5 star")
                .build();
        System.out.println(r.toString());
        reviewRepository.save(r);

        List<Model> review=reviewRepository.findAll();

//        for(Review re: review){
//            System.out.println(re.getId()+" "+re.getContent()+" "+re.getRating());
//        }

     //   reviewRepository.deleteById(1L);

    }
}
