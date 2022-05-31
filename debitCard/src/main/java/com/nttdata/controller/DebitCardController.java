package com.nttdata.controller;

import com.nttdata.entitys.DebitCard;
import com.nttdata.service.DebitCardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class DebitCardController {

    private final DebitCardService service;

    @PostMapping("/add")
    public Mono<DebitCard> registrar(@RequestBody DebitCard debitCard){
        log.info("creando movimiento de credito");
        return service.save(debitCard);
    }

    @GetMapping("/listar")
    public Flux<DebitCard> listAll(){
        log.info("listando movimiento de credito");
        return service.findAll();
    }


    @GetMapping("/listar/{id}")
    public Mono<DebitCard> listById(@PathVariable String id){
        log.info("buscando movimiento de credito por ID");
        return service.findById(id);
    }

    @PutMapping("/actualizar/{id}")
    public Mono<DebitCard> putById(@PathVariable String id, @RequestBody DebitCard debitCard){
        log.info("Actualizar movmiento de credito por Id");
        return service.updateById(id, debitCard);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteById(@PathVariable String id){
        log.info("Eliminando movimiento de credito por Id");
        return service.delete(id);
    }

}
