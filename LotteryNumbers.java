import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;
    
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        this.random = new Random();

        int i = 0;
        while(i < 7) {
            int draw = random.nextInt(39);
            if(!this.containsNumber(draw + 1)) {
               numbers.add(draw + 1);
               i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        for(int entry : this.numbers) {
            if(number == entry) {
                return true;
            }
        }
        return false;
    }
}
