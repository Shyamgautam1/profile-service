package org.creospan.com.profileservice.service;

import org.creospan.com.profileservice.model.Resource;
import org.creospan.com.profileservice.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    ResourceRepository resourceRepository;

    @Override
    public Resource save(Resource resource) {
        return resourceRepository.save( resource );
    }

    @Override
    public Optional<Resource> findById(int id) {
        return resourceRepository.findById( id );
    }

    @Override
    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }
}
