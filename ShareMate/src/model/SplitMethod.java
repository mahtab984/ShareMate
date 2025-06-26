/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



// SplitMethod.java
public class SplitMethod {
    private int methodId;
    private String type;
    private String parameters;

    public SplitMethod() { }

    public SplitMethod(int methodId, String type, String parameters) {
        this.methodId   = methodId;
        this.type       = type;
        this.parameters = parameters;
    }

    // Getters & setters
    public int getMethodId() { return methodId; }
    public void setMethodId(int methodId) { this.methodId = methodId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getParameters() { return parameters; }
    public void setParameters(String parameters) { this.parameters = parameters; }

    @Override
    public String toString() {
        return "SplitMethod{" +
               "methodId=" + methodId +
               ", type='" + type + '\'' +
               ", parameters='" + parameters + '\'' +
               '}';
    }
}
