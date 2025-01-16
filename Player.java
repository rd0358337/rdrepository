public class Player {
    //Private attributes for initials and score
    private String initials;
    private int score;

    //Constuctor for initials and score
    public Player(String initials, int score) {

        this.initials = initials;
        this.score = score;
    }

    //Initials getter method
    public String getInitials() {
        
        return initials;
    }

    //Initials setter method
    public void setInitials(String initials) {

        this.initials = initials;
    }

    //Score getter method
    public int getScore() {

        return score;
    }

    //Score setter method
    public void setScore(int score) {

        this.score = score;
    }
    
}//end of Player
