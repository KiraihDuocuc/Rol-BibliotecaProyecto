package cl.bibliotecaproyecto.rol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolResponseDTO {

    private Long id;
    private String rol;
    private String descripcion;

}
