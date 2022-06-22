package br.com.olx.leadIntegration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.olx.leadIntegration.models.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Integer> {

}
