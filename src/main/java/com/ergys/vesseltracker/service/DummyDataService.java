//package com.ergys.vesseltracker.service;
//
//import com.ergys.vesseltracker.model.Ship;
//import com.ergys.vesseltracker.model.Vessel;
//import com.ergys.vesseltracker.repository.VesselRepository;
//import com.ergys.vesseltracker.repository.ShipRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Random;
//
//@Service
//public class DummyDataService {
//
//    @Autowired
//    private ShipRepository shipRepository;
//
//    @Autowired
//    private VesselRepository vesselRepository;
//
//    private final Random random = new Random();
//
//    private final String[] types = {"Cargo", "Tanker", "Fishing", "Passenger", "Research"};
//    private final String[] flags = {"USA", "UK", "Japan", "Norway", "China", "Italy", "Greece"};
//
//    private final List<Double> waypointsLat = List.of(40.7128, 41.9028, 42.3314, 43.6532); // Latitude waypoints
//    private final List<Double> waypointsLon = List.of(-74.0060, -87.6847, -83.0458, -79.3832); // Longitude waypoints
//
//    private final List<String> shipNames = Arrays.asList(
//            "Dark Voyager", "Serenity", "Millennium Falcon", "Black Manta", "Oblivion",
//            "Marauder", "Shadowfax", "Ghost Rider", "Crimson Skies", "Ironclad",
//            "Neptune's Fury", "Valkyrie", "Stardust", "Rocinante", "Wraith",
//            "Sea Serpent", "Starfire", "Kraken", "Nemesis", "Aurora",
//            "Black Pearl", "Endeavour", "Bounty", "Mayflower", "Nina",
//            "Pinta", "Santa Maria", "Cutty Sark", "Golden Hind", "Lusitania",
//            "Olympic", "Mauretania", "Normandie", "Queen Elizabeth", "Constitution",
//            "HMS Victory", "Bismarck", "Enterprise", "Voyager", "Defiant",
//            "Prometheus", "Galactica", "Excalibur", "Andromeda", "Discovery",
//            "Eagle", "Falcon", "Orion", "Pegasus", "Phoenix",
//            "Titan", "Odyssey", "Tardis", "Nostromo", "Vortex",
//            "Challenger", "Intrepid", "Excelsior", "Reliant", "Vengeance",
//            "Vindicator", "Warrior", "Guardian", "Sentinel", "Pioneer",
//            "Explorer", "Nomad", "Odyssey", "Valiant", "Victory",
//            "Shadow", "Thunder", "Lightning", "Storm", "Tempest",
//            "Blaze", "Inferno", "Tornado", "Hurricane", "Typhoon",
//            "Whirlwind", "Cyclone", "Raging Bull", "Madonna", "Mystique",
//            "Oracle", "Panther", "Pirate", "Raven", "Rebel",
//            "Spectre", "Sphinx", "Thunderbolt", "Tiger", "Wolverine"
//    );
//
//    @PostConstruct
//    public void populateDummyData() {
//        int NUM_ENTRIES = 100000;
//        for (int i = 1; i <= NUM_ENTRIES; i++) {
//            Ship ship = new Ship();
//            ship.setName(shipNames.get(random.nextInt(shipNames.size())));
//            ship.setImoNumber("IMO" + String.format("%04d", i));
//            ship.setBuiltDate("202" + (random.nextInt(10)) + "-" + String.format("%02d", random.nextInt(12) + 1) + "-" + String.format("%02d", random.nextInt(28) + 1));
//            ship.setType(types[random.nextInt(types.length)]);
//            ship.setFlag(flags[random.nextInt(flags.length)]);
//            ship.setStatus(random.nextBoolean() ? "Active" : "Inactive");
//            shipRepository.save(ship);
//
//            Vessel vessel = new Vessel();
//            vessel.setShip(ship);
//
//            int waypointIndex = random.nextInt(waypointsLat.size());
//            vessel.setLatitude(waypointsLat.get(waypointIndex));
//            vessel.setLongitude(waypointsLon.get(waypointIndex));
//
//            vessel.setTimestamp("2024-03-31 10:00:00");
//            vesselRepository.save(vessel);
//        }
//    }
//}
