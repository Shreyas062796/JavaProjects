import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
// import java.util.LinkedList;
import java.util.Map;

public class Graph{
    Map<Integer,ArrayList<Integer>> adj_list = new HashMap<Integer,ArrayList<Integer>>();
    public Graph(){
    }
    public void add(int node, int val){
        if(adj_list == null || !adj_list.containsKey(node)){
            adj_list.put(node,new ArrayList<Integer>());
        }
        if(!adj_list.containsKey(val)){
            adj_list.put(val,new ArrayList<Integer>());
        }
        adj_list.get(node).add(val);
    }

    public Map<Integer,ArrayList<Integer>> getGraph(){
        return adj_list;
    }

    public void dfsrecursive(int start, int tgt){
        ArrayList<Integer> visited = new ArrayList<Integer>();
        for(Map.Entry<Integer,ArrayList<Integer>> entry: adj_list.entrySet()){
            visited.add(entry.getKey());
         }
         String found = dfsrechelper(start,visited,tgt);
         System.out.println(found);
    }

    public String dfsrechelper(int val,ArrayList<Integer> visited,int tgt){
        System.out.println(visited);
        visited.set(visited.indexOf(val),-1);
        System.out.println(val + " " + tgt);
        for(int i = 0; i < adj_list.get(val).size();i++){
            if(Integer.compare(val, tgt) == 0){
                return tgt + " was found";
            }
            else if(visited.contains(adj_list.get(val).get(i))){
                return dfsrechelper(adj_list.get(val).get(i), visited, tgt);
            }
        }
        return tgt + " doesn't exist in graph";
    }

    public void dfsiterative(int start, int tgt){
        ArrayList<Integer> visited = new ArrayList<Integer>();
        for(Map.Entry<Integer,ArrayList<Integer>> entry: adj_list.entrySet()){
            visited.add(entry.getKey());
         }
         String found = dfsrechelper(start,visited,tgt);
         System.out.println(found);
    }


    public static void main(String[] args){
        Graph graph = new Graph();
        graph.add(2,4);
        graph.add(1,2);
        graph.add(1,4);
        graph.add(4,1);
        graph.add(4,9);
        graph.add(2,3);
        graph.add(3,2);
        graph.add(9,1);
        graph.add(9,3);


        System.out.println(graph.getGraph());
        graph.dfsrecursive(1,3);

    }
}