using System;

namespace MakingProgress
{
    class Program
    {
        static void Main(string[] args)
        {
            // declare steps variable
            int steps = 0;

            // Two steps forward 
            steps = steps + 2;

            /* or can be programmed as
            steps++;
            steps++;
            */

            // One step back 
            steps = steps - 1;

            /* or can be programmed as
            steps--;
            */

            // Print result to the console
            Console.WriteLine(steps);
        }
    }
}