package com.kodlamaio.kodlamaiodevs.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "programmingLanguages")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","languageTechnologies"})

public class ProgrammingLanguage {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank()
    @NotNull()
    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy="programmingLanguage", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<LanguageTechnology> languageTechnologies;
}
