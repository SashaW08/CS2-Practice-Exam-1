public class StarshipExplorer {

    public static void main(String[] args) {
        StarshipExplorer starshipexplorer = new StarshipExplorer();
    }

    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";
    Alien[] aliens = new Alien[50];

    public StarshipExplorer(){

        System.out.println("Hello world! Good luck on your exams!");

        for(int x=0; x<aliens.length; x++){
            aliens[x] = new Alien((int)(Math.random()*75+1), (int)(Math.random()*101));
        }

    }

    public void displayAliens(){

        for(int x=0; x<aliens.length; x++){

        }

    }

}