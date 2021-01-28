package com.graphQL.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Book {
    @Id
    private String isbn;
    private String[] authors;
    private String publisher;
    private String title;
    private String publishDate;

}
