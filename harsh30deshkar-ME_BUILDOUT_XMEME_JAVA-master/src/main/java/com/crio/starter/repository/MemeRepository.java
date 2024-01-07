package com.crio.starter.repository;



import com.crio.starter.entity.MemeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemeRepository extends MongoRepository<MemeEntity, String>{
    
}