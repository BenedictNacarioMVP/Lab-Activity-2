public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Toyota";
        vehicle1.model = "Fortuner";
        vehicle1.year = 2020;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Suzuki";
        vehicle2.model = "Swift";
        vehicle2.year = 2022;

        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Kia";
        vehicle3.model = "Sportage";
        vehicle3.year = 2024;

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage() + "\n");

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage() + "\n");

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}