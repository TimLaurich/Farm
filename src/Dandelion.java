public class Dandelion extends Flower{


    public String watering(String plant){
        if(plant.equals("zalít květinu")){
            chanceOfGrowth++;
        }
        return "Zvýšila se ji šance na růst";
    }

}
