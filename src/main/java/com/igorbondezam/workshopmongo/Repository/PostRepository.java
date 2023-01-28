package com.igorbondezam.workshopmongo.Repository;

import com.igorbondezam.workshopmongo.domain.Post;
import com.igorbondezam.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {



}
