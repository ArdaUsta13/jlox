package com.craftinginterpreters.lox;

class Token {
  final TokenType type;
  final String lexeme;
  final Object literal;
  final int line;

  // TOKEN'S CONSTRUCTOR
  Token(TokenType type, String lexeme, Object literal, int line) {
    this.type = type;
    this.lexeme = lexeme;
    this.literal = literal;
    this.line = line;
  }

  // GUESS WE GONNA USE @OVERRİDE HERE SOON ?
  public String toString() {
    return type + " " + lexeme + " " + literal;
  }
}