grammar Soapscript; // Subset of Javascript

program : header block ;
header  : 'PROGRAM' ID ';' ;
block   : stmt_list* 'end';

stmt_list : stmt ( ';' stmt )* ;

stmt :  if_stmt
     |  for_stmt
     |  while_stmt
     |  bubble_stmt
     |  clean_stmt
     |  assignment_stmt
     |  expr
     |
     ;

assignment_stmt   : assignment '=' expr ;
if_stmt           : IF expr stmt ( ELSE stmt ) ;
for_stmt          : FOR for_loop loop ;
while_stmt        : WHILE expr stmt ;
bubble_stmt       : BUBBLE expr ;
clean_stmt        : CLEAN  expr ;
stmt_expr         : expr ;

loop      : '{' stmt_list '}' ;
for_loop  : '(' assignment_stmt ';' conditional ';' increment ';' ')' ;


expr  :   number
      |   variable
      |   conditional
      |   increment
      |   expr '.' ID
      |   expr '[' expr ']'
      |   ('+'|'-') expr
      |   ('~'|'!') expr
      |   expr ('*'|'/'|'%') expr
      |   expr ('+'|'-') expr
      |   '(' expr ')'
      ;

conditional : expr ('<' '=' | '>' '=' | '>' | '<') expr
            | expr ('==' | '!=') expr
            ;

increment   : expr ('++' | '--')
            | ('++'|'--') expr
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

IF      : 'if' ;
ELSE    : 'else';
FOR     : 'for';
WHILE   : 'while';
BUBBLE  : 'bubble';
CLEAN   : 'clean';
VAR     : 'var';

NEWLINE : '\r'? '\n' -> skip ;
WS      : [ \t]+ -> skip ;

COMMENT       : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT  : '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN) ;
