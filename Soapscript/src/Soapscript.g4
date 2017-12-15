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
      | if_stmt
      | for_stmt
      |
      ;

assignment_stmt   : assignment '=' expr ;
if_stmt           : 'if' '(' expr? ')' loop ('else' loop)?;
for_stmt          : 'for' '(' for_loop ')' loop ;

loop      : '{' stmt_list '}' ;
for_loop  : assignment_stmt? ';' expr? ';' expr? ';' ;

expr locals [ TypeSpec type = null ]
      :   number							#numberExpr	
      |   variable							#variableExpr				
      |   expr ('<' '=' | '>' '=' | '>' | '<') expr		#compExpr
      |   expr ('==' | '!=') expr			#eqvExpr
      |   expr ('++' | '--')				#incrExpr
      |   expr '.' ID						#dotExpr
      |   ('+'|'-') expr					#addSubExpr
      |   ('~'|'!') expr					#notExpr
      |   expr ('*'|'/'|'%') expr			#mulDivExpr
      |   expr ('+'|'-') expr				#expras
      |   '(' expr ')'						#paranExpr
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

ID      : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER : [0-9]+ ;
FLOAT   : [0-9]+ '.' [0-9]+ ;

NEWLINE : '\r'? '\n' -> skip ;
WS      : [ \t]+ -> skip ;

COMMENT       : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT  : '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN) ;
