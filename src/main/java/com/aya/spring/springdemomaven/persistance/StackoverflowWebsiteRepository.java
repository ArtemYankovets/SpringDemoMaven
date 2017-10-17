package com.aya.spring.springdemomaven.persistance;

import com.aya.spring.springdemomaven.model.StackoverflowWebsite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StackoverflowWebsiteRepository extends MongoRepository<StackoverflowWebsite, String>{

    List<StackoverflowWebsite> findByWebsite(String website);

}
