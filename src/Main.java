import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        System.out.println("Program is working");

        while (true) {
            String path = manager.askPath();
            //String path = "D:\\dell\\Desktop\\прога\\sales.csv";
            String salesDataFromFile = manager.dataFromFile(path);

            if (salesDataFromFile != null) {
                List<Sale> list = Parser.stringToSale(salesDataFromFile);
                manager.salesSum(list);

            }


        }

    }
}