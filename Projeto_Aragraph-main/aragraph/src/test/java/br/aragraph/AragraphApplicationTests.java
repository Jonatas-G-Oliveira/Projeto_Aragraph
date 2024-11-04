package br.aragraph;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.aragraph.repository.AveRepository;

@SpringBootTest
class AragraphApplicationTests {

	@Autowired
	AveRepository aveRepository;
	
	@Test
	public void criarBaseDados() {
		//Ler dados do arquivo
		//Conectar no banco certo
	}

}
