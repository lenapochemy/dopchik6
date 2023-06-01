import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static List stringToSale(String string){
        List<Sale> sales = new ArrayList<>();
        int i1, i2, i3, i4;
        String region, product;
        Integer quantity;
        Double price;
        Sale sale;

        String[] array = string.split("\n");
        try {
            for (String st : array) {
                i1 = st.indexOf(",");
                region = st.substring(0, i1);
                i2 = st.indexOf(",", i1+1);
                product = st.substring(i1+1, i2);
                i3 = st.indexOf(",",i2+1);
                quantity = Integer.parseInt(st.substring(i2+1, i3));
                price = Double.valueOf(st.substring(i3+1));

                sale = new Sale(region, product, quantity, price);
                sales.add(sale);
            }
        } catch (NumberFormatException e){
            System.out.println("Error: number value is not a number in file" );
        }

        return sales;
    }

}
