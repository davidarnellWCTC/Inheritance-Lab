/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EngineCodes;

import EngineSeries.M10Engine;

/**
 *
 * @author Peter Zarafield
 */
public class M10B18 extends M10Engine{
    
    private final double displacement = 1.8;
    
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
