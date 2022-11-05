package com.kodlamaio.kodlamaiodevs.controllers;

import com.kodlamaio.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import com.kodlamaio.kodlamaiodevs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.programmingLanguage.UpdateProgrammingLanguagesRequest;
import com.kodlamaio.kodlamaiodevs.business.responses.GetAllProgrammingLanguagesResponse;
import com.kodlamaio.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
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
    public void  delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest)throws Exception{this.programmingLanguageService.delete(deleteProgrammingLanguageRequest);}

    @PutMapping("/update")
    public void update(UpdateProgrammingLanguagesRequest updateProgrammingLanguagesRequest, Integer id)throws Exception{this.programmingLanguageService.update(updateProgrammingLanguagesRequest,id);}
}
