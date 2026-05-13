package cl.bibliotecaproyecto.rol.service;

import cl.bibliotecaproyecto.rol.dto.RolRequestDTO;
import cl.bibliotecaproyecto.rol.dto.RolResponseDTO;
import cl.bibliotecaproyecto.rol.model.Rol;
import cl.bibliotecaproyecto.rol.repository.RolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RolService {

    private final RolRepository rolRepository;

    private RolResponseDTO mapToDTO(Rol rol){
        return new RolResponseDTO(
                rol.getId(),
                rol.getRol(),
                rol.getDescripcion()
        );
    }

    public List<Rol> obtenerTodos(){return rolRepository.findAll();}

    public RolResponseDTO guardar(RolRequestDTO dto){
        Rol rol = new Rol(
                null,
                dto.getRol(),
                dto.getDescripcion()
        );
        return mapToDTO(rolRepository.save(rol));
    }

    public void eliminar(Long id){rolRepository.deleteById(id);}

    public Optional<Rol> obtenerPorId(Long id){return rolRepository.findById(id);}


}
