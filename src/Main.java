public class Main {
    public static void main(String[] args) {

        char[][] studentAnswers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] highestcount = new int[10];

        for (int row = 0; row < studentAnswers.length; row++) {
            int countCorrectAnswers = 0;
            for (int column = 0; column < studentAnswers[row].length; column++) {
                if (studentAnswers[row][column] == keys[column])
                    countCorrectAnswers += 1;
            }
            highestcount[row] = countCorrectAnswers;
            System.out.println("Student " + (row + 1) + " answered: " + countCorrectAnswers + " correct questions");
        }

        //How do you modify the code so it also displays the highest count and the student
        //with the highest count?
        int maxCorrectAnswers = highestcount[0];
        int studentID = 0;
        for (int i = 0; i < highestcount.length; i++) {
            if (highestcount[i] > maxCorrectAnswers) {
                maxCorrectAnswers = highestcount[i];
                studentID = i;
            }
        }
        System.out.println("\nStudent " + (studentID+1) + " has the max corrects answers: " + maxCorrectAnswers );
    }

}