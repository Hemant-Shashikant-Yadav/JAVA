import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        String EntityName = (opt==1)?"Hotel":(opt==2)?"Trust":"Dilevary";
        System.out.println(EntityName);
    }
}