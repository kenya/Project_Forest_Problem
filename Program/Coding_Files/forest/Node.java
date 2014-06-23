package forest;

import java.util.List;
import java.util.ArrayList;

public class Node extends Object
{
    
    /**
       親ノードを示すノード
    */
    private Node parent;
    /**
       自分の子ノードのリスト
    */
    private List<Node> children;

    /**
       インスタンスを生成して応答する。
       親ノード、子ノードリストをそれぞれ初期化しておく。
    */
    public Node()
    {
	super();
	this.parent = null;
	this.children = new ArrayList<Node>();
    }
    
    /**
       インスタンスを生成して応答する。
       親ノードに指定されたノードを設定し、
       子ノードリストを初期化しておく
    */ 
    public Node(Node aParentNode)
    {
	super();
	this.parent = aParentNode;
	this.children = new ArrayList<Node>();
    }
    /**
       インスタンスを生成して応答する。
       親ノードと子ノードリストに指定されたノード及びリストを設定する。
    */
    public Node(Node aParentNode, ArrayList<Node> aChildrenList)
    {
	super();
	this.parent = aParentNode;
	this.children = aChildrenList;
    }

    /**
       子ノードリストに子供を追加する。
    */
    public void addChildNode(Node aChildNode)
    {
	List<Node> aChildrenList = this.getChildren();
	aChildrenList.add(aChildNode);
	return;
    }
    /**
       子供の数を応答する。
     */
    public int getNumberOfChildren()
    {
	return this.getChildren().size();
    }

    /**
       親ノードを応答する。
    */
    public Node getParent()
    {
	return this.parent;
    }
    /**
       子ノードリストを応答する。
    */
    public List<Node> getChildren()
    {
	return this.children;
    }	
    
}
