package pack.Bank;

public class Credit {
    private boolean ActiveCredit;
    private Integer DebtPercent;
    private Integer DebtCount;
    private Integer DelaysTimes;
    private boolean IsDay;
    public void setDay(boolean day) {
        IsDay = day;
    }
    public void setActiveCredits(boolean activeCredits) {
        ActiveCredit = activeCredits;
    }

    public void setDebtCount(Integer debtCount) {
        DebtCount = debtCount;
    }

    public void setDelaysTimes(Integer delaysTimes) {
        this.DelaysTimes = delaysTimes;
    }

    public void setDebtPercent(Integer debtPercent) {
        DebtPercent = debtPercent;
    }

    public Integer getDebtCount() {
        return DebtCount;
    }

    public Integer getDelaysTimes() {
        return DelaysTimes;
    }
    public boolean IsCreditActive(){
        return ActiveCredit;
    }
    public Integer getDebtPercent() {
        return DebtPercent;
    }
}
