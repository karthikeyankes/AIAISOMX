package com.iwebautomata.aia.iso.isomx.part;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AiaisomxPartDatabase {

  private static final Logger log = LoggerFactory.getLogger(AiaisomxPartDatabase.class);

  @Bean
  CommandLineRunner initDatabase(AiaisomxPartRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new AiaisomxPart("painxsd", "painxml")));
      log.info("Preloading " + repository.save(new AiaisomxPart("pacsxsd", "pacsxml")));
    };
  }
}
