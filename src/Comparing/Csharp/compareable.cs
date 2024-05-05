using System;

public class Point : IComparable<Point>
{
    private double _x;
    private double _y;

    public Point(double x, double y)
    {
        _x = x;
        _y = y;
    }

    public double X => _x;
    public double Y => _y;

    public double Distance()
    {
        return Math.Sqrt(_x * _x + _y * _y);
    }

    public int CompareTo(Point other)
    {
        double thisDistance = this.Distance();
        double otherDistance = other.Distance();

        if (thisDistance < otherDistance)
        {
            return -1;
        }
        else if (thisDistance > otherDistance)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public override string ToString()
    {
        return $"({_x}, {_y})";
    }
}

class TestPoint
{
    static void Main(string[] args)
    {
        Point[] points = new Point[]
        {
            new Point(3, 4),
            new Point(1, 2),
            new Point(0, 0)
        };

        Console.WriteLine("Points before sorting:");
        foreach (var point in points)
        {
            Console.Write($"{point}, ");
        }
        Console.WriteLine();

        Array.Sort(points);

        Console.WriteLine("Points after sorting:");
        foreach (var point in points)
        {
            Console.Write($"{point}, ");
        }
        Console.WriteLine();
    }
}
