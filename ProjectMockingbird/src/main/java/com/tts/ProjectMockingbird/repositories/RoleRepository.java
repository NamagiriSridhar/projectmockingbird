package com.tts.ProjectMockingbird.repositories;

import javax.management.relation.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>
{
	Role findByRole(String role);
	
}