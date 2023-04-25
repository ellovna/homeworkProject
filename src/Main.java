import com.HW.ElectricCar;
import com.HW.LuxuryCar;
import com.HW.UsedCars;
import com.HW.Engine;
import com.HW.GasolineCar;
import com.HW.Hybrid;
import com.HW.SportsCar;
import com.HW.Types;
import com.HW.Cars;

public class Main {
    public static void main(String[] args) {

        ElectricCar CarsInterface1 = new ElectricCar("Tesla", "Red", 15667, 75458);
        Hybrid CarsInterface2 = new Hybrid("Kia", "silver", 86868, 46438, 34874);
        UsedCars CarsInterface3 = new UsedCars("Toyota", "pink", 45466, 645, 5647);

        CarsInterface1.showBatteryReplacement();
        CarsInterface1.getBatteryPrice();
        CarsInterface1.getBatteryCharge();

        CarsInterface2.showBatteryReplacement();
        CarsInterface2.getBatteryPrice();
        CarsInterface2.getBatteryCharge();

        CarsInterface3.getOilChange();
        CarsInterface3.checkTirePressure();

    }





        //System.out.println(2 == 2);
        /*ElectricCar Cars1 = new ElectricCar("Tesla", "Black", 20000, 99);
        ElectricCar Cars2 = new ElectricCar("Kia", "White", 30000, 76);
        GasolineCar CarsA = new GasolineCar("Toyota", "Silver", 353, 55);
        GasolineCar CarsB = new GasolineCar("Toyota", "Silver", 353, 55);
        //Hybrid Cars3 = new Hybrid("Kia", "Blue", 42, 7869);
        //LuxuryCar Car4 = new LuxuryCar("Rolls-Royce", "Gray", "Rolls-Royce Motor Car Limited", 99);
        //SportsCar Car5 = new SportsCar("Mazda MX-5", "Yellow", 60, 99);
        //Types Car6 = new Types("Hyundai", "Green", "Accent-Verna", 3000, 9);
        //UsedCars Car7 = new UsedCars("Subaru", "Black", 8900, 2000, 1996);


        /*System.out.println(Cars1.getAveragePrice());
        System.out.println(Cars2.getAveragePrice());

        System.out.println(Cars1.toString() + "\n");
        System.out.println(Cars2.toString());


        if (CarsA.equals(CarsB))
            System.out.println("they are equal");
        else System.out.println("they are not equal");
    }*/


}

