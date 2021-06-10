public class CoinToss{

        int toss;
        int userGuess;
        String message;

        public CoinToss(){
                toss = 0;
                userGuess = 0;
                message = " ";
        }

        public void setUserGuess(int userGuess){
              this.userGuess = userGuess;
        }
        public void setToss(){
              toss = (int)(Math.random()*2)+1;
        }
        public int getToss(){
              return toss;
        }

        public void compute(){
              if (userGuess == toss){
                      message = "You win";
              } else {
                      message = "You lose";
              }
        }

        public String getMessage(){
                return message;
        }
  }//class closing bracket
