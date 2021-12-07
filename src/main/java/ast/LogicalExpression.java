package ast;

import java.util.HashMap;

public class LogicalExpression implements ASTNode {

    private ASTNode op1;
    private ASTNode op2;
    public String op;

    public LogicalExpression(String op, ASTNode op1, ASTNode op2) {
        super();
        this.op1 = op1;
        this.op2 = op2;
        this.op = op;
    }


    @Override
    public Object execute(HashMap<String, Object> tabla) {

        if (op2 == null)
            return !(Boolean) op1.execute(tabla);

        switch (op) {
            case "&&":
                return (Boolean) op1.execute(tabla) && (Boolean) op2.execute(tabla);
            case "||":
                return (Boolean) op1.execute(tabla) || (Boolean) op2.execute(tabla);
        }
        return null;
    }
}
