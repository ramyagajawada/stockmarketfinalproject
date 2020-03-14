package com.cts.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.CompanyRepository;
import com.cts.pojos.ManageCompany;
@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
@RequestMapping("/ManageCompany")
public class CompanyController {
 @Autowired
 private CompanyRepository companyRepository;
 @RequestMapping("/getAllCompany")
 public Iterable<ManageCompany> getAllCompany()
 {
 return companyRepository.findAll();
 }
 @PostMapping("/savecompany")
 public ManageCompany savecompany(@RequestBody ManageCompany company)
 {
  System.out.println(company);
  companyRepository.save(company);
  return company;
 }
 @PutMapping("/updatecompany/{companyName}")
public ManageCompany updatecompany(@RequestBody ManageCompany company,@PathVariable("companyName") String companyName)
 {
  company.setCompanyName(companyName);
  System.out.println(company);
  companyRepository.save(company);
  return company;
 }
 @DeleteMapping("/deletecompany/{companyName}")
 public boolean deletecompany(@PathVariable("companyName") String companyName)
 {
 System.out.println(companyName);
  companyRepository.deleteById(companyName);
  return true;
 }
 @GetMapping("/findOneInAll4/{companyName}")
 public ManageCompany findOneInAll4(@PathVariable("companyName") String companyName)
 {
  Optional<ManageCompany> company= companyRepository.findById(companyName);
 return company.get();
}

}



