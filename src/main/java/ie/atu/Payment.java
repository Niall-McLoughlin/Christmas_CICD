package ie.atu;

public class Payment {
    long cardNumber;
    String cardDate;
    int cardCCV;

    private String cardType;

    public Payment(){
    }

    public Payment(long cardNumber, String cardDate, int cardCCV){
       //if(Long.toString(cardNumber).length() == 16) {this.cardNumber = cardNumber; }
       //if(cardDate.length() == 5) { this.cardDate = cardDate; }
       //if(Long.toString(cardNumber).length() == 3) { this.cardCCV = cardCCV; }
        this.cardNumber = cardNumber;
        this.cardDate = cardDate;
        this.cardCCV = cardCCV;
    }


    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        if (Long.toString(cardNumber).length() != 16){
            throw new IllegalArgumentException("Invalid card number.");
        }
        this.cardNumber = cardNumber;

        int num = Long.toString(cardNumber).toCharArray()[0];

        if(num == '3'){
            this.cardType = "American Express";
        } else if (num == '4') {
            this.cardType = "Visa Card";
        } else if (num == '5') {
            this.cardType = "Mastercard";
        } else if (num == '6') {
            this.cardType = "Discovery Cards";
        } else {
            throw new IllegalArgumentException("Incorrect card digits");
        }
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        String buffer = cardDate;

        if (buffer.toCharArray().length != 5) {
            throw new IllegalArgumentException("Invalid card date.");
        }  else {
            this.cardDate = cardDate;
        }
    }

    public int getCardCCV() {
        return cardCCV;
    }

    public void setCardCCV(int cardCCV) {
        String buffer = String.valueOf(cardCCV);

        if (buffer.toCharArray().length != 3)
            throw new IllegalArgumentException("Invalid CCV.");
        this.cardCCV = cardCCV;
    }

    public String getCardType() {
        return cardType;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "cardNumber=" + cardNumber +
                ", cardDate='" + cardDate + '\'' +
                ", cardCCV=" + cardCCV +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}

