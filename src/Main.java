public class Main {
    public static void main(String[] args)
    {
        int birthMonth = 0;
        double LOWEST_MONTH = 1;
        double HIGHEST_MONTH = 12;
        birthMonth = 15;
        if (LOWEST_MONTH <= birthMonth && birthMonth <= HIGHEST_MONTH)
        {
            System.out.println("Your birth month is " + birthMonth);
        }
        else
        {
            System.out.println(" You entered and incorrect month value: " + birthMonth);
        }
    }
}