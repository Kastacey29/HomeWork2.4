package transport;

public class Bus extends Transport {
    @Override
    public String refill() {
        return "дизель";
    }

    public Bus(String brand, String model, int productionYear, String productionCountry, String colorOfBody, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, colorOfBody, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", productionYear=" + super.getProductionYear() +
                ", productionCountry='" + super.getProductionCountry() + '\'' +
                ", colorOfBody='" + super.getColorOfBody() + '\'' +
                ", maxSpeed=" + super.getMaxSpeed() +
                '}';
    }
}
