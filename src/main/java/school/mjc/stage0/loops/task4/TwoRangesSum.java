package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip > lastInRow)
            System.out.println("number to skip is bigger then the last");
        else if(lastInRow < 0)
            System.out.println("last number in row is negative");
        else {
            int sum =0;
            int sumSipped =0;
            for(int i=0; i<=lastInRow; i++){
                if(i <= numberToSkip) {
                    sumSipped += i;
                }
                else{
                    sum += i;
                }
            }
            System.out.println("skipped sum is " + sumSipped);
            System.out.println("counted sum is " + sum);
        }

    }
}
