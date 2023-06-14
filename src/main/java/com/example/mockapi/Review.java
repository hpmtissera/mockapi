package com.example.mockapi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Review
{
    private final String reviewText;
}
