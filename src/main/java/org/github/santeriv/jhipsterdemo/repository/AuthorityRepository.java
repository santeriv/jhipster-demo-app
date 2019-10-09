package org.github.santeriv.jhipsterdemo.repository;

import org.github.santeriv.jhipsterdemo.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
