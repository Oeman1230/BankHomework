package pack.Bank;

import pack.PersonName;

public class AccountId{
    private PersonName clientName;
    private Integer AccountIDNum;

    public void setAccountIDNum(Integer accountIDNum) {
        AccountIDNum = accountIDNum;
    }

    public void setClientName(PersonName clientName) {
        this.clientName = clientName;
    }

    public Integer getAccountIDNum() {
        return AccountIDNum;
    }
    public String getClientName() {
        return clientName.getFullName();
    }
}