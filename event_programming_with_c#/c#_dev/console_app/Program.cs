// ====>>>>>>>>>>>>>>>>Collections ================


internal class Program
{
    public static void Main(string[] args)
    {
        // Arrays 
        int[] arrays = [1, 2, 3, 4, 5];
        foreach (var item in arrays)
        {
            Console.WriteLine(item);
        }
        var arrayLength = arrays.Length;
        var arrayRank = arrays.Rank;

        Console.WriteLine(arrayLength);
        Console.WriteLine(arrayRank);


        // Enums =>>> a set of named constants 
        enum EmployeeType
    {
        Manager,
        Supervisor,
        Worker
    }
    // Tuples 
    var myTuple = (34, "Hey Jon", true);
    Console.WriteLine(myTuple);
}

}