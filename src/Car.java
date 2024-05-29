 class Car {

    String make;
    String name;
    int year;
    String color;


    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + name);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }


    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Toyota";
        car1.name = "Camry";
        car1.year = 2020;
        car1.color = "Red";


        Car car2 = new Car();
        car2.make = "Honda";
        car2.name = "Civic";
        car2.year = 2018;
        car2.color = "Blue";


        Car car3 = new Car();
        car3.make = "Hyundai";
        car3.name = "Creta";
        car3.year = 2022;
        car3.color = "Black";


        car1.displayDetails();
        System.out.println();
        car2.displayDetails();
        System.out.println();
        car3.displayDetails();
    }
}
