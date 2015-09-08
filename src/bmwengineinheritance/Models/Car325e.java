/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmwengineinheritance.Models;

import EngineCodes.M20B27;
import bmwengineinheritance.ThreeSeries;

/**
 *
 * @author Peter Zarafield
 */
public class Car325e extends ThreeSeries {
    
    final String modelName = "325i";
    final String engineCode = "m20b27";
    
    M20B27 engine = new M20B27();
    
    double displacement = engine.getDisplacement();
    
}
