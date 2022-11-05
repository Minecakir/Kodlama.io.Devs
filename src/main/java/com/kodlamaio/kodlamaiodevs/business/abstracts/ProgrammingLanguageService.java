package com.kodlamaio.kodlamaiodevs.business.abstracts;


import com.kodlamaio.kodlamaiodevs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.programmingLanguage.UpdateProgrammingLanguagesRequest;
import com.kodlamaio.kodlamaiodevs.business.responses.GetAllProgrammingLanguagesResponse;
import com.kodlamaio.kodlamaiodevs.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllProgrammingLanguagesResponse> getAll();
    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
    ProgrammingLanguage getById(Integer id) throws Exception;
    void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception;
    void update(UpdateProgrammingLanguagesRequest updateProgrammingLanguagesRequest, Integer id) throws Exception;
}
