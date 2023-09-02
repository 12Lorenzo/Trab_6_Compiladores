grammar dragonCards;

PalavrasChave:
    'nome' | 'tipo' | 'nivel' | 'poder' | 'lutar' | 'proxima' | 'desistir'
    'dragao equipe' | 'fim equipe' | 'dragao chefe' | 'fim chefe';

// Separação entre itens e classes
VIRGULA: ',';
DOISPONTOS: ':';

Abre: 
    '(';

Fecha: 
    ')';

Tipo: ('classico' | 'oriental' | 'wyvern' | 'drake' | 'lindwrum' | 'amphiptere');

Nome : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z' | ' ')*;


// Números inteiros indicam valores de nível e poder
Poder : ('0'..'9')+;

fragment
ESC_SEQ	: '\\\'';
COMENTARIO : '{' ~('\n'|'\r'|'}')* '}' {skip();};
WS : ( ' ' | '\t' | '\r' | '\n') {skip();};


// Verificação de erros
ERRO: .;

// Inicio do programa
programa: corpo <EOF>;

corpo: declaracao_equipe+ declaracao_chefe acao+;

declaracao_equipe:
    'dragao equipe'
        'nome' ':' Nome ','
        'tipo' ':' Tipo ','
        'poder' ':' Poder ','
    'fim equipe';

declaracao_chefe:
    'dragao chefe'
        'nome' ':' Nome ','
        'tipo' ':' Tipo ','
        'poder' ':' Poder ','
    'fim chefe';

acao:
    cmdLutar | cmdDesistir | cmdProxima;
    
cmdLutar:
    'Lutar' '(' Nome ')';

cmdProxima:
    'Proxima' '(' Nome ')'; 
    
cmdDesistir:
    'Desistir';


