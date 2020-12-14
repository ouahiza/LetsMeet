package com.LetsMeet.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SondageRepository extends JpaRepository<Sondage, Long> {
    Optional<Sondage> findByTitre(String titre);

    Optional<Sondage> findById(Long id);
}
