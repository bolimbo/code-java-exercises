package movies;


import util.Input;
import java.util.Scanner;


public class MoviesApplication {
    public static void main(String[] args)throws Exception {
//        MoviesArray mv = new MoviesArray():
        Movie[] movies = MoviesArray.findAll();
        Input input = new Input();
        Scanner scan = new Scanner(System.in);
        String another;

        do {
        System.out.println("What would you like to do?");

        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add a movie");
        int userInput = input.getInt();




            switch (userInput) {
                case 0:
                    System.out.println("peace out");
                    break;
                case 1:
                    System.out.println("View all movies: ");
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " - " + movie.getCategory());
                    }
                    break;
                case 2:
                    System.out.println("animated category:");

                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " - " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Drama category: " + MoviesArray.findAll().length);

                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " - " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Horror category: " + MoviesArray.findAll().length);
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " - " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Scifi category: " + MoviesArray.findAll().length);
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " - " + movie.getCategory());

                        }
                    }
                    break;
                case 6:
                    System.out.println("add a movie");
                    String str = scan.nextLine();
                    int size = movies.length;
//                    movies = Array.copyOF(movies, size + 1);
                    movies[size] = new Movie("carlo","horror");
                    System.out.println(str);


            }


        } while (input.yesNo());


    }

}


//int size = movies.length;
//movies = Arrays.copyOf(movies, size + 1);
//movies[size] = new Movie()
