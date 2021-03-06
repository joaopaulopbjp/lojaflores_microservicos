package br.edu.ifpb.dac.loja.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.loja.modelo.Compra;
import br.edu.ifpb.dac.loja.modelo.dto.CompraDTO;
import br.edu.ifpb.dac.loja.servico.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;

	
	@RequestMapping("/{id}")
	public Compra getById(@PathVariable("id") Long id) {
		return compraService.getById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Compra realizaCompra(@RequestBody CompraDTO compra) {
		System.out.println("CompraController_realizarCompra. ");
		return compraService.realizarCompra(compra);
	}
}
