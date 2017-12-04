grammar Soapscript; // Subset of Javascript

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

expr  :   number
      |   variable
      |   expr ('<' '=' | '>' '=' | '>' | '<') expr
      |   expr ('==' | '!=') expr
      |   expr ('++' | '--')
      |   expr '.' ID
      |   expr '[' expr ']'
      |   ('+'|'-') expr
      |   ('~'|'!') expr
      |   expr ('*'|'/'|'%') expr
      |   expr ('+'|'-') expr
      |   '(' expr ')'
      ;

number  : INTEGER
        | FLOAT
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
