package com.vepilef.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vepilef.cursomc.domain.Pedido;
import com.vepilef.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) { 
		Optional<Pedido> obj = repo.findById(id); 
		return obj.orElse(null);
		}
		//return obj;

	
/*	public Pedido insert(Pedido obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Pedido update(Pedido obj) {
		Pedido newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.delete(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos");
		}
	}
	
	public List<Pedido> findAll() {
		return repo.findAll();
	}
	
	public Page<Pedido> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	public Pedido fromDTO(PedidoDTO objDto) {
		return new Pedido(objDto.getId(), objDto.getNome());
	}

	private void updateData(Pedido newObj, Pedido obj) {
		newObj.setNome(obj.getNome());
	} */
}

