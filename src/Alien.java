public class Alien {



    private int energyLevel;
    private int hostilityIndex;

    public Alien (int penergylevel, int phostilityindex){

        energyLevel = penergylevel;
        hostilityIndex = phostilityindex;

    }

    public int getEnergyLevel(){
        return energyLevel;
    }

    public void setEnergyLevel(int senergylevel){
        energyLevel = senergylevel;
    }

    public int getHostilityIndex(){
        return hostilityIndex;
    }

    public void setHostilityIndex(int shostilityindex){
        hostilityIndex = shostilityindex;
    }

    public void printInfo(){
        System.out.println("Energy level: " + energyLevel);
        System.out.print(". Hostility index: " + hostilityIndex);
    }

}
