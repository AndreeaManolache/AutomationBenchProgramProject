package academy.learnprogramming;

public class StringIndexOf {
    public static void main(String[] args) {

        String courseName = "Learn C# for Beginners Crash Course";

        int position = -1;

//        position = indexOfIgnoreCase(courseName, " c" , 0);
//    //    position=courseName.lastIndexOf(" C");
//        System.out.println(position);
        do {
            position = indexOfIgnoreCase(courseName, " c", position + 1);
            if (position != -1) {
                courseName = replaceByIndex(courseName, position, " c".length(),
                        " Java");
                System.out.println(courseName);
            }
            // System.out.println(position);
        }
        while (position != -1);
        String fixedString = courseName.replace(" Java", " C");
        System.out.println(fixedString);
    }

    private static String replaceByIndex(String original, int start, int length,
                                         String replacement) {
        String toRemove = original.substring(start, start + length);
        return original.replaceFirst(toRemove, replacement);
    }

    private static int indexOfIgnoreCase(String text, String searchText, int fromIndex) {
        String textLowerCase = text.toLowerCase();
        String searchTextLowerCase = searchText.toLowerCase();
        return textLowerCase.indexOf(searchTextLowerCase, fromIndex);
    }
}
