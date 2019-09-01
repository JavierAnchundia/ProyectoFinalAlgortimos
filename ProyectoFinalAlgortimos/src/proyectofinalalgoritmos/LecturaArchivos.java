/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalalgoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Javier
 */
public class LecturaArchivos {
    
    
      public static void leerEstudiante(String url,LinkedListMergeSort li){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      String[] temp = null;
      
      try {
 
         archivo = new File (url);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         String linea;
         while((linea=br.readLine())!=null){
            temp=linea.split(",");
            double promedioEconomia=(Double.parseDouble(temp[4])+Double.parseDouble(temp[5])+Double.parseDouble(temp[6])+Double.parseDouble(temp[7]))/4;
            double promedioSalud=(Double.parseDouble(temp[9])+Double.parseDouble(temp[10])+Double.parseDouble(temp[11])+Double.parseDouble(temp[12]))/4;
            double promedioLaboral=(Double.parseDouble(temp[14])+Double.parseDouble(temp[15])+Double.parseDouble(temp[16])+Double.parseDouble(temp[17]))/4;
            double promedioFamiliar=(Double.parseDouble(temp[19])+Double.parseDouble(temp[20])+Double.parseDouble(temp[21])+Double.parseDouble(temp[22]))/4;
 
            li.push(new Estudiante(temp[0],temp[1],temp[2],promedioEconomia,promedioSalud,promedioLaboral,promedioFamiliar));
         }
      }
      
      catch(Exception e){
         e.printStackTrace();
      }finally{
         
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }}
    
}
