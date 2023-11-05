public class TaskThree {

    public static void main(String[] args){
        int a = 555;
        int thirdNumber = a%10;
        int secondNumber = ((a - thirdNumber)/10)%10;
        int firstNumber = (((a - thirdNumber)/10) - secondNumber)/10;
        System.out.println(thirdNumber + secondNumber + firstNumber);
    }

}
