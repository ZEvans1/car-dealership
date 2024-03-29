package models;

public class Vehicle {
    public int year;
    public String brand;
    public String model;
    public int miles;
    public int price;

    public Vehicle(int year, String brand, String model, int miles, int price) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.miles = miles;
        this.price = price;
    }

        public boolean worthBuying(int maxPrice) {
            return (price < maxPrice);
        }
}
