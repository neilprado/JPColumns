package br.com.location.geo.geolocation.repository;

import br.com.location.geo.geolocation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
