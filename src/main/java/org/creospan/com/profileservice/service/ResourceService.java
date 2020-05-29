package org.creospan.com.profileservice.service;

import org.creospan.com.profileservice.model.Resource;

import java.util.List;
import java.util.Optional;

public interface ResourceService {
    Resource save(Resource resource);
    Optional<Resource> findById(int id);
    List<Resource> getAllResources();
}
