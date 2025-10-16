using System;

namespace LogicalOperators
{
    class Program
    {
        static void Main(string[] args)
        {
            // Declaration of boolean variables
            bool beach = true;
            bool hiking = false;
            bool city = true;

            // Declation of boolean variables with logical OR and AND operations
            bool yourNeeds = beach && city;
            bool friendNeeds = beach || hiking;
            bool tripDecision = yourNeeds && friendNeeds;

            // Write to console final decision of trip based on previous boolean variables
            Console.WriteLine(tripDecision);
        }
    }
}