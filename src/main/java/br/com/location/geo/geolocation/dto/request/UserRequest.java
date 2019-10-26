package br.com.location.geo.geolocation.dto.request;

import br.com.location.geo.geolocation.model.Location;
import lombok.Data;

import java.util.List;

@Data
public class UserRequest {
    private String nome;
    private String email;
    private String senha;
    private List<Location> locations;
}
