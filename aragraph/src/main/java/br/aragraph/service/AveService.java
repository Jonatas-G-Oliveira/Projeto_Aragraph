package br.aragraph.service;

import br.aragraph.model.Ave;


//Apenas as contratos dos métodos serão oferecidas
//Os métodos são implementados em outras classes
public interface AveService {
    Ave findById(Long id);
    Ave create(Ave ave);
    Ave findByNomeCientifico(String nome_cientifico);
}
