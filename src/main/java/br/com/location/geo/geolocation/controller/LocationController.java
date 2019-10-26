package br.com.location.geo.geolocation.controller;

import br.com.location.geo.geolocation.services.LocationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/location")
public class LocationController {
    private LocationService locationService;
}
