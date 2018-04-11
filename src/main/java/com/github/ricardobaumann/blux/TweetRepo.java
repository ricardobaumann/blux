package com.github.ricardobaumann.blux;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepo extends ReactiveMongoRepository<Tweet, String> {

}
