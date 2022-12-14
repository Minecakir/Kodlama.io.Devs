package com.kodlamaio.kodlamaiodevs.controllers;

import com.kodlamaio.kodlamaiodevs.business.abstracts.LanguageTechnologyService;
import com.kodlamaio.kodlamaiodevs.business.requests.languageTechnology.CreateLanguageTechnologyRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.languageTechnology.DeleteLanguageTechnologyRequest;
import com.kodlamaio.kodlamaiodevs.business.requests.languageTechnology.UpdateLanguageTechnologyRequest;
import com.kodlamaio.kodlamaiodevs.entities.LanguageTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languagetechnology")
public class LanguageTechnologyController {
    private LanguageTechnologyService languageTechnologyService;

    @Autowired
    public LanguageTechnologyController(LanguageTechnologyService languageTechnologyService) {
        this.languageTechnologyService = languageTechnologyService;
    }

    @GetMapping("/getAll")
    public List<LanguageTechnology> getAll() {
        return languageTechnologyService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) throws Exception {this.languageTechnologyService.add(createLanguageTechnologyRequest);}

    @DeleteMapping("/delete")
    public void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest)throws Exception{this.languageTechnologyService.delete(deleteLanguageTechnologyRequest);}

    @PutMapping("/update")
    public void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest,Integer id)throws Exception{this.languageTechnologyService.update(updateLanguageTechnologyRequest,id);}

}
