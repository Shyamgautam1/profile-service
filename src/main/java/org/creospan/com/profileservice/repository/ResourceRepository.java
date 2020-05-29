package org.creospan.com.profileservice.repository;

import org.creospan.com.profileservice.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}
