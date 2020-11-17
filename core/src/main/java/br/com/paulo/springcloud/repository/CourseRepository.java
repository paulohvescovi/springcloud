package br.com.paulo.springcloud.repository;


import br.com.paulo.springcloud.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {



}
