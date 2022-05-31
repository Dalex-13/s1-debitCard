package com.nttdata.service;

import com.nttdata.entitys.DebitCard;
import com.nttdata.repository.DebitCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class DebitCardServiceImpl implements DebitCardService{

    private final DebitCardRepository repository;

    @Override
    public Flux<DebitCard> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<DebitCard> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<DebitCard> save(DebitCard debitCard) {
        return repository.save(debitCard);
    }

    @Override
    public Mono<DebitCard> updateById(String id, DebitCard debitCard) {
        return this.findById(id)
                .flatMap(entity -> this.save(debitCard))
                .switchIfEmpty( Mono.error(new Exception()));
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

}
