package ast;

import ui.GUICompiler;

import java.util.HashMap;

public class PrintLineStatement implements ASTNode {

    private ASTNode data;

    public PrintLineStatement(ASTNode data) {
        super();
        this.data = data;
    }


    @Override
    public Object execute(HashMap<String, Object> tabla) {
        String msg = String.valueOf(data.execute(tabla));
        msg = msg.replaceAll("\"", "");
        GUICompiler.getInstance().appendOutput(msg + "\n");
        return null;
    }

}
