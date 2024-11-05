
package br.aragraph.service;

import br.aragraph.model.Ave;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;
import br.aragraph.repository.AveRepository;




//Aqui vamos implementar todos os servicos
@Service
public class AvesServiceImpl implements AveService {
    //Essa varíavel é responsável pelo acesso ao banco de dados
    private final AveRepository aveRepository;
    
    public AvesServiceImpl(AveRepository aveRepository){
        this.aveRepository = aveRepository;
    }
    
    @Override
    public Ave findById(Long id){
        //Procura uma ave no banco e caso eu não encontre eu envio uma excessão
        return aveRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    
    @Override
    public Ave create(Ave ave){
        if(ave.getId() != null && aveRepository.existsById(ave.getId())){
            throw new IllegalArgumentException("Essa ave ja existe");
       }
       return aveRepository.save(ave);
    }
    
    @Override
    public Ave findByNomeCientifico(String nome_cientifico){
        return null;
    }
}
