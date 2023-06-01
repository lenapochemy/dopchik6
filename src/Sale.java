public class Sale {
    //: Создайте класс Sale с полями region (Регион), product (Продукт), quantity (Количество) и price (Цена за единицу).
    public String region;
    public String product;
    public Integer quantity;
    public Double price;
    public Double sum;

    public Sale(String region, String product, Integer quantity, Double price){
        this.region = region;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.sum = quantity * price;
    }

    public String getRegion(){
        return region;
    }

    public String getProduct(){
        return product;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public Double getPrice(){
        return price;
    }

    public Double getSum(){
        return sum;
    }
    @Override
    public String toString(){
        return "Sale {" +
                "region=" + region +
                ", product=" + product +
                ", quantity=" + quantity +
                ", price=" + price +
                "}";
    }
}
