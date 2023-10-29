package pe.edu.cibertec.DAWII_RamirezAquinoClever.DAWII_CL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_RamirezAquinoClever.DAWII_CL2.model.bd.Usuario;
@Repository
public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer> {
    Usuario findByEmail(String email);
    Usuario findByNomusuario(String nomusuario);
}
