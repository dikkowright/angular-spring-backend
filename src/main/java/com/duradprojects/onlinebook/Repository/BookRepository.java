package com.duradprojects.onlinebook.Repository;

import com.duradprojects.onlinebook.Model.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.annotation.Resource;


@RepositoryRestResource(collectionResourceRel = "books", path = "book")
public interface BookRepository extends JpaRepository<BookEntity, Long> {

    @RestResource(path = "categoryid" )
   Page<BookEntity> findByCategoryId(@Param("id") Long id, Pageable pageable);

    @RestResource(path = "searchbykeyword" )
    Page<BookEntity> findByNameContaining(@Param("name")  String keyword, Pageable pageable);




}
