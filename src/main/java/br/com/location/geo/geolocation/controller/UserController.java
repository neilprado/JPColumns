package br.com.location.geo.geolocation.controller;

import br.com.location.geo.geolocation.dto.request.UserRequest;
import br.com.location.geo.geolocation.dto.response.UserResponse;
import br.com.location.geo.geolocation.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> criarUsuario(UserRequest userRequest){

    }
}
