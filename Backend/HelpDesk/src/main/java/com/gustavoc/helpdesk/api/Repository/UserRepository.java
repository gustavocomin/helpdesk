package com.gustavoc.helpdesk.api.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gustavoc.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);

}
