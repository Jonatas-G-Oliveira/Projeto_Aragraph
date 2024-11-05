package br.aragraph.controller;



import br.aragraph.model.Ave;
import br.aragraph.service.AveService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//Controller responsável por expor os endpoints da aplicação


@RestController
@RequestMapping("/aves")
public class AveController {
   
    //Vamos usar a interface de serviço para não expor as implementações
    private final AveService aveService;
    
    public AveController (AveService aveService){
        this.aveService = aveService;
    }
    
    
    //Temos problemas porque temos dois ID's nnos nossos pássaros
    //Ele entra em conflito quando tem pegar um pássaro 
    
    
    @GetMapping("/taxon/{taxon}")
    public ResponseEntity <Ave> getAveByTaxon(@PathVariable String taxon){
        Ave ave_encontrada = aveService.getAveByTaxon(taxon);
        return ResponseEntity.ok().body(ave_encontrada);
    }
    
    @GetMapping("/nome/{nome_comum}")
    public ResponseEntity <Ave> getAveByNomeComum(@PathVariable String nome_comum){
        Ave ave_encontrada = aveService.getAveByNomeComum(nome_comum);
        return ResponseEntity.ok().body(ave_encontrada);
    }
   
    @PostMapping("/addAve")
    public void create(@RequestBody Ave ave){
        aveService.create(ave);
    }
    
}
