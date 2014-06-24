package forest;

import java.util.List;
import java.util.ArrayList;

/**
 *樹状グラフにおける1つのノードを表すクラス。
 *@author KazuyaYoshioka
 */
public class Node extends Object
{
    /**
     *このノードを一意に決定する番号。
    */
    private int nodeId;
    /**
     *このノードの親ノード。
    */
    private Node parent;
    /**
     *このノードの子ノードのリスト。
    */
    private List<Node> children;
    /**
     *このノードが属する木。
    */
    private Tree tree;
    /**
     *このノードの名前。
    */ 
    private String label;

    /**
     *インスタンスを生成して応答する。
     *このノードのノード番号に指定された整数を、ラベルに指定された文字列を設定し、 
     *親ノード、子ノードリストをそれぞれ初期化しておく。
     *@param anId ノード番号
     *@param aLabel ラベル内容
    */
    public Node(int anId, String aLabel)
    {
	super();
	this.nodeId = anId;
	this.label = aLabel;
	this.parent = null;
	this.children = new ArrayList<Node>();
    }
    
    /**
     *インスタンスを生成して応答する。
     *このノードのノード番号に指定された整数を、ラベルに指定された文字列を、 
     *親ノードに指定されたノードを設定し、
     *子ノードリストを初期化しておく。
     *@param anId ノード番号
     *@param aLabel ラベル内容
     *@param aParentNode 親ノード
     */
    public Node(int anId, String aLabel, Node aParentNode)
    {
	super();
	this.nodeId = anId;
	this.label = aLabel;
	this.parent = aParentNode;
	this.children = new ArrayList<Node>();
    }
    /**
     *インスタンスを生成して応答する。
     *このノードのノード番号に指定された整数を、ラベルに指定された文字列を、 
     *親ノードと子ノードリストに指定されたノード及びリストを設定する。
     *@param anId ノード番号
     *@param aLabel ラベル内容
     *@param aParentNode 親ノード
     *@param aChildrenList 子ノードリスト
     */
    public Node(int anId, String aLabel, Node aParentNode, ArrayList<Node> aChildrenList)
    {
	super();
	this.nodeId = anId;
	this.label = aLabel;
	this.parent = aParentNode;
	this.children = aChildrenList;
    }

    /**
     *子ノードリストに子供を追加する。
     *@param aChildNode 追加する子ノード 
    */
    public void addChild(Node aChildNode)
    {
	List<Node> aChildrenList = this.getChildren();
	aChildrenList.add(aChildNode);
	return;
    }
    /**
     *このノードの子ノードの数を応答する。
     *@return 子ノードの数
     */
    public int getNumberOfChildren()
    {
	return this.getChildren().size();
    }

    /**
     *このノードのノード番号を応答する。
     *@return ノード番号
     */
    public int getNodeId()
    {
	return this.nodeId;
    }
    /**
     *このノードの親ノードを応答する。
     *@return 親ノード 
    */
    public Node getParent()
    {
	return this.parent;
    }
    /**
     *このノードの子ノードのリストを応答する。
     *@return 子ノードのリスト 
    */
    public List<Node> getChildren()
    {
	return this.children;
    }

    /**
     *引数のノードとこのノードの一致性を応答する。
     *@param aNode 比較対象となるノード
     *@return 一致した場合はtrue、それ以外はfalse
    */
    public boolean equals(Node aNode)
    {
	if(this.getNodeId() == aNode.getNodeId()){ return true; }
	
	else{ return false; }
    }
    /**
     *引数のノード番号とこのノードのノード番号の一致性を応答する。
     *@param aNodeId 比較対象となるノード番号
     *@return 一致した場合はtrue、それ以外はfalse 
    */
    public boolean equals(int aNodeId)
    {
	if(this.getNodeId() == aNodeId){ return true; }
	else{ return false; }
    }
}
