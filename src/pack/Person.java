package pack;

import pack.Bank.Account;
import pack.Bank.PersonPost;

public class Person {
    private PersonName personName;
    private Integer Age;
    private Integer personId;
    private boolean WasCriminal;
    private PersonPost job;
    private Account BankAccount;
    private String WantedAction;
    private PersonName personFriend;

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public void setJob(PersonPost job) {
        this.job = job;
    }

    public void setWasCriminal(boolean wasCriminal) {
        WasCriminal = wasCriminal;
    }

    public void setBankAccount(Account bankAccount) {
        BankAccount = bankAccount;
    }

    public void setWantedAction(String wantedAction) {
        WantedAction = wantedAction;
    }

    public void setPersonFriend(PersonName personFriend) {
        this.personFriend = personFriend;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public Integer getAge() {
        return Age;
    }

    public Account getBankAccount() {
        return BankAccount;
    }

    public String getWantedAction() {
        return WantedAction;
    }

    public PersonPost getJob() {
        return job;
    }

    public PersonName getPersonFriend() {
        return personFriend;
    }
    public boolean wasPersonCriminal(){
        return WasCriminal;
    }

    public Integer getPersonId() {
        return personId;
    }
}
