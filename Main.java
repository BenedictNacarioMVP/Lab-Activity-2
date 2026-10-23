public class Main {

    public static void printDetails(Vehicle vehicle){
    vehicle.displayInfo();
    }
	public static void main(String[] args) {
		
        System.out.println("===1. Parent Reference ===");
		Vehicle vehicle = new Car("Honda", "Civic", 2020, 4);
        vehicle.displayInfo();

        vehicle = new Motorcycle ("Ducati","Panigale V4",2017, "4-stroke, 4-cylinder, liquid-cooled engine");
        vehicle.displayInfo();

        Truck truck = new Truck ("Mitsubishi", "Mitsubishi Strada / L300",1978,4);
        truck.displayInfo();

        System.out.println("\n=== 2. Method Parameter ===");
        Car Car = new Car("Honda", "Civic",1995,4);
        Motorcycle Motor = new Motorcycle("Honda", "CB750 Hornet",2022, "4-stroke, DOHC, 4-cylinder, liquid-cooled engine");
        Truck Truck = new Truck ("Hyundai","Santa Cruz",2021,4);
        printDetails(Car);
        printDetails(Motor);
        printDetails(Truck);
        
        System.out.println("\n=== 3.Polymorphic Array ===");
        Vehicle[] vehicles = {
            new Car("Mitsubishi", "Lancer", 2010,4),
            new Motorcycle("Yamaha","YZF-R1M",2015, "998cc liquid-cooled, 4-stroke, DOHC,inline 4-cylinder engine featuring a crossplane crankshaft (CP4) technology"),
            new Truck ("Hyundai","Santa Cruz",2021,4)
        };

        for(Vehicle currentVehicle: vehicles){
            printDetails(currentVehicle);
        }
        System.out.println();
    }
}    

	    