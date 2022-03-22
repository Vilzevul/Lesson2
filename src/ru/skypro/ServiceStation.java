package ru.skypro;

public class ServiceStation {
    /*   public void check(Car car, Bicycle bicycle, Truck truck) {
           if (car != null) {
               System.out.println("Обслуживаем " + car.getModelName());
               for (int i = 0; i < car.getWheelsCount(); i++) {
                   car.updateTyre();
               }
               car.checkEngine();
           } else if (truck != null) {
               System.out.println("Обслуживаем " + truck.getModelName());
               for (int i = 0; i < truck.getWheelsCount(); i++) {
                   truck.updateTyre();
               }
               truck.checkEngine();
               truck.checkTrailer();
           } else if (bicycle != null) {
               System.out.println("Обслуживаем " + bicycle.getModelName());
               for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                   bicycle.updateTyre();
               }
           }
       }*/
    public void check(Car car) {

        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }


    public void check(Truck truck) {

        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();

        }
    }
}