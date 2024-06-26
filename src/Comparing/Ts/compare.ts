class Movie {
    constructor(private name: string, private rating: number, private year: number) {}

    getRating(): number {
        return this.rating;
    }

    getName(): string {
        return this.name;
    }

    getYear(): number {
        return this.year;
    }
}

class RatingCompare {
    compare(m1: Movie, m2: Movie): number {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        return 0;
    }
}

class NameCompare {
    compare(m1: Movie, m2: Movie): number {
        return m1.getName().localeCompare(m2.getName());
    }
}

class YearCompare {
    compare(m1: Movie, m2: Movie): number {
        if (m1.getYear() < m2.getYear()) return -1;
        if (m1.getYear() > m2.getYear()) return 1;
        return 0;
    }
}

const list: Movie[] = [
    new Movie("Force Awakens", 8.3, 2015),
    new Movie("Star Wars", 8.7, 1977),
    new Movie("Empire Strikes Back", 8.7, 1980),
    new Movie("Return of the Jedi", 8.4, 1983)
];

console.log("Sorted by name:");
const nameCompare = new NameCompare();
list.sort((a, b) => nameCompare.compare(a, b));
list.forEach(movie => console.log(`${movie.getRating()} ${movie.getName()} ${movie.getYear()}`));

console.log("\nSorted by rating and then by name:");
const ratingCompare = new RatingCompare();
list.sort((a, b) => ratingCompare.compare(a, b) || nameCompare.compare(a, b));
list.forEach(movie => console.log(`${movie.getRating()} ${movie.getName()} ${movie.getYear()}`));
