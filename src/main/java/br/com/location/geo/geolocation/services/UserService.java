package br.com.location.geo.geolocation.services;

import br.com.location.geo.geolocation.dto.request.UserRequest;
import br.com.location.geo.geolocation.model.User;
import br.com.location.geo.geolocation.repository.UserRepository;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User criarUsuario(UserRequest request){
        User usuario = new User();
        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setSenha(request.getSenha());
        usuario.setLocations(request.getLocations());

        return userRepository.save(usuario);
    }

    public User buscarUsuario(Long id){
        User user = userRepository.findById(id).orElseThrow(() -> new HandlerException("Usuário não encontrado"));
        return user;
    }

    public List<User> listarUsuarios(){
        return userRepository.findAll();
    }

    public User atualizarUsuario(Long id, UserRequest request){
        User user = userRepository.findById(id).orElseThrow(() -> new HandlerException("Usuário não encontrado"));

        user.setNome(request.getNome());
        user.setLocations(request.getLocations());
        user.setSenha(request.getSenha());
        user.setEmail(request.getEmail());

        return userRepository.save(user);
    }

    public void removerUsuario(Long id){
        User user = userRepository.findById(id).orElseThrow(() -> new HandlerException("Usuário não encontrado"));
        userRepository.delete(user);
    }
}
