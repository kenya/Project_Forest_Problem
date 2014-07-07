package forest;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
//import java.awt.Point;

/**
 * BranchとNodeを描くためのView
 * @author kenya shinki
 */
public class ForestView extends mvc.View
{
	
	/**
	 * 指定されたモデルとコントローラでMVCを構築するコンストラクタ。
     * @param aModel モデル
     * @param aController コントローラー
	 */
	public ForestView(ForestModel aModel, ForestController aController)
	{
		super(aModel, aController);
	}
	
	/**
	 * 描画を行う。ここで全てのnodeとbranchを書いてしまう。スクロールに関してはViewで行う。
     * @param aGraphics グラフィックス
	 */
	public void paintComponent(Graphics aGraphics)
	{
        super.paintComponent(aGraphics);
        ForestModel aModel = (ForestModel)this.getModel();
			//Branch aBranch = aModel.getBranch(); // Branchを得る
			//Node aNode = aBranch.getNode(); // みたいな感じで得るのかな。
        Font aFont = new Font(Font.Serif, Font.PLAIN, 12);
			//aGraphics.setColor(Color.black);
        aGraphics.setFont(aFont);
        int fontHeight = aFont.getSize();
        /*aGraphics.drawString(aModel.label(), 1, fontHeight + 1);
        aGraphics.drawString(aModel.label(), 1, fontHeight + 2);
        aGraphics.drawString(aModel.label(), 1, fontHeight + 3);
        aGraphics.drawString(aModel.label(), 2, fontHeight + 1);
        aGraphics.drawString(aModel.label(), 2, fontHeight + 2);
        aGraphics.drawString(aModel.label(), 2, fontHeight + 3);
        aGraphics.drawString(aModel.label(), 3, fontHeight + 1);
        aGraphics.drawString(aModel.label(), 3, fontHeight + 2);
        aGraphics.drawString(aModel.label(), 3, fontHeight + 3);*/
		
		/*
		 drawRectで四角を描く
		 Nodeの座標を得て、width,height分の大きさを描く
		 drawlineでNode同士を結ぶ
		 */
        aGraphics.setColor(Color.black);
        aGraphics.drawString(aModel.label(), 2, fontHeight + 2);
		return;
	}
}