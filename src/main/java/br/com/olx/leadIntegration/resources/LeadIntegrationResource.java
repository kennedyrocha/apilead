package br.com.olx.leadIntegration.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.olx.leadIntegration.models.Lead;
import br.com.olx.leadIntegration.services.LeadService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping("/leads")
public class LeadIntegrationResource {
    
	@Autowired
	private LeadService service;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Lead lead){
		
		lead = service.insert(lead);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(lead.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Lead> find(@PathVariable Integer id) throws ObjectNotFoundException{
		
		Lead obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Lead>> getAll(){
		
		List<Lead> obj = service.findAll();
		
		return ResponseEntity.ok().body(obj);
	}
}