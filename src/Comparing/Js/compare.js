/**
 * This class represents a 2D point in the plane.
 * Supports several operations on points in the plane.
 */
class Point {
    constructor(x, y) {
        this._x = x || 0;
        this._y = y || 0;
    }

    /** Returns the first coordinate of the point */
    x() {
        return this._x;
    }

    /** Returns the second coordinate of the point */
    y() {
        return this._y;
    }

    /** Returns the distance between the point and the origin */
    distance() {
        return Math.sqrt(this._x * this._x + this._y * this._y);
    }

    /** Returns a string containing the Point data */
    toString() {
        return `(${this._x},${this._y})`;
    }

    /**
     * Compares this point to another point based on their distances from the origin.
     * @param {Point} other The other point to compare with.
     * @returns {number} Negative if this point is closer to the origin,
     *                   positive if the other point is closer,
     *                   and zero if they are at the same distance.
     */
    compareTo(other) {
        const ans = this.distance() - other.distance();
        if (ans < 0) return -1;
        else if (ans > 0) return 1;
        else return 0;
    }
}

// Testing the Point class
const points = [];
for (let i = 0; i < 5; i++) {
    points.push(new Point(5 - i, 5 - i));
}

console.log("Values before sorting:");
console.log(points.map(point => point.toString()).join(", "));

points.sort((a, b) => a.compareTo(b));

console.log("Values after sorting:");
console.log(points.map(point => point.toString()).join(", "));
