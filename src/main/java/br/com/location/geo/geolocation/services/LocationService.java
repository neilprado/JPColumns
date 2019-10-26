package br.com.location.geo.geolocation.services;

import br.com.location.geo.geolocation.dto.request.LocationRequest;
import br.com.location.geo.geolocation.model.Location;
import br.com.location.geo.geolocation.repository.LocationRepository;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    private LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location criarLocalização(LocationRequest request){
        Location location = new Location();

        location.setNome(request.getNome());
        location.setLatitude(request.getLatitude());
        location.setLongitude(request.getLongitude());

        return locationRepository.save(location);
    }

    public Location buscarLocalizacao(Long id){
        Location location = locationRepository.findById(id).orElseThrow(
                () -> new HandlerException("Localização inexistente"));

        return location;
    }

    public List<Location> listarLocalizacoes(){
        return locationRepository.findAll();
    }

    public Location atualizarLocalizacao(Long id, LocationRequest request){
        Location location = locationRepository.findById(id).orElseThrow(
                () -> new HandlerException("Localização inexistente"));
        location.setNome(request.getNome());
        location.setLongitude(request.getLongitude());
        location.setLatitude(request.getLatitude());

        return locationRepository.save(location);
    }

    public void removerLocalizacao(Long id){
        Location location = locationRepository.findById(id).orElseThrow(
                () -> new HandlerException("Localização inexistente"));
        locationRepository.delete(location);
    }
}
