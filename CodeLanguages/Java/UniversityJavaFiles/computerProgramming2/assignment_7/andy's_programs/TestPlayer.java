public class TestPlayer
{
    public static void main(String[] args)
    {
        Player p1 = new Player("Hello");
        System.out.println(p1);

        System.out.println("Cycle forward:");

        for (int i = 0; i < 5; i++)
        {
            p1.cycleForward();
            System.out.println(p1);
        }

        System.out.println("Cycle backward:");

        for (int i = 0; i < 5; i++)
        {
            p1.cycleBackward();
            System.out.println(p1);
        }
    }
}