package pack.Bank.depatrments;

import pack.Bank.Account;
import pack.Bank.AccountId;
import pack.Bank.AddRemoveEmployers;
import pack.Bank.GetRandomEmployee;
import pack.Person;

import java.util.List;

public class Departments {
    private DepProducts depProducts;
    private DepAccounts depAccounts;
    private DepSecurity depSecurity;
    private DepDocuments depDocuments;
    private DepStaff depStaff;

    public void setDepProducts(DepProducts depProducts) {
        this.depProducts = depProducts;
    }

    public void setDepAccounts(DepAccounts depAccounts) {
        this.depAccounts = depAccounts;
    }

    public void setDepDocuments(DepDocuments depDocuments) {
        this.depDocuments = depDocuments;
    }

    public void setDepSecurity(DepSecurity depSecurity) {
        this.depSecurity = depSecurity;
    }

    public void setDepStaff(DepStaff depStaff) {
        this.depStaff = depStaff;
    }

    public DepProducts getDepProducts() {
        return depProducts;
    }

    public DepAccounts getDepAccounts() {
        return depAccounts;
    }

    public DepDocuments getDepDocuments() {
        return depDocuments;
    }

    public DepSecurity getDepSecurity() {
        return depSecurity;
    }

    public DepStaff getDepStaff() {
        return depStaff;
    }

    public class DepProducts implements DepProductsActions, GetRandomEmployee{
        List<Person> productsPersonal;


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


    }

    public class DepAccounts implements DepAccountsActions {
        @Override
        public boolean CreateAccount(Person newClient) {
            Person currentAccountEmployee = new Person();

            if(!CheckAccountExistence(newClient.getBankAccount().getID()))
            {
            if(!depSecurity.HasClientCrimes(newClient))
            {

                return false;
            }
            Account newClientAccount = new Account();
            AccountId newId = new AccountId();
            newId.setClientName(newClient.getPersonName());
            newId.setAccountIDNum(1);
            }
            return false;
        }

        @Override
        public boolean CheckAccountExistence(AccountId clientId) {
            return false;
        }

        @Override
        public Account CreditCreationProcess(Person possibleClient) {
            return null;
        }

        @Override
        public boolean CheckCreditExistence(AccountId clientId) {
            return false;
        }
    }

    public class DepDocuments implements DepDocumentsActions {

        @Override
        public void CreateAccountDocument(Account newAccount) {

        }

        @Override
        public Integer GetLastIdNumber() {
            return null;
        }

        @Override
        public boolean CheckDocumentsExistence(AccountId id) {
            return false;
        }

        @Override
        public Account GetAccountFromDatabaseById(AccountId id) {
            return null;
        }

        @Override
        public boolean ChangeAccountData(AccountId id) {
            return false;
        }
    }

    public class DepSecurity implements DepSecurityActions, GetRandomEmployee {
        @Override
        public boolean HasClientCrimes(Person client) {

            return client.wasPersonCriminal();
        }

        @Override
        public Person GetRandomEmployer() {
            return null;
        }
    }

    public class DepStaff {
    }
}
