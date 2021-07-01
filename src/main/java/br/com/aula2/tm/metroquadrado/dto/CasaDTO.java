package br.com.aula2.tm.metroquadrado.dto;

import br.com.aula2.tm.metroquadrado.model.Comodo;

import java.util.List;
import java.util.Map;

public class CasaDTO {

    private String nome;
    private String endereco;
    private List<Comodo> comodos;
    private Double metrosQuadrados;
    private Double valor;
    private Comodo maiorComodo;
    private Map<String, Double> comodoMetroQuadrado;

    public CasaDTO(String nome, String endereco, List<Comodo> comodos, Double metrosQuadrados, Double valor, Comodo maiorComodo, Map<String, Double> comodoMetroQuadrado) {
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
        this.metrosQuadrados = metrosQuadrados;
        this.valor = valor;
        this.maiorComodo = maiorComodo;
        this.comodoMetroQuadrado = comodoMetroQuadrado;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public Double getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public Double getValor() {
        return valor;
    }

    public Comodo getMaiorComodo() {
        return maiorComodo;
    }

    public Map<String, Double> getComodoMetroQuadrado() {
        return comodoMetroQuadrado;
    }
}
