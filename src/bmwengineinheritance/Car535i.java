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
public class Car535i extends FiveSeries {
    
    final String modelName = "535i";
    final String engineCode = "m30b35";
    
    M30B35 engine = new M30B35();
    
    double displacement = engine.getDisplacement();
    
    //int cylinders = engine.numberOfCylinders;
    
}
