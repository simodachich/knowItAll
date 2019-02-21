package fr.knowitall.dachich.m.repository;

import fr.knowitall.dachich.m.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
