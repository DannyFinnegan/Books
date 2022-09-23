package Books;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        Book B1 = new Book();
        output += "Calling the no-argument Book... " + "\nThe first books details are: \n\n" + B1;
        Book B2=new Book("Game of thrones","IS3768852",30.00,876);
        output += "\n\n\nCalling the multi-argument Book... " + "\nThe second books details are: \n\n" + B2;
        Book B3=new Book("The Room","1",10000.00,900);
        output += "\n\n\nCalling the multi-argument Book... " + "\nThe second books details are: \n\n" + B3;

        JOptionPane.showMessageDialog(null, output, "Computer Object Data", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
