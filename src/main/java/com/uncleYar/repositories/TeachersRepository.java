package com.uncleYar.repositories;

import com.uncleYar.entities.Teachers;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("teachersReposotory")
public interface TeachersRepository extends CrudRepository<Teachers, Integer>{
	@Query("from Teachers where course like %:course%")
	public List<Teachers> search(@Param("course") String course);
}