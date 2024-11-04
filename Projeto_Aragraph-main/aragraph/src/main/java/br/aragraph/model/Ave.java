package br.aragraph.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//Estou começando mapeando como se fosse SQL para ter uma base

@Entity
@Table(name = "tb_aves")
public class Ave {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(nullable = false)
    private String nome_comum;
    
    private String nome_cientifico;
    private String ordem;
    private String familia;
    private String genero;
    private String especie;
    private String imagem;
    private String som;
    private String estado_conservacao;
    
    public Long getId() { return id; }

    public String getNome_comum() { return nome_comum; }

    public void setNome_comum(String nome_comum) { this.nome_comum = nome_comum; }

    public String getNome_cientifico() { return nome_cientifico; }

    public void setNome_cientifico(String nome_cientifico) { this.nome_cientifico = nome_cientifico; }

    public String getOrdem() { return ordem; }

    public void setOrdem(String ordem) { this.ordem = ordem; }

    public String getFamilia() { return familia; }

    public void setFamilia(String familia) { this.familia = familia; }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }

    public String getEspecie() { return especie; }

    public void setEspecie(String especie) { this.especie = especie; }

    public String getImagem() { return imagem; }

    public void setImagem(String imagem) { this.imagem = imagem; }

    public String getSom() { return som; }

    public void setSom(String som) { this.som = som; }

    public String getEstado_conservacao() { return estado_conservacao; }

    public void setEstado_conservacao(String estado_conservacao) { this.estado_conservacao = estado_conservacao; }
    
    
}
