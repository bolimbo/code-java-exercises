package countries;


import java.util.Scanner;

public class CountryApp {
    public static void main(String[] args) {
        String str;

        Country[] countries = CountryArray.findAll();
        Scanner scan = new Scanner(System.in);

        do {


            System.out.println("What do you want to see?\n countries / faveplaces\n favefoods / placerating / all");
            str = scan.nextLine();


            if (str.equalsIgnoreCase("all")) {
                for (Country country : countries) {
                    System.out.println("Visit: " + country.getCountryname() + " - " + "Favorite Foods: " + country.getFavoriteFood() + " - " + "Favorite places: " + country.getFavoritePlace() + " rating: " + country.placeRating());
                }


            }else if(str.equalsIgnoreCase("countries")){
                for(Country country : countries) {
                    System.out.println(country.getCountryname());

                }
            }
            else if(str.equalsIgnoreCase("faveplaces")) {
                for (Country country : countries) {
                    System.out.println(country.getCountryname() + " " + country.getFavoritePlace());
                }
            }
            else if(str.equalsIgnoreCase("favefoods")) {
                for (Country country : countries) {
                    System.out.println(country.getCountryname() + " " + country.getFavoriteFood());
                }
            }
            else if(str.equalsIgnoreCase("placerating")) {
                for (Country country : countries) {
                    System.out.println(country.getCountryname() + " " + country.placeRating());
                }
            }
                    System.out.println("try again");
            str= scan.nextLine();

        } while (str.equalsIgnoreCase("yes"));


    }
}