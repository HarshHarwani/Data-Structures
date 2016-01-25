package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DependencyProblem {
	public static void main(String[] args) {
		String[][] dependecies = { { "d", "a" }, { "f", "b" }, { "d", "b" }, { "f", "a" }, { "c", "d" }, { "f", "e" } };
		String[] projects = { "a", "b", "c", "d", "e", "f" };
		DependencyProblem problem = new DependencyProblem();
		problem.finalBuildOrder(projects, dependecies);
	}

	public void finalBuildOrder(String[] projects, String[][] dependecies) {
		DependencyGraph graph = buildgraph(projects, dependecies);
		Project[] buildOrder = getBuildOrder(graph.getNodes());
		if (buildOrder != null) {
			System.out.println("Build order is as follows");
			for (Project project : buildOrder) {
				System.out.print(project.getName() + ",");
			}
		} else {
			System.out.println("Build order not possible,circular dependency");
		}
	}

	private DependencyGraph buildgraph(String[] projects, String[][] dependecies) {
		// TODO Auto-generated method stub
		DependencyGraph graph = new DependencyGraph();
		for (String project : projects) {
			graph.getCreateProject(project);
		}
		for (String[] dependency : dependecies) {
			String f = dependency[0];
			String s = dependency[1];
			graph.addEdge(f, s);
		}
		return graph;
	}

	private Project[] getBuildOrder(ArrayList<Project> projects) {
		// TODO Auto-generated method stub
		Project[] order = new Project[projects.size()];
		int endOfList = addNonDependent(order, projects, 0);
		int pointer = 0;
		while (pointer < order.length) {
			Project current = order[pointer];
			if (current == null)
				return null;
			ArrayList<Project> children = current.getChildren();
			for (Project project : children) {
				project.decrementDependency();
			}
			endOfList = addNonDependent(order, children, endOfList);
			pointer++;
		}
		return order;
	}

	private int addNonDependent(Project[] order, ArrayList<Project> projects2, int i) {
		// TODO Auto-generated method stub
		for (Project project : projects2) {
			if (project.getDependecy() == 0) {
				order[i] = project;
				i++;
			}
		}
		return i;
	}

}

class DependencyGraph {
	ArrayList<Project> nodes = new ArrayList<Project>();
	Map<String, Project> map = new HashMap<String, Project>();

	public Project getCreateProject(String name) {
		if (!map.containsKey(name)) {
			Project project = new Project(name);
			nodes.add(project);
			map.put(name, project);
		}
		return map.get(name);
	}

	public void addEdge(String startName, String endName) {
		Project start = getCreateProject(startName);
		Project end = getCreateProject(endName);
		start.addNeighbor(end);
	}

	public ArrayList<Project> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Project> nodes) {
		this.nodes = nodes;
	}

	public Map<String, Project> getMap() {
		return map;
	}

	public void setMap(Map<String, Project> map) {
		this.map = map;
	}

}

class Project {
	ArrayList<Project> children = new ArrayList<Project>();
	Map<String, Project> map = new HashMap<String, Project>();
	private String name;
	private int dependecy = 0;

	public void addNeighbor(Project node) {
		if (!map.containsKey(node.name)) {
			this.children.add(node);
			node.incrementDependency();
		}
	}

	public void incrementDependency() {
		this.dependecy++;
	}

	public void decrementDependency() {
		this.dependecy--;
	}

	public ArrayList<Project> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Project> children) {
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDependecy() {
		return dependecy;
	}

	public void setDependecy(int dependecy) {
		this.dependecy = dependecy;
	}

	public Project(String name) {
		this.name = name;
	}

}