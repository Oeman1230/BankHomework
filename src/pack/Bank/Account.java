package pack.Bank;


import pack.PersonName;

import java.util.List;

public class Account {
    private AccountId ID;
    private boolean IsDay;
    private Integer MoneyCount;
    private PersonPost ClientJob;
    List<Operation>Operations;
    private Integer DebtPercent;
    private Integer DebtCount;

    public void setDebtCount(Integer debtCount) {
        DebtCount = debtCount;
    }

    public void setClientJob(PersonPost clientJob) {
        ClientJob = clientJob;
    }

    public void setID(AccountId ID) {
        this.ID = ID;
    }

    public void setDay(boolean day) {
        IsDay = day;
    }

    public void setMoneyCount(Integer moneyCount) {
        MoneyCount = moneyCount;
    }

    public void setDebtPercent(Integer debtPercent) {
        DebtPercent = debtPercent;
    }

    public void setOperations(List<Operation> operations) {
        Operations = operations;
    }

    public AccountId getID() {
        return ID;
    }

    public Integer getDebtPercent() {
        return DebtPercent;
    }

    public Integer getMoneyCount() {
        return MoneyCount;
    }

    public List<Operation> getOperations() {
        return Operations;
    }

    public PersonPost getClientJob() {
        return ClientJob;
    }

    public Integer getDebtCount() {
        return DebtCount;
    }
}

