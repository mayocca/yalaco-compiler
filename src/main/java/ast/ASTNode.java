package ast;

import java.util.HashMap;

public interface ASTNode {
    public Object execute(HashMap<String, Object> tabla);
}
