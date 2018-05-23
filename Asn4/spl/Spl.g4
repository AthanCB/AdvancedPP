grammar Spl;

init : PROGRAM PNAME mainprogram;


mainprogram : var_dec* BODY (s_body | r_body);

var_dec : VAR (id (COMMA id)* COLON type SEMICOLON*)+;

type : INT_TYPE | BOOL_TYPE | STRING_TYPE | array_type;
array_type : ARRAY array_bracks OF type;

s_body : statement;
r_body : BEGIN (((statement+| r_body) SEMICOLON)* (statement | r_body))? END;

statement : assign_statement | ifelse_statement | while_statement | read_statement | write_statement | EXIT;

assign_statement : id array_bracks? ASSIGN (id? comp_res? asn_numbers?| (TRUE | FALSE) | STRING);
ifelse_statement : if_st else_st?;

if_st :IF exp THEN (s_body | r_body);
elseif_st : (ELSE IF exp THEN (s_body | r_body))+;
else_st : ELSE (s_body | r_body);

read_statement : READ LFPAR (NOT|log_ops)? id (COMMA NOT? id)* RTPAR;
write_statement : WRITE LFPAR NOT? output ((log_ops|COMMA|comp_ops) NOT? output)* RTPAR; 

while_statement : WHILE exp DO (s_body | r_body);





output : (STRING | DIGIT | bool_ops | id | exp)+;

exp : term log_ops? comp_ops? term?;
term : bool_ops | comp_res | id;

comp_res : asn_numbers ((DIV | MOD | MINUS | AND | MULTIPLE | GREATER | LESS | GTEQ | LTEQ | NEQ) asn_numbers)?;


bool_ops: TRUE | FALSE;
log_ops : OR | AND;

asn_numbers : (PLUS | MINUS)?(DIGIT | id);


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

comp_ops : EQUALS | GREATER | LESS | NEQ | LTEQ | GTEQ | DIV | MOD | S_CONC;
LETTER : [a-zA-Z]+;
DIGIT : [0-9]+;

PNAME : LETTER+ DIGIT*;

STRING  : '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';
COMMENT : '{' .*? '}' -> skip ;
WS : [ \t\r\n]+ -> skip ; 