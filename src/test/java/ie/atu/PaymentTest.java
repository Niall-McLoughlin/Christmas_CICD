package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    Payment myCard;
    Payment badCard;

    @BeforeEach
    void setUp() {
        myCard = new Payment();
        badCard = new Payment();

    }

    //  checks if card number equals to testValue
    @Test
    void setCardNumber() {
        long testValue = 4123456789012345l;
        myCard.setCardNumber(testValue);

        assertEquals(testValue, myCard.getCardNumber());
    }

    //  tests if can set card date to testString
    @Test
    void setCardDate() {
        String testString = "12/24";
        myCard.setCardDate(testString);
        assertEquals(testString, myCard.getCardDate());
    }

    //  tests if can set cardCCV to testValue
    @Test
    void setCardCCV() {
        int testValue = 451;
        myCard.setCardCCV(testValue);

        assertEquals(testValue, myCard.getCardCCV());
    }

    //  tests if can set card type to american express in response to first digit in long
    @Test
    void getCardTypeAmericanExpress() {
        myCard.setCardNumber(3123456789012345l);

        assertEquals("American Express", myCard.getCardType());
    }

    //  tests if can set card type to visa card in response to first digit in long
    @Test
    void getCardTypeVisaCard() {
        myCard.setCardNumber(4123456789012345l);

        assertEquals("Visa Card", myCard.getCardType());
    }


    //  tests if can set card type to mastercard in response to first digit in long
    @Test
    void getCardTypeMastercard() {
        myCard.setCardNumber(5123456789012345l);

        assertEquals("Mastercard", myCard.getCardType());
    }

    //  tests if can set card type to discovery cards in response to first digit in long
    @Test
    void getCardTypeDiscoveryCards() {
        myCard.setCardNumber(6123456789012345l);

        assertEquals("Discovery Cards", myCard.getCardType());
    }

  //  @Test
  // void testPaymentConstructor(){
    //    badCard.cardDate = "1";
    //    badCard.cardNumber = 1;
    //   badCard.cardCCV =1 ;
    //    assertThrows(IllegalArgumentException.class, () -> { new Payment(badCard.cardNumber, badCard.cardDate, badCard.cardCCV);} );
    //}


    @AfterEach
    void tearDown() {
    }
}