package br.com.alelo.consumer.consumerpat.domain.ledger.repository;

import br.com.alelo.consumer.consumerpat.domain.ledger.entity.LedgerRecord;

public interface LedgerRepository {
    void save(final LedgerRecord ledgerRecord);
}