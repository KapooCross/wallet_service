package by.itstep.repository;

import by.itstep.dto.Transaction;
import by.itstep.exception.TransactionNotFound;

import java.util.*;
import java.util.stream.Collectors;

public class InMemoryTransactionRepository implements TransactionRepository {

    private HashMap<UUID, Transaction> inMemoryStorage;

    public InMemoryTransactionRepository(HashMap<UUID, Transaction> inMemoryStorage) {
        this.inMemoryStorage = inMemoryStorage;
    }



    public void save(Transaction transaction) {
        inMemoryStorage.put(transaction.getUuid(), transaction);
    }

    public Transaction getById(UUID uuid) throws TransactionNotFound {
        Transaction res = inMemoryStorage.get(uuid);
        if (res == null) {
            throw new TransactionNotFound("Transaction Not Found");
        }
        return res;
    }

    public void update(UUID uuid, Transaction transaction) {
//        Transaction found =
        //написать метод поиска транзакции по самому объекту транзакции
        inMemoryStorage.remove(uuid);
        inMemoryStorage.put(uuid, transaction);
    }

    public void delete(final Transaction transaction) {
//        for (Long l : inMemoryStorage.keySet()) {
//            if (inMemoryStorage.get(l).equals(transaction)){
//                inMemoryStorage.remove(l);
//            }
//        }
        //или
//        inMemoryStorage.values().removeIf(x -> x.equals(transaction));
        inMemoryStorage.remove(transaction.getUuid());
    }

    //старый код
//    public List<Transaction> getAll() {
////        List<Transaction> list = Arrays.asList(inMemoryStorage.entrySet().forEach(x -> x.getValue()));
////            List<Transaction> list = Arrays.asList(inMemoryStorage.forEach(););
////        List<Transaction> list2 = inMemoryStorage.entrySet().stream().collect(Collectors.toList());
////          List<Transaction> list2 = inMemoryStorage.entrySet().stream(). collect(Collectors.toList());
////        List<Transaction> list2 = inMemoryStorage.entrySet();
////          List<Transaction> list = inMemoryStorage.
////                List<Transaction> list = Arrays.asList(inMemoryStorage.values());
////        List<Transaction> list = new ArrayList<>(inMemoryStorage.values());
//        return new ArrayList<>(inMemoryStorage.values());
//    }
    public Collection<Transaction> getAll(){
        return inMemoryStorage.values();
    }
}
