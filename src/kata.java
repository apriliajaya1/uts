
public class kata {
      public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int score : classPoints) {
            sum += score;
        }
        int average = sum / classPoints.length;
        return yourPoints > average;
    }

    public static void main(String[] args) {
        int[] classPoints1 = {70, 80, 90};
        int yourPoints1 = 85;
        System.out.println(betterThanAverage(classPoints1, yourPoints1));  // Output: true

        int[] classPoints2 = {60, 65, 70};
        int yourPoints2 = 55;
        System.out.println(betterThanAverage(classPoints2, yourPoints2));  // Output: false

        int[] classPoints3 = {80, 85, 90};
        int yourPoints3 = 90;
        System.out.println(betterThanAverage(classPoints3, yourPoints3));  // Output: true
    }
}
    
