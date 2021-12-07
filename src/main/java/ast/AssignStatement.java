package ast;

import java.util.HashMap;

public class AssignStatement implements ASTNode {

    private String name;
    private ASTNode expression;

    public AssignStatement(String name, ASTNode expresion) {
        super();
        this.name = name;
        this.expression = expresion;
    }

    @Override
    public Object execute(HashMap<String, Object> tabla) {
        tabla.put(name, expression.execute(tabla));
        return null;
    }

}