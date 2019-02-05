import controllers.Controller;
import models.CombinationModel;
import models.Dao;
import models.TryModel;
import services.CombinationService;
import services.TryService;
import services.ValidatorService;
import services.utils.Checker;
import services.utils.CheckerMasterMind;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Controller controller=createContext();
        System.out.print("Inserire username: ");
        in.nextLine();



    }

    private static Controller createContext()
    {
        Checker checkerMasterMind=new CheckerMasterMind();
        Dao instanceDao=Dao.newIstance();
        TryModel tryModel=new TryModel(instanceDao);
        CombinationModel combinationModel=new CombinationModel(instanceDao);
        CombinationService combinationService=new CombinationService(combinationModel, checkerMasterMind);
        TryService tryService=new TryService(tryModel);
        ValidatorService validatorService=new ValidatorService();
        Controller controller=new Controller(validatorService, combinationService, tryService);
        return controller;
    }
}
