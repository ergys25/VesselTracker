package com.ergys.vesseltracker.repository;

import com.ergys.vesseltracker.model.Vessel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VesselRepository extends JpaRepository<Vessel, Long> {
}
