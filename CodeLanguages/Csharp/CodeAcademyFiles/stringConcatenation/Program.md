#cSharp
```cs
using System;

namespace StoryTime
{
    class Program
    {
        static void Main(string[] args)
        {
            // Declare the variables
            string beginning = "This is the beginning of the story.\n";
            string middle = "This is the middle of the story.\n";
            string end = "This is the end of the story.";

            // Concatenate the string and the variables
            string story = beginning + middle + end;

            // Print the story to the console 
            Console.WriteLine(story);
        }
    }
}
```