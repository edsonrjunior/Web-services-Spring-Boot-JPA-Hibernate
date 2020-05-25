package br.com.edson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.edson.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
