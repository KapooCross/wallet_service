package by.itstep.repository;

import by.itstep.dto.Transaction;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface TransactionRepository {

    void save(Transaction transaction);

    Transaction getById(UUID uuid);

    void  update(UUID uuid, Transaction transaction);

    void delete(Transaction transaction);

    Collection<Transaction> getAll();

}
