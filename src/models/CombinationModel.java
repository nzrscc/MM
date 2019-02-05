package models;

public class CombinationModel {
    private Dao instanceDao;
    private int[] combinazione=new int[3];

    public CombinationModel(Dao instanceDao) {
        this.instanceDao=instanceDao;

    }

    public void createCombination(){
        for(int i=0;i<this.combinazione.length;i++)
        {
            this.combinazione[i]=(int)(Math.random()*10);
        }
    }

}
