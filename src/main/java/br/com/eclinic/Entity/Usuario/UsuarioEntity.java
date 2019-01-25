package br.com.eclinic.Entity.Usuario;

import br.com.eclinic.Entity.Permissao.GrupoEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long id;
    @Column(name = "usuario_nome")
    private String nome;
    @Column(name = "usuario_login")
    private String login;
    @Column(name = "usuario_senha")
    private String senha;
    @Column(name = "usuario_ativo")
    private boolean ativo;

    @JoinTable(name = "usuario_grupo",
            joinColumns = {@JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")},
            inverseJoinColumns = {@JoinColumn(name = "grupo_id", referencedColumnName = "grupo_id")}
    )
    @ManyToMany(cascade ={ CascadeType.PERSIST, CascadeType.MERGE})
    private List<GrupoEntity> grupos;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<GrupoEntity> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<GrupoEntity> grupos) {
        this.grupos = grupos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioEntity)) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
