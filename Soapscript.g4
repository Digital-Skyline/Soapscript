//Subset of Javascript called Soapscript 

//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Lexical_grammar

grammar Soapscript;

// Regular expressions that define your language tokens.

ID  :   [a-zA-Z][a-zA-Z0-9]* ;      	// match identifiers <label id="code.tour.expr.3"/>
INT :   [0-9]+ ;         	// match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; 	// toss out whitespace

// Expressions with numeric constants and scalar variables. No type checking, no arrays or records yet.



statementExpression :   expression;

expression
    :   primary
    |   expression '.' Identifier
    // |   expression '.' 'this'
    |   expression '.' 'new' Identifier '(' expressionList? ')'
    // |   expression '.' 'super' '.' Identifier arguments?
    // |   expression '.' explicitGenericInvocation
    |   expression '[' expression ']'
    |   expression '(' expressionList? ')'
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   ('~'|'!') expression
    |   '(' type ')' expression
    |   'new' creator
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<' '=' | '>' '=' | '>' | '<') expression
    |   expression 'instanceof' type
    |   expression ('==' | '!=') expression
    |   expression '&' expression
    |   expression '^' expression
    |   expression '|' expression
    |   expression '?' expression ':' expression
    |   expression
        ('^='<assoc=right>
        |'+='<assoc=right>
        |'-='<assoc=right>
        |'*='<assoc=right>
        |'/='<assoc=right>
        |'&='<assoc=right>
        |'|='<assoc=right>
        |'='<assoc=right>
        |'>' '>' '='<assoc=right>
        |'>' '>' '>' '='<assoc=right>
        |'<' '<' '='<assoc=right>
        |'%='<assoc=right>
        )
        expression
    ;


// Assignment statements.







//Comments or White Spaces
COMMENT:   '/*' .*? '*/'    -> channel(HIDDEN) // match anything between /* and */ ;
WS  :   [ \r\t\u000C\n]+ -> channel(HIDDEN) ; //white spaces
LINE_COMMENT : '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN) ; //everything after // in same line







// Control statements.



// Variable declarations (no type definitions yet).
declarations : VAR decl_list ';' ;
decl_list    : decl ( ';' decl )* ;
decl         : var_list ':' type_id ;
var_list     : var_id ( ',' var_id )* ;
var_id       : IDENTIFIER ;
type_id      : IDENTIFIER ;


