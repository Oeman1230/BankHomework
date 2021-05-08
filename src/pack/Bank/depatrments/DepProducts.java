package pack.Bank.depatrments;

import pack.Bank.Account;
import pack.Bank.AccountId;
import pack.Bank.Operation;
import pack.Person;

import java.util.List;

public class DepProducts implements DepProductsActions {
    List<Person>productsPersonal;


    @Override
    public Account OpenAccount(Person newClient) {

        return null;
    }

    @Override
    public String CardStatistic(AccountId clientId) {
        return null;
    }

    @Override
    public void ArrangeToWork(Person newEmployee) {

    }

    @Override
    public Account GiveCredit(Person possibleClient) {
        return null;
    }

    @Override
    public void TakeChurchDonation(AccountId client) {

    }

    @Override
    public void ListenClientRequest(Person possibleClient, boolean isDay) {

    }
}

