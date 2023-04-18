import com.HW.ElectricCar;
import com.HW.UsedCars;



public class Main {
    public static void main(String[] args) {
        ElectricCar ElectricCar1 = new ElectricCar(
                "Hyundai",
                "red",
                68888,
                78888
        );
    System.out.println(ElectricCar1.getBatteryCapacity());

        UsedCars UsedCars1 = new UsedCars(
                "Honda Accord",
                "white",
                15000,
                1500,
                2009);

        System.out.println(UsedCars1.getManufactureDate());


    };


};