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
public abstract class Car525i extends FiveSeries{
    
    final String modelName = "525i";
    final String engineCode = "m20b25";
    
    M20B25 engine = new M20B25();
    
    double displacement = engine.getDisplacement();
    
}