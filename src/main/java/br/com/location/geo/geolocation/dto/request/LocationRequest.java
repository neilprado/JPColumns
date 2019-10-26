package br.com.location.geo.geolocation.dto.request;

import lombok.Data;

@Data
public class LocationRequest {
    private String nome;
    private float latitude;
    private float longitude;
}
