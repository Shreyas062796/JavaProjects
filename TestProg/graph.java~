import java.util.*;
import java.lang.*;
import java.io.*;

public class graph{
    HashMap<Integer,ArrayList<Integer>> graph;
    public graph(){
	this.graph = null;
    }
    public graph(HashMap<Integer,ArrayList<Integer>> graph){
	this.graph = graph;
    }
    public void addNode(int key, int value){
	ArrayList<Integer> tmp = new ArrayList<Integer>();
	if(graph.containsKey(key)){
	    tmp = graph.get(key);
	    tmp.add(value);
	    graph.put(key,tmp);
	}
	else{
	    tmp.add(value);
	    graph.put(key,tmp);
	}
    }
    public void deleteNode(int key){
	if(graph.containsKey(key)){
	    graph.remove(key)
	}
    }
    
    public ArrayList DFS(int Targ){
	
    }
}