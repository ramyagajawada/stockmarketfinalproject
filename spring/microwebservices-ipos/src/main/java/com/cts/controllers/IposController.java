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

import com.cts.dao.IposRepository;
import com.cts.pojos.Ipos;
@RestController
@RequestMapping("/Ipos")
@CrossOrigin(origins="*", allowedHeaders="*")
public class IposController {
 @Autowired
 private IposRepository iposRepository;
 @RequestMapping("/getAllIpos")
 public Iterable<Ipos> getAllIpos() {
 return iposRepository.findAll();
}
@PostMapping("/saveIpos")
 public Ipos saveIpos(@RequestBody Ipos ipos) {
System.out.println(ipos);
iposRepository.save(ipos);
return ipos;
}
 @PutMapping("/updateIpos/{id}")
public Ipos updateIpos(@RequestBody Ipos ipos, @PathVariable("id") String id) {
ipos.setId(id);
System.out.println(ipos);
 iposRepository.save(ipos);
 return ipos;
}
 @DeleteMapping("/deleteIpos/{id}")
public Boolean deleteIpos(@PathVariable("id") String id) {
System.out.println(id);
Optional<Ipos> ipos = iposRepository.findById(id);
iposRepository.delete(ipos.get());
 return true;
}
@GetMapping("/findOneInAll123/{id}")
public Ipos findoneinall123(@PathVariable("id") String id)
{
 Optional<Ipos> ipos = iposRepository.findById(id);
 return ipos.get();
}
}

