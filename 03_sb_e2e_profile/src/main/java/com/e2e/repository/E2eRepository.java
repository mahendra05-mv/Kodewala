package com.e2e.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.e2e.entity.Entity;

@Repository
public interface E2eRepository extends JpaRepository<Entity, Long>
{
	public Entity findByName(String name);
}
