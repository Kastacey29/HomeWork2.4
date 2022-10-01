public class Human {
    private Integer yearOfBirth;
    String name;
    private String town;
    String position;

    public Human(Integer yearOfBirth, String name, String town, String position) {

        if (yearOfBirth >= 0 && yearOfBirth != null) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        if (name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }

        if (town != null && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }

        if (position != null) {
            this.position = position;
        } else {
            this.position = "Информация не указана";
        }
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth >= 0 && yearOfBirth != null) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }
}
