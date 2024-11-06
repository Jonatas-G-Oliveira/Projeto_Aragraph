
package br.aragraph.service;

import br.aragraph.model.Ave;

import org.springframework.stereotype.Service;
import br.aragraph.repository.AveRepository;
import java.util.List;




//Aqui vamos implementar todas as regras de negócio definidas na interface
//Precisa adicionar as excessões e refinar os métodos
@Service
public class AvesServiceImpl implements AveService {
    
    private final AveRepository aveRepository;
    
    
    public AvesServiceImpl(AveRepository aveRepository){
        this.aveRepository = aveRepository;
    }
    
    @Override
    public Ave create(Ave ave){
       return aveRepository.save(ave);
    }
    
    @Override
    public Ave getAveByTaxon(String taxon){
        return aveRepository.findByTaxon(taxon);
    }

    @Override
    public Ave getAveByNomeComum(String nomeComum) {
        return aveRepository.findByNomeComum(nomeComum);
    }

    @Override
    public List<Ave> getAveByFamilia(String familia) {
        return aveRepository.findByFamilia(familia);
    }
    
    @Override
    public List<Ave> getAllAves(){
        return aveRepository.findAll();
        //se for vazio implementar exceção
    }
    
    
    
    
    
}
