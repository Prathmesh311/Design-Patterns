package com.coffeepoweredcrew.memento;

import java.util.LinkedList;

public class WorkflowDesigner {

    private Workflow workflow;

    public void createWorkflow(String name) {
        workflow = new Workflow(name);
    }

    public Workflow getWorkflow() {
        return this.workflow;
    }

    public Memento getMemento() {
    	if(workflow == null) {
    		return new Memento();
    	}
    	
    	return new Memento(workflow.getSteps(), workflow.getName());
    }

    public void setMemento(Memento memento) {
    	if(memento.isEmpty()) {
    		workflow = null;
    	}else {
    		workflow = new Workflow(memento.getName(), memento.getSteps());
    	}
    }

    public void addStep(String step) {
        workflow.addStep(step);
    }

    public void removeStep(String step) {
        workflow.removeStep(step);
    }

    public void print() {
        System.out.println(workflow);
    }
    
    

    public class Memento {
    	private String name;
    	private  String[] steps;
    	
    	private Memento() {
    		
    	}
    	
    	private Memento(String[] steps, String name) {
    		this.name = name;
    		this.steps = steps;
    	}

		private String getName() {
			return name;
		}


		private String[] getSteps() {
			return steps;
		}

    	private boolean isEmpty() {
    		if(steps.length == 0 && name == null) {
    			return true;
    		}
    		return false;
    	}
    	
    }
}
