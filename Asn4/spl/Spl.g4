grammar Spl;

init : PROGRAM PNAME mainprogram;


mainprogram : var_dec* BODY (s_body | r_body);

var_dec : VAR (id (COMMA id)* COLON type SEMICOLON*)+;


assign_statement : id array_bracks? ASSIGN (id? asn_numbers| (TRUE | FALSE) | STRING)  SEMICOLON?; //να μπορεί να έχει και μόνο id 

statement : assign_statement | ifelse_statement | while_statement | read_statement | write_statement;

read_statement : READ LFPAR id (COMMA id)* RTPAR SEMICOLON;
write_statement : WRITE LFPAR output (COMMA output)* RTPAR SEMICOLON;
output : (STRING | DIGIT | log_ops | id)+;
ifelse_statement : if_st+ else_st?;

while_statement : WHILE exp DO (s_body | r_body);

if_st :IF exp THEN (s_body | r_body);
else_st : ELSE (s_body | r_body);

exp : term comp_ops? term?;
term : log_ops | comp_res | id;
comp_res : asn_numbers ((DIV | MOD | MINUS | AND | MULTIPLE) asn_numbers)?;
s_body : statement;
r_body : BEGIN statement+ END;

log_ops: (TRUE | FALSE);

asn_numbers : (PLUS | MINUS)?(DIGIT | id);
type : INT_TYPE | BOOL_TYPE | STRING_TYPE | array_type;
array_type : ARRAY array_bracks OF type;

array_bracks: LBRA (id |DIGIT)+ RBRA;
id : UNDERSCORE* LETTER (LETTER | DIGIT | UNDERSCORE)*;


PROGRAM : 'PROGRAM';
INT_TYPE : 'INTEGER';
BOOL_TYPE : 'BOOLEAN';
STRING_TYPE : 'STRING';
ARRAY : 'ARRAY';
OF : 'OF';
READ : 'READ';
WRITE : 'WRITE';
IF : 'IF';
THEN : 'THEN';
ELSE : 'ELSE';
ELSE_IF : 'ELSE IF';
WHILE : 'WHILE';
DO : 'DO';
EXIT : 'EXIT';
VAR : 'VAR';
BODY : 'BODY';
BEGIN : 'BEGIN';
END : 'END';
AND : 'AND';
OR : 'OR';
NOT : 'NOT';
TRUE : 'TRUE';
FALSE : 'FALSE';

PLUS : '+';
MINUS:'-';
MULTIPLE : '*';
DIV : '/';
MOD : '%';
EQUALS : '=';
GREATER : '>';
LESS : '<';
LFPAR : '(';
RTPAR : ')';
COMMA:',';
COLON:':';
LBRA:'[';
RBRA:']';
S_CONC:'|';
UNDERSCORE : '_';
SEMICOLON:';';
ASSIGN:':=';
GTEQ:'>=';
LTEQ:'<=';
NEQ:'<>';

comp_ops : EQUALS | GREATER | LESS | NEQ | LTEQ | GTEQ | DIV | MOD;
LETTER : [a-zA-Z]+;
DIGIT : [0-9]+;

PNAME : LETTER+ DIGIT*;

STRING  : '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';
COMMENT : '{' .*? '}' -> skip ;
WS : [ \t\r\n]+ -> skip ; 