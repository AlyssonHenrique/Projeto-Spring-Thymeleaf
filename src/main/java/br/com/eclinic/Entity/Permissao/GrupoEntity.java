package br.com.eclinic.Entity.Permissao;

import br.com.eclinic.Entity.Usuario.UsuarioEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "grupo")
public class GrupoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grupo_id")
    private Long id;
    @Column(name = "grupo_nome")
    private String nome;
    @Column(name = "grupo_descricao")
    private String descricao;


    @ManyToMany
    @JoinTable(
            name="usuario_grupo",
            joinColumns=@JoinColumn(name="grupo_id", referencedColumnName="grupo_id"),
            inverseJoinColumns=@JoinColumn(name="usuario_id", referencedColumnName="usuario_id")
    )
    private List<UsuarioEntity> usuarios;

    @ManyToMany
    @JoinTable(
            name="permissa_grupo",
            joinColumns=@JoinColumn(name="grupo_id", referencedColumnName="grupo_id"),
            inverseJoinColumns=@JoinColumn(name="permis_id", referencedColumnName="permis_id")
    )
    private List<PermissaoEntity> permissoes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<UsuarioEntity> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioEntity> usuarios) {
        this.usuarios = usuarios;
    }

    public List<PermissaoEntity> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<PermissaoEntity> permissoes) {
        this.permissoes = permissoes;
    }
}
