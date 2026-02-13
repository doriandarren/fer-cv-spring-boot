package com.porfolio.my_porfolio_backend.repositories;

import java.util.List;
import java.util.Optional;

import com.porfolio.my_porfolio_backend.models.PersonalInfo;



public interface IPersonalInfoRepository {

    List<PersonalInfo> index();
    
    Optional<PersonalInfo> show(Long id);
    
    PersonalInfo store(PersonalInfo personalInfo);
    
    void destroy(Long id);

}
