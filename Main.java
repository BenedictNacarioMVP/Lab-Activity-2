public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Fortuner", 2020);
        Vehicle vehicle2 = new Vehicle("Suzuki", "Swift", 2022);
        Vehicle vehicle3 = new Vehicle("Kia", "Sportage", 2024);
 vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        vehicle1.setYear(2029);

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        vehicle2.setYear(2025);

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
        vehicle3.setYear(2023);
    }
}