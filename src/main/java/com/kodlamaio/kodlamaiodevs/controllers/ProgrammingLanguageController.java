package com.kodlamaio.kodlamaiodevs.controllers;

import com.kodlamaio.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import com.kodlamaio.kodlamaiodevs.business.requests.CreateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.UpdateProgrammingLanguagesRequests;
import com.kodlamaio.kodlamaiodevs.business.responses.GetAllProgrammingLanguagesResponse;
import com.kodlamaio.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/softwlanguages")
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getAll")
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        return programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {this.programmingLanguageService.add(createProgrammingLanguageRequest);}

    @GetMapping("/getById")
    public ProgrammingLanguage getById(Integer id)throws Exception{return this.programmingLanguageService.getById(id);}

    @DeleteMapping("/delete")
    public void  delete(ProgrammingLanguage programmingLanguage)throws Exception{this.programmingLanguageService.delete(programmingLanguage);}

    @PutMapping("/update")
    public void update(UpdateProgrammingLanguagesRequests updateProgrammingLanguagesRequests, Integer id){this.programmingLanguageService.update(updateProgrammingLanguagesRequests,id);}
}
