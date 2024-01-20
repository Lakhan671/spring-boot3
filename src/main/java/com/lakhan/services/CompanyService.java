package com.lakhan.services;

import com.lakhan.entity.Company;
import com.lakhan.repo.CompanyRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CompanyService {
    private CompanyRepo companyRepo;

    public Company save(Company c){
       return companyRepo.save(c);
    }

    public Object getAll(){
        return companyRepo.findAll();
    }
}
