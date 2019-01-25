package br.com.eclinic.Entity.Permissao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "permissao")
public class PermissaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permis_id")
    private Long id;
    @Column(name = "permis_permissao")
    private String permissao;
    @Column(name = "permis_descricao")
    private String descricao;


    @ManyToMany(mappedBy = "permissoes")
    private List<GrupoEntity> grupos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<GrupoEntity> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<GrupoEntity> grupos) {
        this.grupos = grupos;
    }
}
