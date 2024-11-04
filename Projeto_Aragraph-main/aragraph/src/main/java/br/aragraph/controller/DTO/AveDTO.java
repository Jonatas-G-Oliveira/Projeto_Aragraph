package br.aragraph.controller.DTO;

import br.aragraph.model.Ave;


//JA tem construtor automatico
//poderia ser uma classe

public record AveDTO(
		long id,
		String nome_passaro) {
	
	
	public Ave map() {
		Ave ave = new Ave();
		
		ave.setNome_comum(this.nome_passaro);
		return ave;
	}
}
