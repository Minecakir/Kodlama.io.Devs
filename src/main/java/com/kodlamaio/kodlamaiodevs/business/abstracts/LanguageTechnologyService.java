package com.kodlamaio.kodlamaiodevs.business.abstracts;

import com.kodlamaio.kodlamaiodevs.business.requests.languageTechnology.CreateLanguageTechnologyRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.languageTechnology.DeleteLanguageTechnologyRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.languageTechnology.UpdateLanguageTechnologyRequest;
import com.kodlamaio.kodlamaiodevs.entities.LanguageTechnology;

import java.util.List;

public interface LanguageTechnologyService {
    List<LanguageTechnology> getAll();
    void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) throws Exception;

    void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest) throws Exception;

    void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest, Integer id) throws Exception;
}
