package ie.atu;

public class ParkingAvailability {

    public static int max_Parking;
    private static int user_Parking = 1;
    private String Parking_Option;

    public ParkingAvailability(int max_Parking) {
        this.max_Parking = max_Parking;
    }
    public int getUser_Parking(){
        return user_Parking;
    }
    public void setUser_Parking(int user_Parking){
        if(user_Parking <= max_Parking){
            this.user_Parking = user_Parking;

        }
        else{
            throw new IllegalArgumentException("Over Parking capacity");
        }
    }
    public String getParking_Option() {
        return Parking_Option;
    }
    public void setParking_Option(String Parking_Option) {
        String buffer = Parking_Option;
        switch (buffer) {
            case "yes", "Yes", "YES" -> {
                this.Parking_Option = "yes";
                if (++user_Parking > max_Parking) {
                    throw new IllegalArgumentException("No Parking AVAILABLE");
                }
            }
            case "no", "No", "NO" -> {
                this.Parking_Option = "no";
            }
            default -> throw new IllegalArgumentException("INCORRECT INPUT");
        }
    }

    @Override
    public String toString() {
        return "ParkingAvailability{" +
                "Parking_Option='" + Parking_Option + '\'' +
                ", user_parking=" + user_Parking +
                ", max_Parking=" + max_Parking +
                '}';
    }
}

