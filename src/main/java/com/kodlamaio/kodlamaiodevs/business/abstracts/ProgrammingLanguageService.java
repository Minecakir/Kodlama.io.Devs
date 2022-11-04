package com.kodlamaio.kodlamaiodevs.business.abstracts;


import com.kodlamaio.kodlamaiodevs.business.requests.CreateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.UpdateProgrammingLanguagesRequests;
import com.kodlamaio.kodlamaiodevs.business.responses.GetAllProgrammingLanguagesResponse;
import com.kodlamaio.kodlamaiodevs.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllProgrammingLanguagesResponse> getAll();
    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
    ProgrammingLanguage getById(Integer id) throws Exception;
    void delete(ProgrammingLanguage programmingLanguage) throws Exception;
    void update(UpdateProgrammingLanguagesRequests updateProgrammingLanguagesRequests, Integer id);
}
