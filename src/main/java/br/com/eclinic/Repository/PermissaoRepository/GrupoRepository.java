package br.com.eclinic.Repository.PermissaoRepository;

import br.com.eclinic.Entity.Permissao.GrupoEntity;
import br.com.eclinic.Entity.Usuario.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrupoRepository extends JpaRepository<GrupoEntity, Long> {
    List<GrupoEntity> findByUsuariosIn(UsuarioEntity usuarioEntity);
}
