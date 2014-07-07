package forest;

import java.awt.event.MouseEvent;
import java.awt.Point;

/**
 * ForestController
 * @author Yuki Tsuchida
 */

public class ForestController extends mvc.Controller
{
	/**
	 * コンストラクタ
	 */
	public ForestController()
	{
		super();
	}
	
	/**
	 * 選択している木の要素を出力する。
	 * x.yの座標値で返される
	 * @param aMouseEvent
	 */
	public void mouseClicked(MouseEvent aMouseEvent)
	{
		Point aPoint = aMouseEvent.getPoint();
		aPoint.translate(view.scrollAmount().x, view.scrollAmount().y);
		ForestModel aForestModel = (ForestModel)(this.model);
		aForestModel.mouseClicked(aPoint, aMouseEvent);
		return;
	}
	/**
	 * 木構造全体をマウスドラッグで動かす。
	 * @param aMouseEvent
	 */
	public void mouseDragged(MouseEvent aMouseEvent)
	{
		super.mouseDragged(aMouseEvent);
	}
}
