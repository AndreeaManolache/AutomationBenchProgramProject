package academy.learnprogramming;

public class JavaWhileExercise {
    //Consider the following code:
    //define tester method here
    public static void main(String[] args) throws Exception {
        JavaWhileExercise tc = new JavaWhileExercise();
        while (tc.tester()) {
            System.out.println("running...");
        }
    }

    // Which of the following options would be a valid implementation of tester() method?
    public boolean tester() {
        return false;
    }
}
