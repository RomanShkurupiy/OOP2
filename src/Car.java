public class Car {
    private String color;
    private String fuel;
    private int year;

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String color, String fuel, int year) {
        this.color = color;
        this.fuel = fuel;
        if (year < 1885) {
            try {
                throw new Exception("There were no cars before 1885");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (year < 1970) {
            try {
                throw new Exception("This car hardly will be able to move");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (year > 2023) {
            try {
                throw new Exception("Is this car from future?");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                ", year=" + year +
                '}';
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }

    public int getYear() {
        return year;
    }
}
