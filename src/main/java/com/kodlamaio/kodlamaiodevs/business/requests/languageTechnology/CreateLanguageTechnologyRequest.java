package com.kodlamaio.kodlamaiodevs.business.requests.languageTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageTechnologyRequest {
    private  int language_id;
    private String name;
}
