public enum Car {
    Mercedes("Mercedes",50000),
    BMW("BMW",45000),
    Ford("Ford",25000),
    Opel("Mercedes",20000),
    Audi("Mercedes",40000);
    
    private String Mark;
    private int praiseCar;

    Car(String mark, int praiseCar) {
        Mark = mark;
        this.praiseCar = praiseCar;
    }

        @Override
    public String toString() {
        return Mark;
    }

    public int getPraiseCar() {
        return praiseCar;
    }

    public void setPraiseCar(int praiseCar) {
        this.praiseCar = praiseCar;
    }

    static void showCar(){
        for (Car Car : Car.values()){
            System.out.println(Car.name());
        }

    }
    static void showCarPraise(Car praiseCar){
        switch (praiseCar){
            case BMW:
            case Mercedes:
            case Audi:
            case Ford:
            case Opel:
                System.out.println("Your choice of auto brand "+ praiseCar);
        }

    }


}



