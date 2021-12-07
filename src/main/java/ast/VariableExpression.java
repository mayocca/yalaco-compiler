package ast;

import java.util.HashMap;

public class VariableExpression implements ASTNode {

    private String name;

    public VariableExpression(String name) {
        super();
        this.name = name;
    }

    @Override
    public Object execute(HashMap<String, Object> tabla) {
        Object obj = tabla.get(name);
        if (obj instanceof Constant)
            return ((Constant) tabla.get(name)).execute(tabla);
        else if (obj == null)
            return 0;
        return obj;
    }

}
