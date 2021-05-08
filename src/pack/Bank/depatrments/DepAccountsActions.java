package pack.Bank.depatrments;

import pack.Bank.Account;
import pack.Bank.AccountId;
import pack.Person;

public interface DepAccountsActions {
    void DepAccountsWork()
    boolean CreateAccount(Person newClient);
    boolean CheckAccountExistence(AccountId clientId);
    Account CreditCreationProcess(Person possibleClient);
    boolean CheckCreditExistence(AccountId clientId);

}
