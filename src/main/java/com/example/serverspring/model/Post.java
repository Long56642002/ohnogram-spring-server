package com.example.serverspring.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Collection;

@Data
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "posts")
public class Post {
    public class CommentObject {
        val text;
        val object;
    }
    @Id
    private ObjectId id;
    @Transient
    private String idString;
    private String caption;
    private Collection<String> resource;
    @DBRef
    private User postedBy;
    @DBRef
    private Collection<User> likes;
    @DBRef
    private Collection<CommentObject> comments;
}
