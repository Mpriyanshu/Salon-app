package com.rancho.payload.dto;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.List;

public class SalonDTO {


    private Long id;


    private String name;


    private List<String> images;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private Long ownerId;

    @Column(nullable = false)
    private LocalTime openTime;

    @Column(nullable = false)
    private LocalTime closeTime;

}
