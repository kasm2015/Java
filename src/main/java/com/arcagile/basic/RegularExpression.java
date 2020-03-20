import java.util.regex.Pattern;

public class RegularExpression {

     public static void main(String []args){
         String regex = "^[a-zA-z0-9]+$";
         //Hotel ID format without hyphen
         String regex1 = "^[a-zA-Z]{9}([0-9]+)$";
         //Hotel ID format without hyphen
         String regex2 = "^[a-zA-Z]{9}([0-9]+)(-){1}([a-zA-Z]{6})(-){1}[a-zA-Z]{9}$";
         
         String hotelId = "asfasfasf2353252-asdasd-ASDasdASs";
         
         Pattern pattern1 = Pattern.compile(regex1);
         Pattern pattern2 = Pattern.compile(regex2);
         
         boolean isValidFormat1 = pattern1.matcher(hotelId).matches();
         boolean isValidFormat2 = pattern2.matcher(hotelId).matches();
         
         System.out.println("isValidFormat 1 : " +isValidFormat1);
         System.out.println("isValidFormat 2 : " +isValidFormat2);
     }
     
     
}
