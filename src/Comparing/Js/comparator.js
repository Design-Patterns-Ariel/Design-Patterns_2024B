class Movie {
    constructor(name, rating, year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    getRating() {
        return this.rating;
    }

    getName() {
        return this.name;
    }

    getYear() {
        return this.year;
    }
}

class RatingCompare {
    compare(m1, m2) {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}

class NameCompare {
    compare(m1, m2) {
        return m1.getName().localeCompare(m2.getName());
    }
}

class YearCompare {
    compare(m1, m2) {
        if (m1.getYear() < m2.getYear()) return -1;
        if (m1.getYear() > m2.getYear()) return 1;
        else return 0;
    }
}

const list = [];
list.push(new Movie("Force Awakens", 8.3, 2015));
list.push(new Movie("Star Wars", 8.7, 1977));
list.push(new Movie("Empire Strikes Back", 8.7, 1980));
list.push(new Movie("Return of the Jedi", 8.4, 1983));

console.log("Sorted by name");
const nameCompare = new NameCompare();
list.sort((a, b) => nameCompare.compare(a, b));
list.forEach(movie => console.log(`${movie.getRating()} ${movie.getName()} ${movie.getYear()}`));

console.log("\nSorted by rating and then by name");
const ratingCompare = new RatingCompare();
const mComp = (m1, m2) => ratingCompare.compare(m1, m2) || nameCompare.compare(m1, m2);
list.sort(mComp);
list.forEach(movie => console.log(`${movie.getRating()} ${movie.getName()} ${movie.getYear()}`));
