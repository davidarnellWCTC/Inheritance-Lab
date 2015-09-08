/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmwengineinheritance.Models;

import bmwengineinheritance.FiveSeries;
import EngineCodes.M30B35;

/**
 *
 * @author Peter Zarafield
 */
public class Car535i extends FiveSeries {
    
    final String modelName = "535i";
    final String engineCode = "m30b35";
    
    // Was working without being marked public
    // Stopped working, not sure why
    // Marked it public and now it works again
    public M30B35 engine = new M30B35();
    
    public double displacement = engine.getDisplacement();
    
    //int cylinders = engine.numberOfCylinders;
    
}
