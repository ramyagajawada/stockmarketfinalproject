package com.cts.Dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.ManageCompany;

public interface CompanyRepository extends CrudRepository<ManageCompany,String> {

}
