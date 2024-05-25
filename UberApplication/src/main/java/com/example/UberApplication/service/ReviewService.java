package com.example.UberApplication.service;

import com.example.UberApplication.model.Booking;
import com.example.UberApplication.model.BookingStatus;
import com.example.UberApplication.model.Review;
import com.example.UberApplication.reposistory.BookingRepository;
import com.example.UberApplication.reposistory.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    final private ReviewRepository reviewRepository;
    final private BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Review r = Review
                .builder()
                .content("Amazing Services by uber")
                .rating("5 star")
                .build();

        Booking b = Booking
                .builder()
                .bookingStatus(BookingStatus.PENDING)
                .review(r)
                .startTime(new Date())
                .build();


     //   reviewRepository.save(r);
        bookingRepository.save(b);
        System.out.println(r.toString());
        System.out.println(b.toString());

        List<Review> review = reviewRepository.findAll();

//        for(Review re: review){
//            System.out.println(re.getId()+" "+re.getContent()+" "+re.getRating());
//        }

        //   reviewRepository.deleteById(1L);

    }
}
