package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String colorOfBody;
    private int maxSpeed;


    protected abstract String refill();

    public Transport(String brand, String model, int productionYear, String productionCountry, String colorOfBody, int maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        setColorOfBody(colorOfBody);
        setMaxSpeed(maxSpeed);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColorOfBody() {
        return colorOfBody;
    }

    public void setColorOfBody(String colorOfBody) {
        if (colorOfBody == null || colorOfBody.isEmpty()) {
            this.colorOfBody = "default";
        } else {

            this.colorOfBody = colorOfBody;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        } else {

            this.maxSpeed = maxSpeed;
        }

    }


}
