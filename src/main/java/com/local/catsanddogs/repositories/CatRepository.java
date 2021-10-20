package com.local.catsanddogs.repositories;

import com.local.catsanddogs.models.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Long> {
}
