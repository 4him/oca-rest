package com.tekwill.oca.myrest.repository;

import com.tekwill.oca.myrest.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RegionRepository extends JpaRepository<Region, Integer> {
    Region findByRegionNameEquals(String name);

    @Query(value = "select * from region where region_name = name", nativeQuery = true)
    Region getByNameMyCustomQuery(@Param("name") String dasdasd);
}
