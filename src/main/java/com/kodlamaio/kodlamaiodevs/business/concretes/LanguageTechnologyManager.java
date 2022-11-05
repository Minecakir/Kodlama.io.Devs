package com.kodlamaio.kodlamaiodevs.business.concretes;

import com.kodlamaio.kodlamaiodevs.business.abstracts.LanguageTechnologyService;
import com.kodlamaio.kodlamaiodevs.business.requests.languageTechnology.CreateLanguageTechnologyRequest;
import com.kodlamaio.kodlamaiodevs.dataAccess.abstracts.LanguageTechnologyRepository;
import com.kodlamaio.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.kodlamaio.kodlamaiodevs.entities.LanguageTechnology;
import com.kodlamaio.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageTechnologyManager implements LanguageTechnologyService {
    private LanguageTechnologyRepository languageTechnologyRepository;
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public LanguageTechnologyManager(LanguageTechnologyRepository languageTechnologyRepository,ProgrammingLanguageRepository programmingLanguageRepository){
        this.languageTechnologyRepository = languageTechnologyRepository;
        this.programmingLanguageRepository = programmingLanguageRepository;
    }
    @Override
    public List<LanguageTechnology> getAll() {
        return this.languageTechnologyRepository.findAll();
    }

    @Override
    public void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) throws Exception {
        LanguageTechnology languageTechnology = new LanguageTechnology();
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getProgrammingLanguageById(createLanguageTechnologyRequest.getLanguage_id());

        if(this.languageTechnologyRepository.existsByName(createLanguageTechnologyRequest.getName())) {
            throw new Exception("Language technology has already exist");
        }
        else if(this.languageTechnologyRepository.existsById(createLanguageTechnologyRequest.getLanguage_id()))
        {
            languageTechnology.setName(createLanguageTechnologyRequest.getName());
            languageTechnology.setProgrammingLanguage(programmingLanguage);
            this.languageTechnologyRepository.save(languageTechnology);
        }
        else{throw new Exception("Programming Language id not found.");}




    }
}
