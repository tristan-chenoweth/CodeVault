using System;

namespace NameGrab
{
    class Program
    {
        static void Main(string[] args)
        {
            // User Name
            string name = "Farhad Hesam Abbasi";

            // Get first letter
            int charPosition = name.IndexOf("F");
            char firstLetter = name[charPosition];

            // Get last name
            int charPositionLast = name.IndexOf("Abbasi");
            string lastName = name.Substring(charPositionLast);

            // Print results
            Console.WriteLine(lastName);

        }
    }
}
