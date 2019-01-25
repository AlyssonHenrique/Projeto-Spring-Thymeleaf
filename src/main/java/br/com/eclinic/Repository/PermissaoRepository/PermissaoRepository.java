package br.com.eclinic.Repository.PermissaoRepository;

import br.com.eclinic.Entity.Permissao.GrupoEntity;
import br.com.eclinic.Entity.Permissao.PermissaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {
    List<PermissaoEntity> findByGruposIn(GrupoEntity grupo);
}
