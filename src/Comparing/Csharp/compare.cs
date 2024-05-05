using System;
using System.Collections.Generic;

public class Movie
{
    public double Rating { get; }
    public string Name { get; }
    public int Year { get; }

    public Movie(string name, double rating, int year)
    {
        Name = name;
        Rating = rating;
        Year = year;
    }
}

public class RatingCompare : IComparer<Movie>
{
    public int Compare(Movie x, Movie y)
    {
        if (x.Rating < y.Rating)
            return -1;
        if (x.Rating > y.Rating)
            return 1;
        return 0;
    }
}

public class NameCompare : IComparer<Movie>
{
    public int Compare(Movie x, Movie y)
    {
        return string.Compare(x.Name, y.Name, StringComparison.Ordinal);
    }
}

public class YearCompare : IComparer<Movie>
{
    public int Compare(Movie x, Movie y)
    {
        if (x.Year < y.Year)
            return -1;
        if (x.Year > y.Year)
            return 1;
        return 0;
    }
}

class TestMovie
{
    static void Main(string[] args)
    {
        var list = new List<Movie>
        {
            new Movie("Force Awakens", 8.3, 2015),
            new Movie("Star Wars", 8.7, 1977),
            new Movie("Empire Strikes Back", 8.7, 1980),
            new Movie("Return of the Jedi", 8.4, 1983)
        };

        Console.WriteLine("Sorted by name:");
        list.Sort(new NameCompare());
        foreach (var movie in list)
        {
            Console.WriteLine($"{movie.Rating} {movie.Name} {movie.Year}");
        }

        Console.WriteLine("\nSorted by rating and then by name:");
        list.Sort(new RatingCompare().ThenBy(new NameCompare()));
        foreach (var movie in list)
        {
            Console.WriteLine($"{movie.Rating} {movie.Name} {movie.Year}");
        }
    }
}
