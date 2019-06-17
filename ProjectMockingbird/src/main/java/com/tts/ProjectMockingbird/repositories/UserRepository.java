package com.tts.ProjectMockingbird.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.ProjectMockingbird.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> 
{
    User findByUsername(String username);
}
