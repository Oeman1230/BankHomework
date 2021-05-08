package pack;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        testClass cl1 = new testClass();
        cl1.setSecTestInt(10);
        cl1.setTestInt(12);
        cl1.setTestString("testing writing to file");

        if(!Files.exists(Path.of("test.dat")))
        {
            Files.createFile(Path.of("test.dat"));
            FileOutputStream fileOutputStream = new FileOutputStream("test.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(cl1);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        System.out.println(cl1.getSecTestInt());
        File f1 = new File("test.dat");
        System.out.println(f1.getPath());
        FileInputStream fileInputStream = new FileInputStream(f1.getPath());
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        testClass cl2 = (testClass) objectInputStream.readObject();
        System.out.println(cl2.toString());
        System.out.println(cl2.getSecTestInt());

    }
    public static class secondTestClass implements Serializable{
        private Integer secTestInt;

        public void setSecTestInt(Integer secTestInt) {
            this.secTestInt = secTestInt;
        }

        public Integer getSecTestInt() {
            return secTestInt;
        }

        @Override
        public String toString() {
            return "secondTestClass{" +
                    "secTestInt=" + secTestInt +
                    '}';
        }
    }
    public static class testClass extends secondTestClass implements Serializable {
        private Integer testInt;
        private String testString;


        public void setTestInt(Integer testInt) {
            this.testInt = testInt;
        }

        public void setTestString(String testString) {
            this.testString = testString;
        }

        @Override
        public String toString() {
            return "testClass{"+ getSecTestInt()
                    +
                    " testInt=" + testInt +
                    ", testString='" + testString + '\'' +
                    '}';
        }
    }
}
