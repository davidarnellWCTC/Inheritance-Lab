/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmwengineinheritance;

/**
 *
 * @author Peter Zarafield
 */
public class M20B27 extends M20Engine {
    
    private final double displacement = 2.7;
    
        public double getDisplacement(){
        return displacement;
    }
        
        public double getNumberOfCylinders(){
        return numberOfCylinders;
    }
    
    public String getEngineLayout (){
        return engineLayout;
    }
    
}
