package com.porfolio.my_porfolio_backend.services;

import java.util.List;
import java.util.Optional;

import com.porfolio.my_porfolio_backend.models.PersonalInfo;

public interface IPersonalInfoService {

    List<PersonalInfo> index();

    Optional<PersonalInfo> show(Long id);

    PersonalInfo store(PersonalInfo personalInfo);

    void destroy(Long id);

}
