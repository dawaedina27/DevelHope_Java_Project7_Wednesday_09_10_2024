import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class DealerClass {
    private String dealerName;
    private double dealerBalance;
    private ArrayList<Car> carInventory;


    public DealerClass(String dealerName, double initialBalance) {
        this.dealerName = dealerName;
        this.dealerBalance = initialBalance;
        this.carInventory = new ArrayList<Car>();

    }

    public void DisplayAllCars() {
        if (carInventory.isEmpty()) {
            System.out.println("The inventory is empty. No cars available.");
        } else {
            System.out.println("Cars in the inventory: ");
            for (int i = 0; i < carInventory.size(); i++) {
                System.out.println((i + 1) + ", " + carInventory.get(i));
            }
        }
    }

    public void addCar(Car car) {
        carInventory.add(car);
        System.out.println("Added to the inventory successfully " + car.getClass().getName());
    }

    public void sellCar(int carPosition) {
        if (carPosition < 0 || carPosition >= carInventory.size()) {
            System.out.println("Incorrect car selection");
        } else {
            Car car = carInventory.get(carPosition);
            double sellingPrice = car.sell();
            dealerBalance += sellingPrice;
            carInventory.remove(carPosition);
            System.out.println("Car sold at: UGX" + sellingPrice + car.getClass().getName());
            System.out.println("Udated dealer balance: UGX" + dealerBalance);

        }
    }

    public void dealerMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("\n ******* DEALER MANAGEMENT MENU *******");
            System.out.println("1. Add cars to the Car Inventory");
        }

    }
}

class Dealers{

    private ArrayList<Dealers> dealersList;

    private Dealers(){
        this.dealersList = new ArrayList<>();
    }

    public Dealers(String dealerName, double initialBalance) {
    }

    public void showAllDealers(){
        if (dealersList.isEmpty()){
            System.out.println("No Dealers to display.");
        }

        else{
            System.out.println("Dealers available are:");
            for (int i = 0; i <dealersList.size(); i++){
                System.out.println((i + 1) + ". " +dealersList.get(i).toString());
            }

        }
    }

    public <Dealer> void addDealers(Dealer dealers){
        dealersList.addAll((Collection<? extends Dealers>) dealers);
        System.out.println("Dealers " + dealers + "has been added.");

    }

    public void selectDealers(int index){
        if (index < 0 || index >= dealersList.size()){
            System.out.println("Invalid index: " + index);

        }

        else {
            Dealers selectDealers = dealersList.get(index);
            selectDealers.dealersMenu();
        }
    }

    public  void dealersMenu(){
        Scanner scanner = new Scanner(System.in);

        int choice;

        while (true) {

            System.out.println("***************************************");
            System.out.println("**                                   **");
            System.out.println("**                                   **");
            System.out.println("**                                   **");
            System.out.println("**     Dealers Main Menu             **");
            System.out.println("** 1. Show all dealers               **");
            System.out.println("** 2. Add s new dealer               **");
            System.out.println("** 3. Select an existing dealer      **");
            System.out.println("** 4. Exit                           **");
            System.out.println("**   Enter your Choice               **");
            System.out.println("**                                   **");
            System.out.println("**                                   **");
            System.out.println("**                                   **");
            System.out.println("**                                   **");
            System.out.println("***************************************");

            choice = scanner.nextInt();
            scanner.nextInt();

            switch (choice) {
                case 1:
                    showAllDealers();
                    break;

                case 2:
                    System.out.println("Enter dealer's name: ");
                    String dealerName = scanner.next();
                    System.out.println("Enter dealer initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    Dealers newDealer = new Dealers(dealerName, initialBalance);
                    addDealers(newDealer);
                    break;

                case 3:
                    showAllDealers();
                    if (!dealersList.isEmpty()) {
                        System.out.println("Enter the number of the dealers to select: ");
                        int dealerIndex = scanner.nextInt() - 1;
                        selectDealers(dealerIndex);

                    }
                    break;

                case 4:
                    System.out.println("Existing dealers Main Menu.");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid number.");

            }

            while(choice != 4);
           }
        }
    public static void main(String[] args){
        Dealers dealers = new Dealers();
        dealers.dealersMenu();
    }

    private String getName() {
        return getName();
    }
}

