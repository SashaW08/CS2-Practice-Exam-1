public class StarshipExplorer {

    public static void main(String[] args) {
        StarshipExplorer starshipexplorer = new StarshipExplorer();
    }

    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";

    Alien[] aliens = new Alien[50];

    public StarshipExplorer(){

        System.out.println("Hello world! Good luck on your exams!");
        System.out.println();

        for(int x=0; x<aliens.length; x++){
            aliens[x] = new Alien((int)(Math.random()*75+1), (int)(Math.random()*101));
        }

        displayAliens();
        System.out.println();
        System.out.println("It is "+ checkEnergy() + " that some of the alien energy levels are the same");
        System.out.println();
        System.out.println("This is the deciphered alien language: " + decipher(alienLanguage));

    }

    public void displayAliens(){

        for(int x=0; x<aliens.length; x++){
           aliens[x].printInfo();
        }

    }

    public boolean checkEnergy(){

        boolean yesornoyay = false;

        for(int i=0;i<aliens.length;i++) {
            System.out.println(aliens[i].getEnergyLevel());
            System.out.println("checking others:");
            for (int x = i+1; x < aliens.length; x++) {
                System.out.println(aliens[x].getEnergyLevel());

                if(aliens[i].getEnergyLevel() == aliens[x].getEnergyLevel()){
                    System.out.println("yay");
                    yesornoyay=true;
                }
            }
        }
        return yesornoyay;
    }

    public String decipher(String palienlanguage){

        alienLanguage = palienlanguage;
        String decodedstring = "";
        int astrixIndex = palienlanguage.indexOf("*");

        while(palienlanguage.contains("*")){

            decodedstring = decodedstring + palienlanguage.charAt(astrixIndex + 1);
            palienlanguage = palienlanguage.substring(astrixIndex + 1);
            astrixIndex = palienlanguage.indexOf("*");

        }
        return decodedstring;
    }

}