package com.ergys.vesseltracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Setter
@Getter
@Entity
@Table(name = "vessels")
public class Vessel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ship_id", nullable = false)
    private Ship ship;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "timestamp")
    private String timestamp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vessel vessel = (Vessel) o;
        return Objects.equals(id, vessel.id) && Objects.equals(ship, vessel.ship) && Objects.equals(latitude, vessel.latitude) && Objects.equals(longitude, vessel.longitude) && Objects.equals(timestamp, vessel.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ship, latitude, longitude, timestamp);
    }

    @Override
    public String toString() {
        return "Vessel{" +
                "id=" + id +
                ", ship=" + ship +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
