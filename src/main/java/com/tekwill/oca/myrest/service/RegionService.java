package com.tekwill.oca.myrest.service;

import com.tekwill.oca.myrest.model.Region;

import java.util.List;

public interface RegionService {
    List<Region> getAll();
    Region getOneById(Integer id);
    Region create(Region region);
    Region getByName(String name);
    void deleteById(Integer id);
}
