package pack.Bank;

public class Operation{
    private String OperationName;
    private boolean isDay;

    public void setOperationName(String operationName) {
        OperationName = operationName;
    }

    public void setDay(boolean day) {
        isDay = day;
    }
    public String getOperationName() {
        return OperationName;
    }
    public boolean WasItDay()
    {
        return isDay;
    }

}