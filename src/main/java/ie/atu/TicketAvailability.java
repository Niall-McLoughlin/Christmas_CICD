package ie.atu;

public class TicketAvailability {
    private static int user_seat = 0; // 70
    private static int user_standing = 0; //30

    private static int max_sit;
    private static int max_stand;
    private static int stadium_size = 100;

    private String seat_kind;

    private String ticket_ref;

    public  TicketAvailability(){
    }

    public TicketAvailability(int max_sit, int max_stand) {
        this.max_sit = max_sit;
        this.max_stand = max_stand;
        this.stadium_size = max_sit + max_stand;
    }

    public int getUser_seat() {
        return user_seat;
    }

    public void setUser_seat(int user_seat) {

        if (user_seat <= max_sit) {
            this.user_seat = user_seat; }
        else {
            throw new IllegalArgumentException("Over seating capacity");
        }
    }

    public int getUser_standing() {
        return user_standing;
    }

    public void setUser_standing(int user_standing) {
        if (user_standing <= max_stand) {
            this.user_standing = user_standing;
        } else {
            throw new IllegalArgumentException("Over standing capacity");
        }

    }

    public String getSeat_kind() {
        return seat_kind;
    }

    public void setSeat_kind(String seat_kind) {
        String buffer = seat_kind;

        switch (buffer){
            case "sit":
            case "Sit":
            case "SIT":     this.seat_kind = "sit";

                            if(++user_seat > max_sit){
                                throw new IllegalArgumentException("NO SEATING AVAILABLE");
                            }

                break;
            case "stand":
            case "Stand":
            case "STAND":   this.seat_kind = "stand";

                if(++user_standing > max_stand){
                    throw new IllegalArgumentException("NO STANDING AVAILABLE");
                }
                break;
            default:    throw new IllegalArgumentException("INCORRECT INPUT");
        }
    }

    public int getStadium_size() {
        return stadium_size;
    }

    public void setStadium_size(int stadium_size) {
        if (stadium_size <= 100) {
            this.stadium_size = stadium_size;
        } else {
            throw new IllegalArgumentException("Stadium Full");
        }
    }

    public String getTicket_ref() {
        return ticket_ref;
    }

    public void setTicket_ref(String ticket_ref) {
        if(ticket_ref.length() == 20){
            this.ticket_ref = ticket_ref;
        } else {
            if(ticket_ref.length() < 20){
                throw new IllegalArgumentException("ERROR TICKET REFERENCE LENGTH DOESN'T MEET REQUIREMENTS (LESS THAN 20)");
            } else {
                throw new IllegalArgumentException("ERROR TICKET REFERENCE LENGTH DOESN'T MEET REQUIREMENTS (GREATER THAN 20)");

            }
        }
    }




    @Override
    public String toString() {
        return "TicketAvailability{" +
                "user_seat_kind='" + seat_kind + '\'' +
                ", user_seat=" + user_seat +
                ", user_standing=" + user_standing +
                ", stadium_size=" + stadium_size +
                '}';
    }
}