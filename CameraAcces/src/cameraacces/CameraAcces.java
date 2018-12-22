/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cameraacces;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core.IplImage;

/**
 *
 * @author MAURYA
 */
public class CameraAcces {
public static void main(String[] args) throws Exception {
 OpenCVFrameGrabber frameGrabber = new OpenCVFrameGrabber(0); 
    frameGrabber.setFormat("mjpeg");
    frameGrabber.start();
    IplImage iPimg = frameGrabber.grab();
    CanvasFrame canvasFrame = new CanvasFrame("Camera");
    canvasFrame.setCanvasSize(iPimg.width(), iPimg.height());
    
    while (canvasFrame.isVisible() && (iPimg = frameGrabber.grab()) != null) {
           canvasFrame.showImage(iPimg);
    }
    frameGrabber.stop();
    canvasFrame.dispose();
    System.exit(0);
}
}
    

