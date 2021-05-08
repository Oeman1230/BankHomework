package pack.Bank.depatrments;

import pack.Bank.*;
import pack.Person;

import java.util.List;

public class DepProducts implements DepProductsActions, GetRandomEmployee, AddRemoveEmployers {
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
    public boolean TransferMoney(Person client) {
        return false;
    }


    @Override
    public Person GetRandomEmployer() {
        return productsPersonal.get(0);
    }

    @Override
    public boolean AddNewEmployee(Person newEmployee) {
        return true;
    }
}

