package com.tekwill.oca.myrest.controller;

import com.tekwill.oca.myrest.model.Region;
import com.tekwill.oca.myrest.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/regions")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Region> getAll() {
        return regionService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Region getById(@PathVariable(name = "id") Integer id) {
        return regionService.getOneById(id);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public Region getByName(@RequestParam(name = "name") String name) {
        return regionService.getByName(name);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable(name = "id") Integer id) {
        regionService.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Region create(@RequestBody    Region region) {
        return regionService.create(region);
    }

}
