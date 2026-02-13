package com.porfolio.my_porfolio_backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.porfolio.my_porfolio_backend.models.PersonalInfo;
import com.porfolio.my_porfolio_backend.repositories.IPersonalInfoRepository;



@Service
public class PersonalInfoServiceImpl implements IPersonalInfoService {

    private final IPersonalInfoRepository personalInfoRepository;

    public PersonalInfoServiceImpl(IPersonalInfoRepository personalInfoRepository) {
        this.personalInfoRepository = personalInfoRepository;
    }

    @Override
    public void destroy(Long id) {
        personalInfoRepository.destroy(id);
    }

    @Override
    public List<PersonalInfo> index() {
        return personalInfoRepository.index();
    }

    @Override
    public Optional<PersonalInfo> show(Long id) {
        return personalInfoRepository.show(id);
    }

    @Override
    public PersonalInfo store(PersonalInfo personalInfo) {
        return personalInfoRepository.store(personalInfo);
    }

    


}
