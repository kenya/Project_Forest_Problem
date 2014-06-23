package forest;

import java.util.List;
import java.util.ArrayList;

public class Node extends Object
{
    /**
       このノードを一意に決定する番号。
    */
    private int nodeId;
    /**
       このノードの親ノード。
    */
    private Node parent;
    /**
       このノードの子ノードのリスト。
    */
    private List<Node> children;
    /**
      このノードが属する木。
    */
    //private Tree tree;
    /**
       このノードの名前。
    */ 
    private String name;

    /**
       インスタンスを生成して応答する。
       このノードのIDを設定しておき、
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
       このノードのIDを指定された番号に設定し、 
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
       このノードのIDを指定された番号に設定し、
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
       このノードの子ノードの数を応答する。
     */
    public int getNumberOfChildren()
    {
	return this.getChildren().size();
    }

    /**
       このノードのノード番号を応答する
    */
    public int getNodeId()
    {
	return this.nodeId;
    }
    /**
       このノードの親ノードを応答する。
    */
    public Node getParent()
    {
	return this.parent;
    }
    /**
       このノードの子ノードのリストを応答する。
    */
    public List<Node> getChildren()
    {
	return this.children;
    }

    /**
       引数のノードとこのノードの一致性を応答する。
    */
    public boolean equals(Node aNode)
    {
	if(this.getNodeId() == aNode.getNodeId()){ return true; }
	
	else{ return false; }
    }
    /**
       引数のノード番号とこのノードのノード番号の一致性を応答する。
    */
    public boolean equals(int aNodeId)
    {
	if(this.getNodeId() == aNodeId){ return true; }
	else{ return false; }
    }
}
