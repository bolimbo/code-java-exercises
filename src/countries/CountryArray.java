package countries;


public class CountryArray {
    public static Country[] findAll() {
        return new Country[]{
                new Country(
                        "Peru",
                        "Lomo Saltado",
                        "Cuzco - Machu Picchu",
                        5),

                new Country(
                        "China",
                        "Sushi",
                        "Beijing — Ancient and Modern Capital.",
                        5),

                new Country(
                        "Italy",
                        "Pasta",
                        "Verona - Romeo and Juliet's home ",
                        5),

                new Country(
                        "India",
                        "Tikka Masala",
                        "Dharamsala - Namgyal Monastery ",
                        5),

                new Country(
                        "Thailand",
                        "Pud Thai",
                        "Wat Rong Khun Temple",
                        5),

                new Country(
                        "Colombia",
                        "Bandeja Paisa",
                        "Cartagena",
                        5)

        };
    }
}