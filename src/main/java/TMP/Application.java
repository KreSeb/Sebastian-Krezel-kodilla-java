package TMP;

class Application
{
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.addAToB(5, 5);
        System.out.println(result);
    }
}
