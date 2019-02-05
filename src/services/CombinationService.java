package services;

import services.utils.Checker;
import models.CombinationModel;

public class CombinationService  {
    private CombinationModel combinationModel;
    private Checker checkerMasterMind;

    public CombinationService(CombinationModel combinationModel, Checker checkerMasterMind) {
        this.combinationModel=combinationModel;
        this.checkerMasterMind=checkerMasterMind;
    }

    public void create()
    {
        this.combinationModel.createCombination();
    }
}
