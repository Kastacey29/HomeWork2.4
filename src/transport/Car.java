package transport;

import java.time.LocalDate;
import java.time.Month;


public class Car extends Transport {


    private double engineVolume;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final Integer numberOfSeats;
    private String typeOfTires;
    private Key key;
    private Insurence insurence;


    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteRunEngine, boolean keylessAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteRunEngine=" + remoteRunEngine +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public static class Insurence {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurence() {
            this(null, 10000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать офрмлять новую страховку!!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер введен некорректно!");
            }
        }

        public Insurence(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {

                this.number = number;
            }

        }

        @Override
        public String toString() {
            return "Insurence{" +
                    "expireDate=" + expireDate +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }
    }


    @Override
    public String refill() {
        return "дизель или бензин или электронная зарядка";
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }


    public Car(String brand, String model, int productionYear, String productionCountry, String colorOfBody, int maxSpeed,
               double engineVolume, String transmission, String bodyType, String registrationNumber, Integer numberOfSeats,
               String typeOfTires, Key key, Insurence insurence) {
        super(brand, model, productionYear, productionCountry, colorOfBody, maxSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.typeOfTires = typeOfTires;
        this.key = key;
        this.insurence = insurence;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTypeOfTires() {
        return typeOfTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Insurence getInsurence() {
        return insurence;
    }

    public void setTypeOfTires(String typeOfTires) {
        if (LocalDate.now().getMonth() == Month.DECEMBER || LocalDate.now().getMonth() == Month.JANUARY ||
                LocalDate.now().getMonth() == Month.FEBRUARY) {
            this.typeOfTires = "winter";
        } else {
            this.typeOfTires = "summer";
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + getColorOfBody() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", productionCountry='" + getProductionCountry() + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", typeOfTires='" + typeOfTires + '\'' +
                ", key=" + key +
                ", insurence=" + insurence +
                '}';
    }
}
