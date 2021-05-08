package pack.Bank.depatrments;

import pack.Bank.Account;
import pack.Bank.AccountId;

public interface DepDocumentsActions {
    void CreateAccountDocument(Account newAccount);
    Integer GetLastIdNumber();
    boolean CheckDocumentsExistence(AccountId id);
    Account GetAccountFromDatabaseById(AccountId id);
    //void WriteOperationLog();
    boolean ChangeAccountData(AccountId id);
}
