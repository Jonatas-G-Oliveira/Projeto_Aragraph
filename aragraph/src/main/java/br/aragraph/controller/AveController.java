package br.aragraph.controller;

import java.net.URI;
import br.aragraph.model.Ave;
import br.aragraph.service.AveService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

//Controller responsável por expor os endpoints da aplicação


@RestController
@RequestMapping("/aves")
public class AveController {
    
    //Acessando a camada de servicos
    //Na camada de servicos que ficam as regras de negócio
    //Vamos usar a interface para não expor as implementações
    private final AveService aveService;
    public AveController (AveService aveService){
        this.aveService = aveService;
    }
    
    //Expondo Endpoints
    @GetMapping("/{id}")
    public ResponseEntity<Ave> findById(@PathVariable Long id){
        var ave = aveService.findById(id);
        
        //construindo uma resposta responseEntitty
        //A validação é feita na camada de negócio
        return ResponseEntity.ok(ave);
    }
    
    //Usamos requestBody porque vamos pegar o corpo todo do JSON
    @PostMapping
    public ResponseEntity<Ave> create(@RequestBody Ave aveToCreate){
        var aveCreated = aveService.create(aveToCreate);
        
        //Retornarndo a url com o ID que foi criado//Não sei direito o porque de tudo isso
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(aveCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(aveCreated);
    }
    
}
