/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.compromisso.entity;

import java.time.LocalDateTime;

/**
 *
 * @author hiane
 */

/**
 * Classe que representa um Compromisso dentro do sistema.
 */
public class Compromisso {

    private int id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataHora;
    private String local;

    // Construtor padrão
    public Compromisso() {}

    // Construtor com parâmetros
    public Compromisso(int id, String titulo, String descricao, LocalDateTime dataHora, String local) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.local = local;
    }

    // Métodos Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
}