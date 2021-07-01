package br.com.aula2.tm.metroquadrado.controller;

import br.com.aula2.tm.metroquadrado.dto.CasaDTO;
import br.com.aula2.tm.metroquadrado.model.Casa;
import br.com.aula2.tm.metroquadrado.model.Comodo;
import br.com.aula2.tm.metroquadrado.utils.MetroQuadrado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/aula2/tm")
public class MetroQuadradoController {

    @PostMapping("/casa")
    public ResponseEntity<?> createCasa(@RequestBody Casa casa) {
        double metrosQuadrados = 0.0;

        for(Comodo comodo : casa.getComodos()) {
            metrosQuadrados += MetroQuadrado.metrosQuadrado(comodo.getLargura(), comodo.getComprimento());
        }

        double valor = MetroQuadrado.valorMetroQuadrado(metrosQuadrados);
        Comodo maiorComodo = MetroQuadrado.maiorComodo(casa.getComodos());

        Map<String, Double> comodoMetroQuadrado = MetroQuadrado.metroQuadradoComodo(casa.getComodos());

        CasaDTO casaDTO = new CasaDTO(casa.getNome(), casa.getEndereco(), casa.getComodos(), metrosQuadrados, valor, maiorComodo, comodoMetroQuadrado);

        return ResponseEntity.status(HttpStatus.CREATED).body(casaDTO);
    }
}
