package pack.Bank;

public class PersonPost {
    private String PostName;
    private boolean IsInBank;
    private Integer Salary;

    public void setPostName(String postName) {
        PostName = postName;
    }

    public void setConnectionToBank(boolean inBank) {
        IsInBank = inBank;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public String getPostName() {
        return PostName;
    }

    public Integer getSalary() {
        return Salary;
    }
    public boolean bankConnection()
    {
        return IsInBank;
    }
}
