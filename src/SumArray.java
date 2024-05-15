
public class SumArray {
      public static double sum(double[] numbers) {
        // TODO code application logic here
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        double[] numbers1 = {1, 5.2, 4, 0, -1};
        double[] numbers2 = {};
        double[] numbers3 = {-2.398};
        
        System.out.println(sum(numbers1));
        System.out.println(sum(numbers2));
        System.out.println(sum(numbers3));
    }        
}
    

