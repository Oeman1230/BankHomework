package pack.Bank;



public class Account {

    private AccountId ID;

    private Integer MoneyCount;
    private PersonPost ClientJob;

    private Credit credit;

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public void setClientJob(PersonPost clientJob) {
        ClientJob = clientJob;
    }


    public void setID(AccountId ID) {
        this.ID = ID;
    }

    public void setMoneyCount(Integer moneyCount) {
        MoneyCount = moneyCount;
    }


    public AccountId getID() {
        return ID;
    }



    public Credit getCredit() {
        return credit;
    }

    public Integer getMoneyCount() {
        return MoneyCount;
    }


    public PersonPost getClientJob() {
        return ClientJob;
    }


}

