public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    Integer lifeSpan;

    public Flower(String flowerColor, String country, double cost, Integer lifeSpan) {
        if (flowerColor == null) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00d;
        }
        if (lifeSpan < 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00d;
        }
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(Integer lifeSpan) {
        if (lifeSpan < 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
