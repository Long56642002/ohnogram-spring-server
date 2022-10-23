package com.example.serverspring.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private ObjectId id;
    private String displayname;
    private String avatar = "https://res.cloudinary.com/longlongne/image/upload/v1661063654/noimage_st7it7.png";
    private String background = "https://res.cloudinary.com/longlongne/image/upload/v1662989486/noimagebackground_ajjg1a.jpg";
    @Indexed(unique = true)
    private String email;
    @Indexed(unique = true)
    private String password;
    private List<User> followers;
    private List<User> following;

}
