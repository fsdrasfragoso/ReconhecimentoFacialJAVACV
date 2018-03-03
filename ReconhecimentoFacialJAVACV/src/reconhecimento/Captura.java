/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reconhecimento;

import java.awt.event.KeyEvent;
import org.bytedeco.javacpp.opencv_face;
import static org.bytedeco.javacpp.opencv_face.createEigenFaceRecognizer;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;

/**
 *
 * @author esdra
 */
public class Captura {
    public static void main(String[] args) throws FrameGrabber.Exception {
        // TODO code application logic here
        
        KeyEvent tecla = null; 
        OpenCVFrameConverter.ToMat  converteMat = new OpenCVFrameConverter.ToMat();
        OpenCVFrameGrabber camera = new OpenCVFrameGrabber(0); 
        camera.start();
        
        CanvasFrame cFrame = new CanvasFrame("Previw",CanvasFrame.getDefaultGamma() / camera.getGamma()); 
        
        Frame  frameCapturado = null; 
        while((frameCapturado = camera.grab()) != null){
            if(cFrame.isVisible()){
                cFrame.showImage(frameCapturado);
            }
        }
        cFrame.dispose();
        camera.stop();
    }

}
