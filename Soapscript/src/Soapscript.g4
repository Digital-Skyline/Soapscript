grammar Soapscript; // Subset of Javascript w/ some minor mods for ease of use!

@header {
    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;
}

program : header block ;
header  : 'PROGRAM' ID ';' ;
block   : stmt_list 'end';

stmt_list : stmt ( ';' stmt )* ;

stmt  : expr
      | assignment_stmt
 //     | print_stmt
      | if_stmt
      | for_stmt
      |
      ;

assignment_stmt   : assignment '=' expr ;
//print_stmt : 'print' '(' ID ')' #printStmt;
if_stmt           : 'if' '(' expr? ')' loop ('else' loop)?;
for_stmt          : 'for' '(' for_loop ')' loop ;

loop      : '{' stmt_list '}' ;
for_loop  : assignment_stmt? ';' expr? ';' expr? ';' ;

expr locals [ TypeSpec type = null ]
      :   number							#numberExpr	
      |   variable							#variableExpr				
      |   expr conditionalOp expr			#condExpr
      |   expr ('++' | '--')				#incrExpr
      |   expr '.' ID						#dotExpr
      |   ('+'|'-') expr					#posNegExpr
      |   notOp expr						#notExpr
      |   expr mulDivModOp expr				#mulDivExpr
      |   expr addSubOp expr				#addSubExpr
      |   '(' expr ')'						#parenExpr
      ;

number locals [ TypeSpec type = null ]
        : INTEGER 	#integerConst
        | FLOAT		#floatConst
        ;

assignment  : 'var' type_id ID
            | variable
            ;
variable    : ID ;
type_id     : ID ;
conditionalOp : LEOP | GEOP | GTOP | LTOP | ETOP | NEOP;
addSubOp : ADDOP | SUBOP;
mulDivModOp : MULOP | DIVOP | MODOP;
notOp : NOTOP | TNOTOP;

ID      : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER : [0-9]+ ;
FLOAT   : [0-9]+ '.' [0-9]+ ;

ADDOP : '+';
SUBOP : '-';
MULOP : '*';
DIVOP : '/';
MODOP : '%';
LEOP : '<=';
GEOP : '>=';
GTOP : '>';
LTOP : '<'; 
NEOP : '!=';
ETOP : '==';
NOTOP : '!';
TNOTOP : '~';
//PRINT : 'print';

NEWLINE : '\r'? '\n' -> skip ;
WS      : [ \t]+ -> skip ;

COMMENT       : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT  : '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN) ;
