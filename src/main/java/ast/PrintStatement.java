package ast;

import ui.GUICompiler;

import java.util.HashMap;

public class PrintStatement implements ASTNode {

    private ASTNode data;

    public PrintStatement(ASTNode data) {
        super();
        this.data = data;
    }


    @Override
    public Object execute(HashMap<String, Object> tabla) {
        String msg = String.valueOf(data.execute(tabla));
        msg = msg.replaceAll("\"", "");
        GUICompiler.getInstance().appendOutput(msg);
        return null;
    }

}
