package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInfoTest {

    UserInfo user_info;

    @BeforeEach
    void setUp() {
        user_info = new UserInfo();
    }

    @Test
    void setUsr_name() {
        user_info.setUsr_name("Joe");

        String buffer = user_info.getUsr_name();
        assertEquals("Joe", buffer);
    }

    @Test
    void setUsr_occupationStudent() {
        String testString = "student";
        user_info.setUsr_occupation("student");

        assertEquals(testString, user_info.getUsr_occupation());
    }

    @Test
    void setUsr_occupationIndividual() {
        String testString = "individual";
        user_info.setUsr_occupation("INDIVIDUAL");

        assertEquals(testString, user_info.getUsr_occupation());
    }

    @Test
    void setUsr_occupationFamily() {
        String testString = "family";
        user_info.setUsr_occupation("Family");

        assertEquals(testString, user_info.getUsr_occupation());
    }

    @Test
    void setUsr_occupationElderly() {
        String testString = "elderly";
        user_info.setUsr_occupation("ELDERLY");

        assertEquals(testString, user_info.getUsr_occupation());
    }

    @Test
    void setUsr_age() {
        int testValue = 21;
        user_info.setUsr_age(21);

        assertEquals(testValue, user_info.getUsr_age());
    }

  //  @Test
  //  void  userInfoConstructorTest()
  //  {
  //      assertThrows(IllegalArgumentException.class, () -> { new UserInfo ();} );
  //  }
}