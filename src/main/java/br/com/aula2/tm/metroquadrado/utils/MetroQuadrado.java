package br.com.aula2.tm.metroquadrado.utils;

import br.com.aula2.tm.metroquadrado.model.Comodo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetroQuadrado {
    public static double metrosQuadrado(double largura, double comprimento) {
        return largura * comprimento;
    }

    public static double valorMetroQuadrado(double totalMetrosQuadrados) {
        return totalMetrosQuadrados * 800;
    }

    public static Comodo maiorComodo(List<Comodo> comodos) {
        Comodo maior = comodos.get(0);

        for (Comodo comodo : comodos) {
            double metroQuadrado = metrosQuadrado(comodo.getComprimento(), comodo.getLargura());
            double metroQuadradoMaior = metrosQuadrado(maior.getLargura(), maior.getComprimento());

            if(metroQuadrado > metroQuadradoMaior) {
                maior = comodo;
            }
        }

        return maior;
    }

    public static Map<String, Double> metroQuadradoComodo(List<Comodo> comodos) {
        Map<String, Double> res = new HashMap<>();

        for(Comodo comodo : comodos) {
            res.put(comodo.getNome(), metrosQuadrado(comodo.getLargura(), comodo.getComprimento()));
        }

        return res;
    }
}
