package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;
    //Name should not be empty or null
    @NotEmpty(message = "Name should not be empty or null")
    private String name;

    //Email should not be empty or null
    @NotEmpty(message = "Email should not be empty or null")
    @Email
    private String email;

    //Comment should not be empty or null
    //Comment must be at least 10 character
    @NotEmpty
    @Size(min = 10, message = "Comment must be at least 10 character")
    private String body;
}
