/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EngineSeries;

/**
 *
 * @author Peter Zarafield
 */
public abstract class M30Engine implements MSeriesEngine {
    
    public int numberOfCylinders = 6;
    public String engineLayout = "inline";
    
    public double getNumberOfCylinders(){
        return numberOfCylinders;
    }
        
    public String getEngineLayout (){
        return engineLayout;
    }
    
}
