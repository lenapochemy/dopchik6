import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Manager {

    Scanner scanner = new Scanner(System.in);
    public String askPath() {
        System.out.println("Please print full path to the file:");
        return scanner.nextLine().trim();
    }

    public String dataFromFile(String path) {
        try (
                FileInputStream file = new FileInputStream(path);
                InputStreamReader in = new InputStreamReader(file);
                BufferedReader bufferedReader = new BufferedReader(in)
        ) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
            return null;
        } catch (IOException e) {
            System.out.println("Problem with read file");
            return null;
        }
    }


    public void salesSum(List<Sale> saleList){
        Map<String, Double> sales = saleList.stream()
                        .collect(Collectors.groupingBy(Sale::getRegion, Collectors.summingDouble(Sale::getSum)));

        sales.entrySet().stream().forEach(System.out::println);
    }

}
