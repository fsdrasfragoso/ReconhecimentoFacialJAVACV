/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reconhecimento;

import org.bytedeco.javacpp.opencv_face.FaceRecognizer;
import static org.bytedeco.javacpp.opencv_face.createEigenFaceRecognizer;
/**
 *
 * @author esdra
 */
public class TesteJavaCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FaceRecognizer r = createEigenFaceRecognizer();
        
    }

   
    
}
