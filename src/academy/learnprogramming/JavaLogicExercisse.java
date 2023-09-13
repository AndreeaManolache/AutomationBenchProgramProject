package academy.learnprogramming;

public class JavaLogicExercisse {
    //Exercise 1
    // When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60,
    // inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given
    // values is successful, or false otherwise.
//     cigarParty(30, false) → false
//    cigarParty(50, false) → true
//    cigarParty(70, true) → true

    public static void main(String[] args) {
        int cigars = 30;
        boolean isWeekend = false;
        if (isWeekend == true && cigars >= 40)
            System.out.println(true);
        if (!(isWeekend) && cigars >= 40 && cigars <= 60)
            System.out.println(true);
        else
            System.out.println(false);
    }
}