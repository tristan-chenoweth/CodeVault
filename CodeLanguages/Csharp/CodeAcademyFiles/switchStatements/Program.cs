using System;

namespace SwitchStatement
{
    class Program
    {
        static void Main(string[] args)
        {
            // switch test case (uncomment line below to print test case to console)
            // string genre = "Horror"; 

            // Prompt user input question
            Console.WriteLine("Pick a movie genre from the list below to get a movie recommendation");
            Console.WriteLine("Drama\nComedy\nAdventure\nHorror\nScience Fiction\n");
            Console.WriteLine("Your choice: ");
            // Declaration of variable and set to gathered input from user
            string genre = Console.ReadLine();  // console reader (input from user)

            // Create switch function to determine genre output
            switch (genre)
            {
                case "Drama":
                    Console.WriteLine("A good recommmendation for " + genre +  " is: Citizen Kane");
                    break;

                case "Comedy":
                    Console.WriteLine("A good recommmendation for " + genre +  " is: Duck Soup");
                    break;

                case "Adventure":
                    Console.WriteLine("A good recommmendation for " + genre +  " is: King Kong");
                    break;

                case "Horror":
                    Console.WriteLine("A good recommmendation for " + genre +  " is: Psycho");
                    break;

                case "Science Fiction":
                    Console.WriteLine("A good recommmendation for " + genre +  " is: 2001: A Space Odyssey");
                    break;

                default:
                    Console.WriteLine("No movie found");
                    break;
            }
        }
    }
}