package com.kodlamaio.kodlamaiodevs.dataAccess.abstracts;

import com.kodlamaio.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
    ProgrammingLanguage getProgrammingLanguageById(Integer id);
    boolean existsByName(String name);

    boolean existsById(Integer id);
}
