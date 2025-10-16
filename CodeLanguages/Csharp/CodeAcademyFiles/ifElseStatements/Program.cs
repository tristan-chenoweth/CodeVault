using System;

namespace IfElseStatement
{
    class Program
    {
        static void Main(string[] args)
        {
            //int people = 10;  // value that will read true in if block
            //string weather = "nice"; // value that will read true in if block

            int people = 12;  // value that will read false in if block and move to else block
            string weather = "bad";  // value that will read false in if block and move to else block

            // If Else statement to determine different output
            if(people <= 10 && weather == "nice")
            {
                Console.WriteLine("SaladMart");
            }
            else
            {
                Console.WriteLine("Soup N Sandwich");
            }
        }
    }
}
