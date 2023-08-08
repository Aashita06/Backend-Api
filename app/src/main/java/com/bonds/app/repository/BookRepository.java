package com.bonds.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.bonds.app.model.*;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Integer>  {

}
