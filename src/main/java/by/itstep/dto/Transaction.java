package by.itstep.dto;

import by.itstep.exception.TransactionNotUnique;
import lombok.*;

import java.util.UUID;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
@AllArgsConstructor
public class Transaction {
    private TransactionType transactionType;
    private UUID  uuid;
    private Long amount;
    private TransactionResult transactionResult;
}
