/* package forest; */

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

public class ForestModel extends mvc.Model{

		protected BoxLayout nodeLayout;
		protected ForestConverter aForestConverter;
		protected Tree[] allTrees;
		protected Node currentNode;
		protected Point currentPoint;
		protected final int DEFAULT_X = 20;
		protected final int DEFAULT_Y = 20;
		protected final int FOREST_TYPE = 0;
		protected final int SEMILATTICE_TYPE = 1;
		protected final int TREE_TYPE = 2;

		public void open(){
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
}