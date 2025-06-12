package br.unitins;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.LinearConstraint;
import org.apache.commons.math3.optim.linear.LinearConstraintSet;
import org.apache.commons.math3.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optim.linear.NonNegativeConstraint;
import org.apache.commons.math3.optim.linear.Relationship;
import org.apache.commons.math3.optim.linear.SimplexSolver;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;

public class AlocacaoAmbulancias {

    public static void main(String[] args) {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 12, 15}, 0);

        // Restrições
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1, 1}, Relationship.EQ, 20));
        constraints.add(new LinearConstraint(new double[]{1, 0, 0}, Relationship.GEQ, 12)); // < = Restrição de Palmas
        constraints.add(new LinearConstraint(new double[]{0, 1, 0}, Relationship.GEQ, 6)); // < = Restrição de Araguaína
        constraints.add(new LinearConstraint(new double[]{0, 0, 1}, Relationship.GEQ, 2)); // < = Restrição de Porto Nacional

        // Solver
        try {
            SimplexSolver solver = new SimplexSolver();
            PointValuePair solution = solver.optimize(new LinearConstraintSet(constraints), f, GoalType.MINIMIZE, new NonNegativeConstraint(true));

            // Resultado
            double[] variables = solution.getPoint();
            System.out.printf("x1 (Palmas): %.2f\nx2 (Araguaína): %.2f\nx3 (Porto Nacional): %.2f\n", variables[0], variables[1], variables[2]);
            System.out.println("Tempo médio total mínimo: " + solution.getValue() + " min");
        } catch (Exception e) {
            System.out.println("Erro: Não foi possível encontrar uma solução viável. Verifique as restrições.");
            e.printStackTrace();
        }
    }
}
