package pack.Bank;

import pack.Bank.depatrments.Departments;
import pack.Person;

public class Bank {
    private String BankName;
    private Departments departments;

    public void BankOffice(Person client, boolean isDay){
        System.out.println(client.getPersonName().getFullName()
                + " Заходит в банк " + getBankName());
        Person currentEmployee = new Person();
        currentEmployee = departments.getDepProducts().GetRandomEmployer();
        System.out.println(" Hello, my name is " +
                currentEmployee.getPersonName().getFullName() +
                " How can i help you?");
        System.out.println(client.getWantedAction());
        if(client.getWantedAction().equals(StringActionsPresentation.openAccount))
        {
            departments.getDepProducts().OpenAccount(client);
        }
        else if(client.getWantedAction().equals(StringActionsPresentation.takeCredit))
        {
            departments.getDepProducts().GiveCredit(client);
        }
        else if(client.getWantedAction().equals(StringActionsPresentation.getCard))
        {
            departments.getDepProducts().CardStatistic(client.getBankAccount().getID());
        }
        else if(client.getWantedAction().equals(StringActionsPresentation.arrange))
        {
            departments.getDepProducts().ArrangeToWork(client);
        }
        else if(client.getWantedAction().equals(StringActionsPresentation.transferMoney))
        {
            departments.getDepProducts().TransferMoney(client);
        }
        else if(client.getWantedAction().equals(StringActionsPresentation.donateToChurch))
        {
            departments.getDepProducts().TakeChurchDonation(client.getBankAccount().getID());
        }
        else
        {
            System.out.println("Sorry, we don't do such actions");
        }

    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }



    public String getBankName() {
        return BankName;
    }
    public void downloadBank()
    {
        setBankName("SarovBank");

    }
}
