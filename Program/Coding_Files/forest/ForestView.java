package forest;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;

/**
 * View
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
	 * 描画を行う。ここで全ての全体図を書いてしまう。スクロールに関してはViewで行う。
     * @param aGraphics グラフィックス
	 */
	public void paintComponent(Graphics aGraphics)
	{
        super.paintComponent(aGraphics);
        ForestModel aModel = (ForestModel)this.getModel();
		
        Font aFont = new Font(Font.Serif, Font.PLAIN, 12);
		FontMetrics aMetrics = new FontMetrics(aFont); // stringのwidthを知るために使用する
		aGraphics.setColor(Color.black);
        aGraphics.setFont(aFont);
        int fontHeight = aFont.getSize();
		
		/*
		 drawRectで四角を描く
		 Nodeの座標を得て、width,height分の大きさを描く
		 drawlineでNode同士を結ぶ
		 ここですべて描いちゃう。未完成
		 */
        aGraphics.setColor(Color.black);
		
		for(Branch aBranch : aModel.getBranch()){
			
			aGraphics.drawLine(aBranch.getStartPoint().getX(), aBranch.getStartPoint().getY()+fontHeight/2, aBranch.getEndPoint().getX(), aBranch.getEndPoint().getY()+fontHeight/2);
			
			Node aChildNode = aBranch.getChildNode();
			aGraphics.drawString(aChildNode.getLabel(), aChildNode.getPoint().getX(), aChildNode.getPoint().getY());
			int width = aMetrics.stringWidth(aChildNode.getLabel());
			aGraphics.drawRect(aChildNode.getPoint().getX(), aChildNode.getPoint().getY(), width, fontHeight);
			
			Node aParentNode = aBranch.getParentNode();
			aGraphics.drawString(aParentNode.getLabel(), aParentNode.getPoint().getX(), aParentNode.getPoint().getY());
			width = aMetrics.stringWidth(aParentNode.getLabel());
			aGraphics.drawRect(aParentNode.getPoint().getX(), aParentNode.getPoint().getY(), width, fontHeight);
		}
		return;
	}
}