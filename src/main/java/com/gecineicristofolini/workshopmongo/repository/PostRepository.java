package com.gecineicristofolini.workshopmongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gecineicristofolini.workshopmongo.domain.Post;



@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}