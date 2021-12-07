package ast;

import java.util.HashMap;

public class TruncExpression implements ASTNode {

    private ASTNode op;

    public TruncExpression(ASTNode op) {
        super();
        this.op = op;
    }


    @Override
    public Object execute(HashMap<String, Object> tabla) {
        return (double) ((Double) op.execute(tabla)).intValue();
    }
}
