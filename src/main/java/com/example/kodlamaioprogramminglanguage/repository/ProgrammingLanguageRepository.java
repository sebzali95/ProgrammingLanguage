package com.example.kodlamaioprogramminglanguage.repository;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
