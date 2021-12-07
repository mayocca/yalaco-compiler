package ast;

import java.util.HashMap;

public class ComparativeExpression implements ASTNode {

    private ASTNode op1;
    private ASTNode op2;
    public String op;

    public ComparativeExpression(String op, ASTNode op1, ASTNode op2) {
        super();
        this.op1 = op1;
        this.op2 = op2;
        this.op = op;
    }


    @Override
    public Object execute(HashMap<String, Object> tabla) {

        switch (op) {
            case "==":
                return (op1.execute(tabla)).equals(op2.execute(tabla));
            case "!=":
                return !(op1.execute(tabla)).equals(op2.execute(tabla));
            case ">":
                return (Double) op1.execute(tabla) > (Double) op2.execute(tabla);
            case "<":
                return (Double) op1.execute(tabla) < (Double) op2.execute(tabla);
            case ">=":
                return (Double) op1.execute(tabla) >= (Double) op2.execute(tabla);
            case "<=":
                return (Double) op1.execute(tabla) <= (Double) op2.execute(tabla);
        }
        return null;
    }
}
