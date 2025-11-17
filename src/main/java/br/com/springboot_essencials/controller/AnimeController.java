package br.com.springboot_essencials.controller;

import br.com.springboot_essencials.domain.Anime;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("anime")
@Log4j2
public class AnimeController {

    @GetMapping(path = "list")
    List<Anime> listAnimes (){
        log.info("teste");
        return List.of(new Anime("Naruto"), new Anime("Dragon Ball Z"));
    }
}
