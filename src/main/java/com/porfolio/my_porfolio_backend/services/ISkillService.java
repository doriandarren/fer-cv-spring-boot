package com.porfolio.my_porfolio_backend.services;

import java.util.List;
import java.util.Optional;

import com.porfolio.my_porfolio_backend.models.Skill;

public interface ISkillService {

    Skill save(Skill skill);
    Optional<Skill> findById(Long id);
    List<Skill> findAll();
    void deleteById(Long id);
    List<Skill> findByPersonalInfoId(Long personalInfoId);

}
