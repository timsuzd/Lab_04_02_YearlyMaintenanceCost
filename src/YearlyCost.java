public class YearlyCost{
    static void main()
    {
        double spring = 1.09;
        double summer = 9.41;
        double fall = 882.10;
        double winter = 991.00;
        double totalCost = 0;

        totalCost = spring + summer + fall + winter;
        
        IO.println("The total cost is " + totalCost);
    }
}