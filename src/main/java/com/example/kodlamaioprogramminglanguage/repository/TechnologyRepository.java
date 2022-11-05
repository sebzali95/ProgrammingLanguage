package com.example.kodlamaioprogramminglanguage.repository;
import com.example.kodlamaioprogramminglanguage.model.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {

}
