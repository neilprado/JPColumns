package br.com.location.geo.geolocation.repository;

import br.com.location.geo.geolocation.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
