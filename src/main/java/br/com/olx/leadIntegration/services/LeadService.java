package br.com.olx.leadIntegration.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.olx.leadIntegration.models.Lead;
import br.com.olx.leadIntegration.repositories.LeadRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class LeadService {

	@Autowired
	private LeadRepository repo;
	
	public Lead findById(Integer id) throws ObjectNotFoundException {
		
		Optional<Lead> obj = repo.findById(id);
		
		return obj.orElseThrow(() ->  new ObjectNotFoundException("Objeto não encontrado id: " + id));
	}
	
	public List<Lead> findAll(){
		
		return repo.findAll();
	}
	
	public Lead insert(Lead lead) {
		
		lead.setId(null);
		return repo.save(lead);
	}
}
