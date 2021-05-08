package pack.Bank;

import pack.PersonName;

public class AccountId{
    private PersonName clientName;
    private Integer AccountIDNum;

    public void setAccountIDNum(Integer accountIDNum) {
        AccountIDNum = accountIDNum;
    }
    public Integer getAccountIDNum() {
        return AccountIDNum;
    }

    public void setClientName(PersonName clientName) {
        this.clientName = clientName;
    }


    public String getClientName() {
        return clientName.getFullName();
    }
}