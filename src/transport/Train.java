package transport;

public class Train extends Transport {
    private double priceOfTrip;
    private double timeOfTrip;
    private String startPoint;
    private String finalPoint;
    private int countOfCars;


    public Train(String brand, String model,
                 int productionYear, String productionCountry, String colorOfBody,
                 int maxSpeed, double priceOfTrip, double timeOfTrip, String startPoint,
                 String finalPoint, int countOfCars) {
        super(brand, model, productionYear, productionCountry, colorOfBody, maxSpeed);
        setPriceOfTrip(priceOfTrip);
        setTimeOfTrip(timeOfTrip);
        setStartPoint(startPoint);
        setFinalPoint(finalPoint);
        setCountOfCars(countOfCars);
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        if (priceOfTrip <= 0) {
            this.priceOfTrip = 100;
        } else {

            this.priceOfTrip = priceOfTrip;
        }
    }

    public double getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(double timeOfTrip) {
        if (timeOfTrip <= 0) {
            this.timeOfTrip = 1.5;
        } else {

            this.timeOfTrip = timeOfTrip;
        }
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        if (startPoint == null || startPoint.isEmpty()) {
            this.startPoint = "Информация не указана";
        } else {

            this.startPoint = startPoint;
        }
    }

    public String getFinalPoint() {
        return finalPoint;
    }

    public void setFinalPoint(String finalPoint) {
        if (finalPoint == null || finalPoint.isEmpty()) {
            this.finalPoint = "Информация не указана";
        } else {

            this.finalPoint = finalPoint;
        }
    }

    public int getCountOfCars() {
        return countOfCars;
    }

    public void setCountOfCars(int countOfCars) {
        if (countOfCars <= 0) {
            this.countOfCars = 7;
        } else {

            this.countOfCars = countOfCars;
        }
    }

    @Override
    public String refill() {
        return "дизель или бензин";
    }


    @Override
    public String toString() {
        return "Train{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", productionYear=" + super.getProductionYear() +
                ", productionCountry='" + super.getProductionCountry() + '\'' +
                ", colorOfBody='" + super.getColorOfBody() + '\'' +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", priceOfTrip=" + priceOfTrip +
                ", timeOfTrip=" + timeOfTrip +
                ", startPoint='" + startPoint + '\'' +
                ", finalPoint='" + finalPoint + '\'' +
                ", countOfCars=" + countOfCars +
                '}';
    }
}
