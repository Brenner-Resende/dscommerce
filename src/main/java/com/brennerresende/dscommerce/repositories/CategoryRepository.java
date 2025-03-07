package com.brennerresende.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brennerresende.dscommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
