package com.lakhan.repo;

import com.lakhan.entity.Company;
import org.springframework.data.repository.CrudRepository;

public interface  CompanyRepo  extends CrudRepository<Company,Integer> {
}
