
internal class Program
{
    public static void Main(string[] args)
    {
        // Parse / Conversion 
        string textBoxAge = "jon";

        // var age = int.Parse(textBoxAge);
        // age = bool.Parse(textBoxAge);
        // age = double.Parse(textBoxAge);
        // age = DateTime.Parse(textBoxAge);


        // Console.WriteLine(age);

        bool tryParseResult = int.TryParse(textBoxAge, out int age);

        if (!tryParseResult)
        {
            Console.WriteLine(age);
            Console.WriteLine("Invalid Input");
        }

        Convert.
    }
}