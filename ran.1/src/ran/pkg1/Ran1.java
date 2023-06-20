/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ran.pkg1;

/**
 *
 * @author philip
 */
public class Ran1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        
      
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("Select a shape to calculate its volume and surface area:");
                System.out.println("1. Sphere");
                System.out.println("2. Cube");
                System.out.println("3. Cylinder");
                  System.out.println("4.cone");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> calculateSphere(scanner);
                    case 2 -> calculateCube(scanner);
                    case 3 -> calculateCylinder(scanner);
                         case 4 -> calculateCone(scanner);
                    case 0 -> System.out.println("Exiting the program...");
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 0);
        }
    }

    public static void calculateSphere(Scanner scanner) {
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.println("Volume of the sphere: " + volume+" m^3");
        System.out.println("Surface area of the sphere: " + surfaceArea+" m^2");
    }

    public static void calculateCube(Scanner scanner) {
        System.out.print("Enter the side length of the cube: ");
        double sideLength = scanner.nextDouble();

        double volume = Math.pow(sideLength, 3);
        double surfaceArea = 6 * Math.pow(sideLength, 2);

        System.out.println("Volume of the cube: " + volume+" m^3");
        System.out.println("Surface area of the cube: " + surfaceArea+" m^2");
    }

    public static void calculateCylinder(Scanner scanner) {
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;
        double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));

        System.out.println("Volume of the cylinder: " + volume+" m^3");
        System.out.println("Surface area of the cylinder: " + surfaceArea+" m^2");
    }
    public static void calculateCone(Scanner scanner) {
        System.out.print("Enter the radius of the cone: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double height = scanner.nextDouble();
                            double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
                            System.out.println("Volume of the cone: " + volume+" m^3");
                            double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
                            double surfaceArea = Math.PI * radius * (radius + slantHeight);
                            System.out.println("Surface area of the cone: " + surfaceArea+" m^2"); 
    }

    
    }
        
        
    