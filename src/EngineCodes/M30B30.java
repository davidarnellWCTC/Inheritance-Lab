/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EngineCodes;

import EngineSeries.M30Engine;

/**
 *
 * @author Peter Zarafield
 */
public class M30B30 extends M30Engine {
    
    private final double displacement = 3.0;
    
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
