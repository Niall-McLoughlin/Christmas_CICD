package ie.atu;

import java.util.Random;

public class GenerateValues {

    //  generates 20 digit string using 1-9 and a-z values
    public static String generateString(){
        Random rand = new Random();

        String ref_num = "";
        char buffer;

        for(int i = 0; i < 20; i++){
            buffer = (char) rand.nextInt(71 + '1');

            boolean exit = false;

            while(!exit){
                if(buffer >= '1' && buffer <= '9' || buffer >= 'a' && buffer <= 'z'){
                    ref_num += buffer;
                    exit = !exit;
                } else{
                    buffer = (char) rand.nextInt(71 + '1');
                }
            }
        }
        return ref_num;
    }
}
