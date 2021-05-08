package pack;

public class PersonName {
    private String Name;
    private String SecondName;
    private String FatherName;

    public void setName(String name) {
        Name = name;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getName() {
        return Name;
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getFatherName() {
        return FatherName;
    }


    public String getFullName() {
        return (getName()
                + " " + getSecondName()
                + " " + getFatherName());
    }
}