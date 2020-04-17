package com.duradprojects.onlinebook.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbl_category")
public class BookCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String category_name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<BookEntity> book;




    @Override
    public String toString() {
        return "BookCategoryEntity{" +
                "id=" + id +
                ", category_name='" + category_name + '\'' +
                ", book=" + book +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Set<BookEntity> getBook() {
        return book;
    }

    public void setBook(Set<BookEntity> book) {
        this.book = book;
    }
}
