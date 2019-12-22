package com.adechinan.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepository extends MongoRepository<Stat, String> { }
