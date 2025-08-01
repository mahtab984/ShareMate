/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



// SplitMethod.java
public class SplitMethod {
    private int methodId;
    private String type;
    private String parameters;

     /**
     * Default constructor.
     */
    public SplitMethod() { }

    /**
     * Creates a new SplitMethod instance with the given parameters.
     *
     * @param methodId   Unique identifier for the split method.
     * @param type       The type of split ("equal" or "percentage").
     * @param parameters Optional additional parameters (can be null).
     */
    public SplitMethod(int methodId, String type, String parameters) {
        this.methodId   = methodId;
        this.type       = type;
        this.parameters = parameters;
    }

    /** @return The method ID. */
    public int getMethodId() { return methodId; }

    /** @param methodId The method ID to set. */
    public void setMethodId(int methodId) { this.methodId = methodId; }

    /** @return The type of split method ("equal" or "percentage"). */
    public String getType() { return type; }

    /** @param type The type of split method to set ("equal" or "percentage"). */
    public void setType(String type) { this.type = type; }

    /** @return Additional parameters for this split method. */
    public String getParameters() { return parameters; }

    /** @param parameters The parameters to set. */
    public void setParameters(String parameters) { this.parameters = parameters; }

    /**
     * Calculates how much each user should pay based on the split method type.
     *
     * @param totalAmount   The total expense amount to split.
     * @param users         List of usernames involved in the expense.
     * @param percentageMap If {@code type} is "percentage", a map of username -> percentage (0–100).
     *                      If {@code type} is "equal", this parameter can be {@code null}.
     * @return A map of username -> amount owed.
     * @throws IllegalArgumentException If the split type is invalid or percentage values do not sum to 100.
     */
    public Map<String, Double> calculateSplit(
            double totalAmount,
            List<String> users,
            Map<String, Double> percentageMap) {

        Map<String, Double> result = new HashMap<>();

        if ("equal".equalsIgnoreCase(type)) {
            // Split equally among all users
            double share = totalAmount / users.size();
            for (String user : users) {
                result.put(user, roundToTwo(share));
            }

        } else if ("percentage".equalsIgnoreCase(type)) {
            // Validate percentage total
            double totalPercent = percentageMap.values().stream().mapToDouble(Double::doubleValue).sum();
            if (Math.abs(totalPercent - 100.0) > 0.01) {
                throw new IllegalArgumentException("Percentages must total 100%");
            }

            // Calculate based on percentages
            for (String user : users) {
                double percent = percentageMap.getOrDefault(user, 0.0);
                double share = totalAmount * (percent / 100.0);
                result.put(user, roundToTwo(share));
            }

        } else {
            throw new IllegalArgumentException("Unknown split type: " + type);
        }

        return result;
    }

    /**
     * Rounds a number to two decimal places.
     *
     * @param value The number to round.
     * @return The rounded value.
     */
    private double roundToTwo(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "SplitMethod{" +
               "methodId=" + methodId +
               ", type='" + type + '\'' +
               ", parameters='" + parameters + '\'' +
               '}';
    }
}