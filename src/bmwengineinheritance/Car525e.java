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
public class Car525e extends FiveSeries {
    
    final String modelName = "525i";
    final String engineCode = "m20b27";
    
    M20B27 engine = new M20B27();
    
    double displacement = engine.getDisplacement();
    
}
