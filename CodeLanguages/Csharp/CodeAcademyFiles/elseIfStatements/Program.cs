using System;

namespace ElseIfStatement
{
    class Program
    {
        static void Main(string[] args)
        {
            // int guests = 3;  // value that will trigger else if block
            int guests = 0; // vlaue that will will trigger  else block

            // If, else if, else statemnets for comparing against guest integer
            if(guests >= 4)
            {
                Console.WriteLine("Catan");
            }
            else if(guests >= 1)
            {
                Console.WriteLine("Innovation");
            }
            else
            {
                Console.WriteLine("Solitaire");
            }
        }
    }
}
