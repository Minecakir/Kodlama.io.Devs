package com.kodlamaio.kodlamaiodevs.dataAccess.abstracts;

import com.kodlamaio.kodlamaiodevs.entities.LanguageTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageTechnologyRepository extends JpaRepository<LanguageTechnology, Integer> {
    boolean existsByName(String name);
}
