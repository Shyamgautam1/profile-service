package org.creospan.com.profileservice.controller;

import org.creospan.com.profileservice.model.Resource;
import org.creospan.com.profileservice.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/services")
public class ProfileController {
    @Autowired
    ResourceService resourceService;

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public Resource save(@RequestBody Resource resource){
        return resourceService.save( resource );
    }
    @RequestMapping(value = "/findBy", method = RequestMethod.GET)
    public Optional<Resource> finById(@RequestParam int id){
        return resourceService.findById( id );
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Resource> findAll(){
        return resourceService.getAllResources();
    }
}
