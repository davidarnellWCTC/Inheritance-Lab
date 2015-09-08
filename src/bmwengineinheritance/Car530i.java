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
public class Car530i extends FiveSeries {
    
    final String modelName = "525i";
    final String engineCode = "m30b30";
    
    M30B30 engine = new M30B30();
    
    double displacement = engine.getDisplacement();
    
}
