/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FitnessCenter;
import Business.Role.Role;
import Business.Organization.Organization;
import java.util.ArrayList;
/**
 *
 * @author tanmayzope
 */
public class FitnessCenter extends Organization{
    
    private String FitnessCenterName;
    private String FitnessCenterAddress;

    public String getFitnessCenterName() {
        return FitnessCenterName;
    }

    public void setFitnessCenterName(String FitnessCenterName) {
        this.FitnessCenterName = FitnessCenterName;
    }

    public String getFitnessCenterAddress() {
        return FitnessCenterAddress;
    }

    public void setFitnessCenterAddress(String FitnessCenterAddress) {
        this.FitnessCenterAddress = FitnessCenterAddress;
    }
    
    public FitnessCenter(String FitnessCenterName){
        super();
        this.FitnessCenterName = FitnessCenterName;
    }
    
    @Override
    public String toString(){
        return this.FitnessCenterName;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
}
