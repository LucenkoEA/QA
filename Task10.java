public class Challenge {

    public static void main (String[] args) {
        System.out.println(reverseCase("Happy Birthday"));
        System.out.println(reverseCase("MANY THANKS"));
        System.out.println(reverseCase("sPoNtAnEo"));
    }
    static String reverseCase(String str) {
        char[] reverseCase = str.toCharArray();
        for (int i =0; i < reverseCase.length; i++) {
            char c = reverseCase[i];
            if (Character.isUpperCase(c)) {
                reverseCase[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)) {
                reverseCase[i] = Character.toUpperCase(c);
            }
        }
       return new String(reverseCase);
    }
}
