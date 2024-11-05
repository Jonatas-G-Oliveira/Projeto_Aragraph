
package br.aragraph.repository;

import br.aragraph.model.Ave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AveRepository extends JpaRepository<Ave,Long>{
    //Não é necessário implementar nada para acessar o banco de dados
}
