package br.aragraph.service;

import br.aragraph.model.Ave;
import java.util.List;

//Apenas as contratos dos métodos serão oferecidas
//Os métodos são implementados em outras classes
public interface AveService {
    Ave create(Ave ave);
    Ave getAveByTaxon(String taxon);
    Ave getAveByNomeComum(String nomeComum);
    List<Ave> getAveByFamilia(String familia);
}