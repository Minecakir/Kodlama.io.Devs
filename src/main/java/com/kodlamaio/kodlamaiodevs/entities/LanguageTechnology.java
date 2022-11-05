package com.kodlamaio.kodlamaiodevs.entities;

import lombok.*;

import javax.persistence.*;

@Table(name = "languageTechnologies")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class LanguageTechnology {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id")
    private ProgrammingLanguage programmingLanguage;

}
