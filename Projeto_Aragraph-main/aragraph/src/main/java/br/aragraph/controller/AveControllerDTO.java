package br.aragraph.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.aragraph.controller.DTO.AveDTO;
import br.aragraph.model.Ave;
import br.aragraph.service.AveService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/novo-caminho")
public class AveControllerDTO {

		private final  AveService aveService;
		
		public AveControllerDTO(AveService aveService) {
			this.aveService = aveService;
		}
		
		@PostMapping
		public ResponseEntity<void> salvarPassaro(@RequestBody AveDTO ave){
			Ave aveEntity = ave.map();
			
			aveService.create(aveEntity);
			
			URI location = ServletUriComponentsBuilder.
					fromCurrentRequest().
					path("{id}").
					buildAndExpand(aveEntity.getId()).
					toUri();
			return ResponseEntity.created(location).build();
		}
}
