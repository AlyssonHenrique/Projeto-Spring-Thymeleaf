package br.com.eclinic.Service;

import br.com.eclinic.Entity.Permissao.GrupoEntity;
import br.com.eclinic.Model.GrupoModel;
import br.com.eclinic.Repository.PermissaoRepository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;

    /**CONSULA OS GRUPOS CADASTRADOS*/
    @Transactional(readOnly = true)
    public List<GrupoModel> consultarGrupos(){

        List<GrupoModel> gruposModel =  new ArrayList<GrupoModel>();

        /*CONSULTA TODOS OS GRUPOS*/
        List<GrupoEntity> gruposEntity = this.grupoRepository.findAll();


        gruposEntity.forEach(grupo ->{
            gruposModel.add(new GrupoModel(grupo.getId(), grupo.getDescricao()));
        });

        return gruposModel;
    }
}
