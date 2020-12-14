package com.LetsMeet.models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChoixRepository extends JpaRepository<Choix, Long> {

    Optional<Choix> findById(Long id);


}
