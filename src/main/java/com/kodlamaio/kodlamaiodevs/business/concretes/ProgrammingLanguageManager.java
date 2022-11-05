package com.kodlamaio.kodlamaiodevs.business.concretes;

import com.kodlamaio.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import com.kodlamaio.kodlamaiodevs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.programmingLanguage.UpdateProgrammingLanguagesRequest;
import com.kodlamaio.kodlamaiodevs.business.responses.GetAllProgrammingLanguagesResponse;
import com.kodlamaio.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.kodlamaio.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository  programmingLanguageRepository){
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
        List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponse = new ArrayList<GetAllProgrammingLanguagesResponse>();

        for(ProgrammingLanguage language : programmingLanguages){
            GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());
            programmingLanguagesResponse.add(responseItem);
        }
        return programmingLanguagesResponse;
    }

    @Override
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
        ProgrammingLanguage language = new ProgrammingLanguage();

        if(this.programmingLanguageRepository.existsByName(createProgrammingLanguageRequest.getName())) {
            throw new Exception("Language has already exist");
        }
        else if(createProgrammingLanguageRequest.getName()==null){throw new Exception("Language can not be empty.");}
        language.setName(createProgrammingLanguageRequest.getName());
        this.programmingLanguageRepository.save(language);
    }

    @Override
    public ProgrammingLanguage getById(Integer id) throws Exception {
        if(this.programmingLanguageRepository.existsById(id))
        {
            return this.programmingLanguageRepository.getProgrammingLanguageById(id);
        }
        throw new Exception("Language id not found");
    }

    @Override
    public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception{

        ProgrammingLanguage language = programmingLanguageRepository.getProgrammingLanguageById(deleteProgrammingLanguageRequest.getId());
        if(this.programmingLanguageRepository.existsById(deleteProgrammingLanguageRequest.getId()) && this.programmingLanguageRepository.existsByName(deleteProgrammingLanguageRequest.getName()))
        {
            this.programmingLanguageRepository.delete(language);
        }
        else{
            throw new Exception("Language has been not found.");
        }
    }

    /*Enter id and update ProgrammingLanguage name*/
    @Override
    public void update(UpdateProgrammingLanguagesRequest updateProgrammingLanguagesRequest, Integer id) throws Exception {
        if(this.programmingLanguageRepository.existsById(id)){
            ProgrammingLanguage updatedProgLanguage = programmingLanguageRepository.getProgrammingLanguageById(id);
            updatedProgLanguage.setName(updateProgrammingLanguagesRequest.getName());
            this.programmingLanguageRepository.save(updatedProgLanguage);
        }
        else{
            throw new Exception("Language has been not found.");
        }
    }
}
