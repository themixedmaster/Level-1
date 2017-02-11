
public class Internetfliks {
	public static void main(String[] args) {
		Movie beeMovie = new Movie("Bee Movie",0);	
		Movie bigHero6 = new Movie("Big hero 6",0);
		Movie twighlight = new Movie("Twilight",0);
		Movie harryPotter = new Movie("Harry Potter",0);
		Movie angryBirds = new Movie("Angry Birds",100);
		beeMovie.getTicketPrice();
		Netflix Internetfliks = new Netflix();
		Internetfliks.addMovie(beeMovie);
		Internetfliks.addMovie(angryBirds);
		Internetfliks.addMovie(harryPotter);
		Internetfliks.addMovie(twighlight);
		Internetfliks.addMovie(bigHero6);
		Internetfliks.printMovies();
		System.out.println(Internetfliks.getBestMovie());
		System.out.println(Internetfliks.getMovie(2));
	}
}
