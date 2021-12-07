grammar Yalaco;

@parser::header {
	import java.util.HashMap;
    import java.util.ArrayList;
    import ast.*;
}

@parser::members {
	HashMap<String, Object> tabla;
}

//start [HashMap<String, Object> tabla]
//    : { this.tabla = tabla; } statement*
//    ;

start
    : statement*
    ;

statement returns [ASTNode node]
    : expression { $node = $expression.node; }
    | assignStatement { $node = $assignStatement.node; }
    | ifStatement { $node = $ifStatement.node; }
    | whileStatement { $node = $whileStatement.node; }
    | printStatement { $node = $printStatement.node; }
    | printLineStatement { $node = $printLineStatement.node; }
    ;

assignStatement returns [ASTNode node]
    : ID ASSIGN expression EOL { $node = new AssignStatement($ID.text, $expression.node); }
    ;

ifStatement returns [ASTNode node]
@init{
    ArrayList<ASTNode> ifBlock = new ArrayList<ASTNode>();
	ArrayList<ASTNode> elseBlock = new ArrayList<ASTNode>(); }
    : IF PAR_OPEN expression PAR_CLOSE BRK_OPEN ( s1 = statement { ifBlock.add($s1.node); })+ BRK_CLOSE
	( ELSE BRK_OPEN (s2 = statement { elseBlock.add($s2.node); })+ BRK_CLOSE )?
	{ $node = new IfStatement($expression.node, ifBlock, elseBlock); }
    ;

whileStatement returns [ASTNode node]
@init{ ArrayList<ASTNode> statementBlock = new ArrayList<ASTNode>(); }
	: WHILE PAR_OPEN expression PAR_CLOSE BRK_OPEN (s = statement { statementBlock.add($s.node);})+ BRK_CLOSE
	{ $node = new WhileStatement($expression.node, statementBlock); }
	;

printStatement returns [ASTNode node]
    : PRINT PAR_OPEN expression PAR_CLOSE EOL { $node = new PrintStatement($expression.node); }
    ;

printLineStatement returns [ASTNode node]
    : PRINTLN PAR_OPEN expression PAR_CLOSE EOL { $node = new PrintLineStatement($expression.node); }
    ;

expression returns [ASTNode node]
    : op = NOT expression {
 		$node = new LogicalExpression($op.text, $expression.node, null);
 	}
 	| e1 = expression {$node = $e1.node;}  op = ( MUL | DIV ) e2 = expression {
 		$node = new ArithmeticExpression($op.text, $node, $e2.node);
 	}
 	| e1= expression {$node = $e1.node;}  op = ( SUM | SUB ) e2 = expression {
 		$node = new ArithmeticExpression($op.text, $node, $e2.node);
 	}
 	| e1 = expression {$node = $e1.node;}  op = ( GRE | LES | GEQ | LEQ ) e2 = expression {
 		$node = new ComparativeExpression($op.text, $node, $e2.node);
 	}
 	| e1 = expression {$node = $e1.node;}  op = ( EQU | NEQ ) e2 = expression {
        $node = new ComparativeExpression($op.text, $node, $e2.node);
    }
 	| e1 = expression {$node = $e1.node;} op = AND e2 = expression{
 		$node = new LogicalExpression($op.text, $node, $e2.node);
 	}
 	| e1 = expression {$node = $e1.node;} op = OR e2 = expression{
 		$node = new LogicalExpression($op.text, $node, $e2.node);
 	}
 	| truncExpression {$node = $truncExpression.node; }
 	| data {$node = $data.node; }
 	;

truncExpression returns [ASTNode node]
    : TRUNC PAR_OPEN expression PAR_CLOSE { $node = new TruncExpression($expression.node); }
    ;

data returns [ASTNode node]
    : PAR_OPEN expression {$node = $expression.node; } PAR_CLOSE
    | LOGIC  { $node = new Constant(Boolean.parseBoolean($LOGIC.text)); }
 	| NUMBER { $node = new Constant(Double.parseDouble($NUMBER.text)); }
 	| ID     { $node = new VariableExpression(String.valueOf($ID.text)); }
 	| STRING { $node = new Constant(String.format("\"%s\"", $STRING.text)); }
 	;

IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
FOR : 'for' ;

STRING : ["] ([a-zA-Z0-9]|[ ]|[-_])* ["];
LOGIC: 'true' | 'false';
PRINT : 'print' ;
PRINTLN : 'printline' ;
TRUNC : 'trunc' ;
ASSIGN : '=' ;
EOL : ';' ;
ID: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: '-'?[0-9]+([.][0-9]+)? ;

SUM : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
EXP : '^' ;
MOD : '%' ;
GRE : '>' ;
LES : '<' ;
GEQ : '>=' ;
LEQ : '<=' ;
NEQ : '!=' ;
EQU : '==' ;
AND : '&&' ;
OR  : '||' ;
NOT : '!' ;
PAR_OPEN : '(' ;
PAR_CLOSE : ')' ;
BRK_OPEN : '{' ;
BRK_CLOSE : '}' ;

INC : '++' ;
DEC : '--' ;


// Ignorar lo siguiente

WS : [ \t]+ -> skip;
NL : ( '\r' '\n'? | '\n') -> skip;
BC : '/*' .*? '*/'-> skip;
LC : '//' ~[\r\n]* -> skip;