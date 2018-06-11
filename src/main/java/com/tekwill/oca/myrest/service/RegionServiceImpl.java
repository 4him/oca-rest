package com.tekwill.oca.myrest.service;

import com.tekwill.oca.myrest.model.Region;
import com.tekwill.oca.myrest.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Override
    public List<Region> getAll() {
        return regionRepository.findAll();
    }

    @Override
    public Region getOneById(Integer id) {
        return regionRepository.getOne(id);
    }

    @Override
    public Region create(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public Region getByName(String name) {
        return regionRepository.findByRegionNameEquals(name);
    }

    @Override
    public void deleteById(Integer id) {
        regionRepository.deleteById(id);
    }
}
