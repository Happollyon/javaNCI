import javax.swing.JOptionPane;

public class CoinTossApp{
        public static void main(String args[]){

                int userToss, toss;
                String message, comp, user;
                CoinToss ct = new CoinToss();
                int count = 0;
                int compScore = 0, userScore = 0;

                while (count < 5){
                        userToss = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 for heads, 2 for tails"));
                        ct.setUserGuess(userToss);
                        ct.setToss();
                        ct.compute();
                        toss = ct.getToss();
                        message = ct.getMessage();
                        if (toss == 1)
                                comp = "heads";
                        else
                                comp = "tails";

                        if (userToss == 1)
                                user = "heads";
                        else
                                user = "tails";

                        if (message.equals("You lose"))
                                compScore++;
                        else
                                userScore++;
                        JOptionPane.showMessageDialog(null, "Computer guessed "+comp+" you guessed "+user+" "+message);

                        count ++;
                }
                JOptionPane.showMessageDialog(null, "Score: Computer "+compScore+" User "+userScore);
        }
}
