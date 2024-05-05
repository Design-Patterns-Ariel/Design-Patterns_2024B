interface Comparable<T> {
    compareTo(other: T): number;
}

class Point implements Comparable<Point> {
    constructor(private _x: number = 0, private _y: number = 0) {}

    x(): number {
        return this._x;
    }

    y(): number {
        return this._y;
    }

    distance(): number {
        return Math.sqrt(this._x * this._x + this._y * this._y);
    }

    toString(): string {
        return `(${this._x},${this._y})`;
    }

    compareTo(other: Point): number {
        const thisDistance = this.distance();
        const otherDistance = other.distance();

        if (thisDistance < otherDistance) {
            return -1;
        } else if (thisDistance > otherDistance) {
            return 1;
        } else {
            return 0;
        }
    }
}

// Testing the Comparable interface
const point1 = new Point(3, 4);
const point2 = new Point(1, 2);

console.log(point1.compareTo(point2)); // Output: 1
console.log(point2.compareTo(point1)); // Output: -1
console.log(point1.compareTo(new Point(0, 0))); // Output: 1
