package forest;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.BoxLayout;
import java.awt.image.BufferedImage;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 *データを保持および読み書きするModel.
 *@author Kenji Hirashima
 */

public class ForestModel extends mvc.Model{

		private ArrayList<String> inputStringArray;
		private ArrayList<Tree> treeArray;
		private Node currentNode;
		private Point currentPoint;

		public void open(){
				BoxLayout nodeLayout;
				showSelectMenu();
				allTrees = aForestMenu.getAllTrees();
				nodeLayout = new BoxLayout(this, aForestConverter.getAllNodes.length);
				for(Node aNode : aForestConverter.getAllNodes()){

				}
				BoxLayout aLayout = new BoxLayout(this,aForestConverter.getAllNodes)
				currentPoint.x = defaultX;
				currentPoint.y = defaultY;
				for(Tree aTree : allTrees){

				}
		}
		public void showSelectMenu(){

		}

		public void setTreeArray(ArrayList<String> inputStringArray){
				
		}

}