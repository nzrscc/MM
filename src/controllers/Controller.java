package controllers;

import services.CombinationService;
import services.TryService;
import services.ValidatorService;

public class Controller {
    private ValidatorService validatorService;
    private CombinationService combinationService;
    private TryService tryService;

    public Controller(ValidatorService validatorService, CombinationService combinationService, TryService tryService) {
        this.combinationService=combinationService;
        this.validatorService=validatorService;
        this.tryService=tryService;
    }
}
