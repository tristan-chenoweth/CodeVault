#cSharp
```cs
using System;

namespace ElseIfStatement
{
    class Program
    {
        static void Main(string[] args)
        {
            // int guests = 3;  // value that will trigger else if block
            int guests = 0; // vlaue that will will trigger  else block

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
```