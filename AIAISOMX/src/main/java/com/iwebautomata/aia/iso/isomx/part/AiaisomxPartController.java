package com.iwebautomata.aia.iso.isomx.part;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AiaisomxPartController {

  private final AiaisomxPartRepository repository;

  AiaisomxPartController(AiaisomxPartRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/aiaisomxparts")
  List<AiaisomxPart> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/aiaisomxparts")
  AiaisomxPart newAiaisomxPart(@RequestBody AiaisomxPart newAiaisomxPart) {
    return repository.save(newAiaisomxPart);
  }

  // Single item
  
  @GetMapping("/aiaisomxparts/{id}")
  AiaisomxPart one(@PathVariable Long id) {
    
    return repository.findById(id).orElseThrow(() -> new AiaisomxPartNotFoundException(id));
  }

  @PutMapping("/aiaisomxparts/{id}")
  AiaisomxPart replaceAiaisomxPart(@RequestBody AiaisomxPart newAiaisomxPart, @PathVariable Long id) {
    
    return repository.findById(id)
      .map(AiaisomxPart -> {
        AiaisomxPart.setxsdLocation(newAiaisomxPart.getxsdLocation());
        AiaisomxPart.setxmlLocation(newAiaisomxPart.getxmlLocation());
        return repository.save(AiaisomxPart);
      })
      .orElseGet(() -> {
        newAiaisomxPart.setId(id);
        return repository.save(newAiaisomxPart);
      });
  }

  @DeleteMapping("/aiaisomxparts/{id}")
  void deleteAiaisomxPart(@PathVariable Long id) {
    repository.deleteById(id);
  }
}