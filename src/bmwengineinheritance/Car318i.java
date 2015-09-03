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
public abstract class Car318i extends ThreeSeries {
    
    final String modelName = "318i";
    final String engineCode = "m10b18";
    
    M10B18 engine = new M10B18();
    
    double displacement = engine.getDisplacement();
    
       
}
