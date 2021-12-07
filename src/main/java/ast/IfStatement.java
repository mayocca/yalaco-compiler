package ast;

import java.util.HashMap;
import java.util.ArrayList;

public class IfStatement implements ASTNode {

    private ASTNode condition;
    private ArrayList<ASTNode> ifBlock;
    private ArrayList<ASTNode> elseBlock;

    public IfStatement(ASTNode condition, ArrayList<ASTNode> ifBlock, ArrayList<ASTNode> elseBlock) {
        super();
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }


    @Override
    public Object execute(HashMap<String, Object> tabla) {
        if (condition.execute(tabla) == Boolean.TRUE) {
            for (ASTNode n : ifBlock) {
                n.execute(tabla);
            }
        } else {
            for (ASTNode n : elseBlock) {
                n.execute(tabla);
            }
        }
        return null;
    }

}
