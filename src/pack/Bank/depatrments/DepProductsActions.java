package pack.Bank.depatrments;

import pack.Bank.Account;
import pack.Bank.AccountId;
import pack.Bank.Operation;
import pack.Person;

public interface DepProductsActions {
    Account OpenAccount(Person newClient);
    String CardStatistic(AccountId clientId);
    void ArrangeToWork(Person newEmployee);
    Account GiveCredit(Person possibleClient);
    void TakeChurchDonation(AccountId client);
    boolean TransferMoney(Person client);
}
