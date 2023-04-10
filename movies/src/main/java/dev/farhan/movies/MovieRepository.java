package dev.farhan.movies;

import org.bson.types.ObjectId;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
