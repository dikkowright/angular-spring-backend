package com.duradprojects.onlinebook.Repository;

import com.duradprojects.onlinebook.Model.BookCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategoryEntity, Long> {



}
