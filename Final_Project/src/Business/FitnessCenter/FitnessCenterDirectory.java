/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FitnessCenter;

import java.util.ArrayList;

/**
 *
 * @author tanma
 */
public class FitnessCenterDirectory {
    
    private ArrayList<FitnessCenter> FitnessCentersArray;
    
    public FitnessCenterDirectory() {
        this.FitnessCentersArray = new ArrayList();
    }
    
    public FitnessCenter createFitnessCenter(String name){
        for (FitnessCenter FitnessCenterArray : FitnessCentersArray){
            if(FitnessCenterArray.getFitnessCenterName().equals(name)){
                return null;
            }
        }
        
        FitnessCenter fitnessCenter = new FitnessCenter(name);
        this.FitnessCentersArray.add(fitnessCenter);
        return fitnessCenter;
}
}