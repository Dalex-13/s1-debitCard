package com.nttdata.service;

import com.nttdata.entitys.DebitCard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DebitCardService {
    public Flux<DebitCard> findAll();

    public Mono<DebitCard> findById(String id);

    public Mono<DebitCard> save(DebitCard debitCard);

    public Mono<DebitCard> updateById(String id, DebitCard debitCard);

    public Mono<Void> delete(String id);
}
