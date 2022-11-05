package com.kodlamaio.kodlamaiodevs.business.requests.programmingLanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteProgrammingLanguageRequest {
    private Integer id;
    private String name;
}
