package pkg;

public class Movie{
    String name;
    double rating;
    int numRatings;
    int revenue;
    boolean compare;
    
    public Movie(){
        name = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String name, double rating, int numRatings, int revenue){
        this.name = name;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public void movieToString(){
        System.out.println("Movie : " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }
    
    public String getMovieName(){
        return name;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public double getRating(){
        return rating;
    }
    
    public double addRating(double r){
        rating = (rating*numRatings+r)/(numRatings+1);
        return rating;
        
    }
    
    public boolean compareRatings(Movie n){
        double rating1 = (getRating());
        double rating2 = (n.getRating());
        
        if(rating1>rating2){
            boolean compare = true;
        }
        
        else if(rating2>rating1){
            boolean compare = false;
        }
        
        return compare;
    }
    
    public String revenueToString(){
        int m1 = (int)(revenue/1000000);
        int rev = revenue - m1*1000000;
        int thousand = (int)(rev/1000);
        rev = rev - thousand*1000;
        int tens = rev;
        return (m1 + "," + thousand + "," + tens);
    }
    

}
