package forest;

import java.util.List;
import java.util.ArrayList;

public class Node extends Object
{
    /**
       自身を一意に決定する番号
    */
    private int nodeId;
    /**
       親ノードを示すノード
    */
    private Node parent;
    /**
       自分の子ノードのリスト
    */
    private List<Node> children;
    /**
      自分が属する木
    */
    //private Tree tree;

    /**
       インスタンスを生成して応答する。
       自身のIDを設定しておき、
       親ノード、子ノードリストをそれぞれ初期化しておく。
    */
    public Node(int anId, String aName)
    {
	super();
	this.nodeId = anId;
	this.parent = null;
	this.children = new ArrayList<Node>();
    }
    
    /**
       インスタンスを生成して応答する。
       自身のIDを指定された番号に設定し、 
       親ノードに指定されたノードを設定し、
       子ノードリストを初期化しておく。
    */ 
    public Node(int anId, Node aParentNode)
    {
	super();
	this.nodeId = anId;
	this.parent = aParentNode;
	this.children = new ArrayList<Node>();
    }
    /**
       インスタンスを生成して応答する。
       自身のIDを指定された番号に設定し、
       親ノードと子ノードリストに指定されたノード及びリストを設定する。
    */
    public Node(int anId, Node aParentNode, ArrayList<Node> aChildrenList)
    {
	super();
	this.nodeId = anId;
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
       ノードIDを応答する
    */
    public int getNodeId()
    {
	return this.nodeId;
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

    /**
       引数のNodeと自身の一致性を応答する。
    */
    public boolean equals(Node aNode)
    {
	if(this.getNodeId() == aNode.getNodeId()){ return true; }
	
	else{ return false; }
    }
    /**
       引数のnodeIdと自身のnodeIdの一致性を応答する。
    */
    public boolean equals(int aNodeId)
    {
	if(this.getNodeId() == aNodeId){ return true; }
	else{ return false; }
    }
}
