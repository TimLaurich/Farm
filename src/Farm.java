import java.util.ArrayList;

public class Farm {

    private int animalWeight;

    private int sizeOfAnimal;
    ArrayList<Animal> cattle = new ArrayList<>();
    ArrayList<Flower> flowers = new ArrayList<>();

    public void addCattle(Animal animal) throws Exception {
        if(cattle.size()<= 20){
            cattle.add(animal);
        }else {
            throw new Exception("maximální počet malých zvířat");
        }
    }
    public void removeCattle(int index) throws Exception{
        if(index < 0){
            throw new Exception();
        }else{
            cattle.remove(index);
        }
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }


    public void removeFlower(int index) throws Exception{
        if(index < 0){
            throw new Exception();
        }else{
            flowers.remove(index);
        }
    }
    public double feeding() {
        return sizeOfAnimal/animalWeight * 2;
    }












}
