grammar MonitoringDSL;

root        :   (monitor_rule)*
            ;

monitor_rule:   GIVEN resource conditions actions
            ;

conditions  :   WHEN condition (OR condition)*
            ;

condition   :   metric IS relational_operator threshold
            ;

metric      :   metric_name OF RESOURCES target
            |   ITS metric_name
            ;

threshold   :   value
            ;

actions     :   THEN action (COMMA action)*;

action      :   executor;

executor    :   ID LPAREN params RPAREN
            ;

params      : value (COMMA value)*
            ;
                 
relational_operator :   EQ
                    |   GT
                    |   LT
                    |   NEQ;

value   : ID
        | STRING
        | INT;

resource    : RESOURCE ID;

metric_name : ID;

target      : ID;


GIVEN       :   'Given';
WHEN        :   'When';
OR          :   'or';
RESOURCE    :   'resource';
OF          :   'of';
RESOURCES   :   'resource\'s';
IS          :   'is';
THEN        :   'Then';
ITS         :   'its';
COMMA       :   ',';
LPAREN      :   '(';
RPAREN      :   ')';
EQ          :   'equals to';
GT          :   'greater than';
LT          :   'less than';
NEQ         :   'not equal to'
            |   'different than';

ID  :	[a-zA-Z_] [a-zA-Z_0-9]*;
STRING  :   '"' ( ESC_SEQ | ~('\\'|'"') )* '"';
INT :   [0-9]+;
WS  :   [ \t\r\n]+ -> skip;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;