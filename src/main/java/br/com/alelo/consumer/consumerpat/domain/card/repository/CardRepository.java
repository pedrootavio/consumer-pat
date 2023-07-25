package br.com.alelo.consumer.consumerpat.domain.card.repository;

import br.com.alelo.consumer.consumerpat.domain.card.entity.Card;
import br.com.alelo.consumer.consumerpat.domain.card.entity.CardBalance;
import br.com.alelo.consumer.consumerpat.domain.card.entity.CardNumber;

import java.util.Optional;

public interface CardRepository {

    void saveCard(final Card card);

    void saveCardBalance(final CardBalance cardBalance);

    Optional<CardBalance> findCardBalanceByCardNumber(final CardNumber cardNumber);

    Optional<Card> findCardByCardNumber(final CardNumber cardNumber);
}