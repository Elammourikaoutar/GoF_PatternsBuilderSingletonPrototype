package ma.enset;

import ma.enset.model.AccountStatus;
import ma.enset.model.AccountType;
import ma.enset.model.BankAccount;
import ma.enset.repo.AccountRepositoryImpl;
import ma.enset.utill.JsonSerializer;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        JsonSerializer<BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        AccountRepositoryImpl accountRepository=AccountRepositoryImpl.getInstance();
        accountRepository.populateData();
        List<BankAccount> bankAccounts=accountRepository
                .searchAccounts(bankAccount->
                        (bankAccount.getStatus().equals(AccountStatus.ACTIVATED))
                        && (bankAccount.getBalance()>1000));


        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);

        /*System.out.println("=========================");
        BankAccount account=accountRepository.findById(1L).orElse(null);
        if(account!=null){
            System.out.println(bankAccountJsonSerializer.toJson(account));
        }*/
    }
    }