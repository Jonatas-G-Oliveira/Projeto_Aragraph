
package br.aragraph.service;

import br.aragraph.model.Ave;

import org.springframework.stereotype.Service;
import br.aragraph.repository.AveRepository;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;




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
        //Eu tenho que retornar listas...
        //Usar lista ou pages...
        //O que é pageReqquest?
        //Page<Ave> aves = aveRepository.findByFamilia(new PageRequest(0,10,Sort.Direction.ASC));
        
        return null;
    }
    
    
    
}
