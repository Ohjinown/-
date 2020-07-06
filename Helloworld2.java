import java.util.Random;

public class Helloworld2 {
    public static void main(String[] args) {
        System.out.println(arr());


    }
    public static String arr(){
        Random a = new Random();
        int  num;

        num = a.nextInt(3);
        if (num==0){
            return "오늘도 고생했어";
            }else if (num==1){
            return "잘하고 있니?";
        } else if (num==2) {
            return "굿굿";
        }
        return null;
    }
}
