package defaultpackage;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Alpha;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.swing.JFrame;
import javax.vecmath.Point3d;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;
   
/**
 * Simple Java 3D example to display a rotating color cube.
 */
public class HelloUniverse extends JFrame {
   
   // Constructor
   public HelloUniverse() {
      // Setup a SimpleUniverse by referencing a Canvas3D
      GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
      Canvas3D canvas = new Canvas3D(config);
      Container cp = this.getContentPane();
      cp.setLayout(new BorderLayout());
      cp.add(canvas, BorderLayout.CENTER);
      SimpleUniverse universe = new SimpleUniverse(canvas);
   
      // Set up the viewer looking into the scene.
      universe.getViewingPlatform().setNominalViewingTransform();
   
      // Create the content branch and add it to the universe
      BranchGroup scene = createSceneGraph();
      universe.addBranchGraph(scene);
   
      // Configure this JFrame
      this.setSize(250, 250);
      this.setTitle("Hello Universe");
      this.setVisible(true);
   }
   
   // Create the content branch
   public BranchGroup createSceneGraph() {
      // Create the root node of the content branch
      BranchGroup nodeRoot = new BranchGroup();
   
      // Create the TransformGroup node, which is writable to support
      // animation, and add it under the root
      TransformGroup nodeTrans = new TransformGroup();
      nodeTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      nodeRoot.addChild(nodeTrans);
   
      // Create a visual object node (color cube) and add it to the scene.
      nodeTrans.addChild(new ColorCube(0.4));
  
      // Create a Behavior node to rotate the cube add it to the scene.
      Transform3D yAxis = new Transform3D();
      Alpha timing = new Alpha(-1, 4000);
      RotationInterpolator nodeRotator = new RotationInterpolator(timing,
            nodeTrans, yAxis, 0.0f, (float)Math.PI * 2.0f);
      BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
      nodeRotator.setSchedulingBounds(bounds);
      nodeRoot.addChild(nodeRotator);
   
      // Compile to perform optimizations on this content branch.
      nodeRoot.compile();
  
      return nodeRoot;
   }
   
   // Entry main method to invoke the constructor on the event dispatcher thread.
   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new HelloUniverse();
         }
      });
   }
}