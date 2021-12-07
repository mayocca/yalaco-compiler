package ast;

import java.util.ArrayList;
import java.util.HashMap;

public class WhileStatement implements ASTNode {

    private ASTNode condition;
    private ArrayList<ASTNode> sentenceBlock;

    public WhileStatement(ASTNode condition, ArrayList<ASTNode> sentenceBlock) {
        super();
        this.condition = condition;
        this.sentenceBlock = sentenceBlock;
    }


    @Override
    public Object execute(HashMap<String, Object> tabla) {
        while (condition.execute(tabla) == Boolean.TRUE) {
            for (ASTNode n : sentenceBlock) {
                n.execute(tabla);
            }
        }
        return null;
    }

}
