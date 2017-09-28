package countries;

public class Country {
    private String countryName;
    private String favoriteFood;
    private String favoritePlace;
    private int placeRating;


    public Country(String countryname, String favoritefood, String favoriteplace, int placerating) {
        this.countryName = countryname;
        this.favoriteFood = favoritefood;
        this.favoritePlace = favoriteplace;
        this.placeRating = placerating;

    }

    public String getCountryname() {
        return countryName;
    }

    public String getFavoriteFood() {
        return this.favoriteFood;
    }

    public String getFavoritePlace() {
        return this.favoritePlace;
    }

    public int placeRating() {
        return this.placeRating;
    }

}
