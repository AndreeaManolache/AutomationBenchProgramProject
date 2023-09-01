package academy.learnprogramming;

public class AppendDeleteAndMethodChaining {

    public static void main(String[] args) {

        StringBuilder first = new StringBuilder("This is a String");
        StringBuilder second = new StringBuilder("This is a String");

        System.out.printf("first: %s %n", first);

        System.out.println("clearing first");
//        first.delete(0, first.length());
//        System.out.printf("first: *%s* %n", first);
//
//        first.append("Another String");
        StringBuilder checkReference =first.delete(0, first.length());

       if( checkReference == first){
           System.out.println("The reference are the same");
       }
        first.append("Another String");
        first.delete(0, first.length()).append("Another String").append(" ").append(second);
        System.out.printf("checkReference: *%s* %n", checkReference);
    }
}
