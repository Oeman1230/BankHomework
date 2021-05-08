package pack.Bank;

import pack.Bank.depatrments.DepAccounts;
import pack.Bank.depatrments.DepProducts;
import pack.Person;

public class Bank {
    private String BankName;
    private DepProducts products;
    private DepAccounts depAccounts;

    public void BankOffice(Person client, boolean isDay){
        System.out.println(client.getPersonName().getFullName()
                + " Заходит в банк " + getBankName());
        Person currentEmployee = new Person();
        currentEmployee = products.GetRandomEmployer();
        System.out.println(" Hello, my name is " +
                currentEmployee.getPersonName().getFullName() +
                " How can i help you?");
        System.out.println(client.getWantedAction());
        if(client.getWantedAction().equals(StringActionsPresentation.takeCredit))
        {
            products.GiveCredit(client);
        }
        else if(client.getWantedAction().equals(StringActionsPresentation.openAccount))
        {
            products.OpenAccount(client);
        }
        else if(client.getWantedAction().equals(StringActionsPresentation.getCard))
        {
            products.CardStatistic(client.getBankAccount().getID());
        }
        else if(client.getWantedAction().equals(StringActionsPresentation.arrange))
        {
            products.ArrangeToWork(client);
        }
        else if(client.getWantedAction().equals(StringActionsPresentation.transferMoney))
        {
            products.TransferMoney(client);
        }
        else if(client.getWantedAction().equals(StringActionsPresentation.donateToChurch))
        {
            products.TakeChurchDonation(client.getBankAccount().getID());
        }
        else
        {
            System.out.println("Sorry, we don't do such actions");
        }

    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public void setProducts(DepProducts products) {
        this.products = products;
    }

    public void setDepAccounts(DepAccounts depAccounts) {
        this.depAccounts = depAccounts;
    }

    public String getBankName() {
        return BankName;
    }
    public void downloadBank()
    {
        setBankName("SarovBank");
        DepProducts pr = new DepProducts();

    }
}
