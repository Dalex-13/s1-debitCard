package com.nttdata.repository;

import com.nttdata.entitys.DebitCard;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardRepository extends ReactiveCrudRepository<DebitCard, String> {
}
