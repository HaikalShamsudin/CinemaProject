package com.example.cinema.Models;

import lombok.Getter;
import lombok.Setter;

public class Movie {
    
    @Setter
    @Getter
    Long ID;

    String title;

    String genre;

    Double duration;

    

}
