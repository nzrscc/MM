package models;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class CombinationModel {
    private Dao instanceDao;
    private int[] combinazione=new int[3];
    private String sql;

    public CombinationModel(Dao instanceDao) {
        this.instanceDao=instanceDao;

    }

    public void  CreaTabellaCombination() {
        this.sql = "CREATE TABLE IF NOT EXISTS COMBINATION (ID INTEGER (PRIMARY KEY), User VARCHAR(20), Soluzione VARCHAR(20), Data_Operazione VARCHAR(30))";
        instanceDao.creaTabella(sql);
    }

    /*
    public void PopolaTabella(Vettori esecuzione, ControlloNumeri controlloNumeri) {
        timeStamp = new SimpleDateFormat("dd.MM.yyyy - HH.mm.ss").format(new Date());
        try {
            String sql = "INSERT INTO ESECUZIONI (Tentativi, Soluzione, Prova, NumeriInPosizioneEsatta, NumeriInPosizioneSbagliata, Data_Operazione) " +
                    "VALUES ('" + esecuzione.getTentativi() + "', '" + Arrays.toString(esecuzione.getSoluzione()) + "', '" + Arrays.toString(esecuzione.getNumeri())
                    + "', '" + controlloNumeri.getPosizioneEsatta() + "', '" + controlloNumeri.getNumeriEsatti() + "', '" + timeStamp + "')";
            this.stmt.executeUpdate(sql);
            System.out.println("Record aggiunto!!\n");
        } catch (SQLException var3) {
            var3.printStackTrace();
        }

    }*/

    public void createCombination(){
        for(int i=0;i<this.combinazione.length;i++)
        {
            this.combinazione[i]=(int)(Math.random()*10);
        }
    }

}
