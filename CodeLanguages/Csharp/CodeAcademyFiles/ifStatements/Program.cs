using System;

namespace IfStatement
{
  class Program
    {
        static void Main(string[] args)
        {
            // int socks = 3;  // amount that is true in if loop
            int socks = 6;  // amount that is false in the if loop

            // If only statement that has no else catch
            if(socks <= 3)
            {
                Console.WriteLine("Time to do laundry!");
            }

        }
    }
}