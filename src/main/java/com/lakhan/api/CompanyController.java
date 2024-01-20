package com.lakhan.api;

import com.lakhan.entity.Company;
import com.lakhan.services.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class CompanyController {
   private CompanyService companyService;
   @GetMapping("/company")
    public ResponseEntity<Company> saveCompany(@RequestParam("name") String name){
            return new  ResponseEntity<>(companyService.save(new Company(name)),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<Object>getAll(){
       return  new ResponseEntity<>(companyService.getAll(),HttpStatus.OK);
    }
}
