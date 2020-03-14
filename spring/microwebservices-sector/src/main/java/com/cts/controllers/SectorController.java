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

import com.cts.dao.SectorRepository;
import com.cts.pojos.Sector;
@RestController
@RequestMapping("/Sector")
@CrossOrigin(origins="*", allowedHeaders="*")
public class SectorController {
@Autowired
private SectorRepository sectorRepository;
 @RequestMapping("/getAllSector")
public Iterable<Sector> getAllSector() {
 return sectorRepository.findAll();
 }
 @PostMapping("/saveSector")
public Sector saveSector(@RequestBody Sector sector) {
 System.out.println(sector);
 sectorRepository.save(sector);
 return sector;
 }
 @PutMapping("/updateSector/{id}")
 public Sector updateSector(@RequestBody Sector sector, @PathVariable("id") String id) {
 sector.setId(id);
 System.out.println(sector);
 sectorRepository.save(sector);
 return sector;
 }
 @DeleteMapping("/deleteSector/{id}")
 public Boolean deleteSector(@PathVariable("id") String id) {
 System.out.println(id);
 Optional<Sector> sector = sectorRepository.findById(id);
 sectorRepository.delete(sector.get());
 return true;
 }
 @GetMapping("/findOneInAll1234/{id}")
 public Sector findoneinall1234(@PathVariable("id") String id)
 {
 Optional<Sector> sector = sectorRepository.findById(id);
 return sector.get();
 }
}

