class CARRENTAL {
    int carId;
    String carType;
    float rent;

    void GetCar(int id, String type) {
        carId = id;
        carType = type;
    }

    float GetRent() {
        if (carType.equals("Small")) return rent = 1000;
        if (carType.equals("Van")) return rent = 800;
        return rent = 2500;
    }

    void ShowCar() {
        System.out.println(carId + " " + carType + " " + rent);
    }

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar(1, "SUV");
        c.GetRent();
        c.ShowCar();
    }
}