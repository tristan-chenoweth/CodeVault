package Java.J2ASMTranslator;

// Built with help from AI

import java.util.*;
import java.io.*;

public class J2ASMTranslator {

    public static void main(String[] args) {
        String javaCode = """
            public class Example {
                public static void main(String[] args) {
                    int x = 5;
                    int y = 10;
                    int z = x + y;
                }
            }
            """;
    
        System.out.println("Input Java code:");
        System.out.println(javaCode);
        System.out.println("\nStarting translation...");
    
        J2ASMTranslator translator = new J2ASMTranslator();
        String assembly = translator.translate(javaCode);
        
        System.out.println("\nGenerated Assembly:");
        System.out.println(assembly);
    }

    private JavaParser parser;
    private AssemblyGenerator generator;
    private Optimizer optimizer;
    private SymbolTable symbolTable;

    public J2ASMTranslator() {
        this.parser = new JavaParser();
        this.generator = new AssemblyGenerator();
        this.optimizer = new Optimizer();
        this.symbolTable = new SymbolTable();
    }

    public String translate(String javaCode) {
        try {
            System.out.println("Parsing Java code...");
            System.out.println("\nTokenizing...");
            List<Token> tokens = parser.tokenize(javaCode);
            System.out.println("Tokens generated: " + tokens.size());
            
            AST ast = parser.parse(javaCode);
            
            System.out.println("Generating assembly...");
            String assembly = generator.generate(ast, symbolTable);
            
            System.out.println("Optimizing assembly...");
            String optimizedAssembly = optimizer.optimize(assembly);
            
            return optimizedAssembly;
        } catch (Exception e) {
            System.err.println("Translation error:");
            e.printStackTrace();
            return "Error during translation: " + e.getMessage();
        }
    }
}

class AST {
    private ASTNode root;

    public AST(ASTNode root) {
        this.root = root;
    }

    public ASTNode getRoot() {
        return root;
    }
}

abstract class ASTNode {
    protected List<ASTNode> children;
    protected String type;
    protected String value;

    public ASTNode(String type, String value) {
        this.type = type;
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}

class BasicASTNode extends ASTNode {
    public BasicASTNode(String type, String value) {
        super(type, value);
    }
}

class VariableDeclarationNode extends ASTNode {
    private String dataType;
    private String identifier;
    private String initialValue;

    public VariableDeclarationNode(String dataType, String identifier, String initialValue) {
        super("VARIABLE_DECLARATION", identifier);
        this.dataType = dataType;
        this.identifier = identifier;
        this.initialValue = initialValue;
    }

    // Add these getter methods
    public String getDataType() {
        return dataType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getInitialValue() {
        return initialValue;
    }

    // Optional: Add setter methods if needed
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setInitialValue(String initialValue) {
        this.initialValue = initialValue;
    }
}

class MethodNode extends ASTNode {
    private String returnType;
    private String methodName;
    private List<String> parameters;

    public MethodNode(String returnType, String methodName) {
        super("METHOD", methodName);
        this.returnType = returnType;
        this.methodName = methodName;
        this.parameters = new ArrayList<>();
    }
}

enum TokenType {
    KEYWORD,
    IDENTIFIER,
    NUMBER,
    OPERATOR,
    SEPARATOR,
    EQUALS,
    SEMICOLON,
    OTHER
}

class Token {
    TokenType type;
    String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }
}

class JavaParser {
    private int currentPosition;
    private List<Token> tokens;

    // Make tokenize method public
    public List<Token> tokenize(String code) {
        List<Token> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(code, " \t\n\r\f(){};=+-*/", true);
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();
            if (!token.isEmpty()) {
                TokenType type = determineTokenType(token);
                tokens.add(new Token(type, token));
            }
        }
        
        return tokens;
    }

    public AST parse(String javaCode) throws Exception {
        tokens = tokenize(javaCode);
        currentPosition = 0;

        // Debug print
        System.out.println("Tokens:");
        for (Token t : tokens) {
            System.out.println(t.type + ": " + t.value);
        }

        ASTNode root = new BasicASTNode("PROGRAM", "root");
        
        while (currentPosition < tokens.size()) {
            Token token = tokens.get(currentPosition);
            
            // Handle variable declarations
            if (token.type == TokenType.KEYWORD && 
                (token.value.equals("int") || token.value.equals("double"))) {
                ASTNode node = parseVariableDeclaration();
                if (node != null) {
                    root.addChild(node);
                }
            } else {
                currentPosition++;
            }
        }

        return new AST(root);
    }

    private ASTNode parseVariableDeclaration() throws Exception {
        String dataType = tokens.get(currentPosition++).value;
        
        if (currentPosition >= tokens.size()) {
            throw new Exception("Unexpected end of input after type");
        }
        
        String identifier = tokens.get(currentPosition++).value;
        String initialValue = null;
        
        // Check for initialization
        if (currentPosition < tokens.size() && tokens.get(currentPosition).type == TokenType.EQUALS) {
            currentPosition++; // Skip equals
            if (currentPosition >= tokens.size()) {
                throw new Exception("Unexpected end of input after equals sign");
            }
            
            // Handle expression
            StringBuilder valueBuilder = new StringBuilder();
            while (currentPosition < tokens.size() && 
                   tokens.get(currentPosition).type != TokenType.SEMICOLON) {
                valueBuilder.append(tokens.get(currentPosition++).value);
            }
            initialValue = valueBuilder.toString();
        }
        
        // Skip semicolon
        if (currentPosition < tokens.size() && tokens.get(currentPosition).type == TokenType.SEMICOLON) {
            currentPosition++;
        }
        
        return new VariableDeclarationNode(dataType, identifier, initialValue);
    }

    private TokenType determineTokenType(String token) {
        if (token.matches("\\d+")) return TokenType.NUMBER;
        if (isKeyword(token)) return TokenType.KEYWORD;
        if (token.matches("[a-zA-Z][a-zA-Z0-9]*")) return TokenType.IDENTIFIER;
        if (token.equals("=")) return TokenType.EQUALS;
        if (token.equals(";")) return TokenType.SEMICOLON;
        if (token.equals("+") || token.equals("-") || 
            token.equals("*") || token.equals("/")) return TokenType.OPERATOR;
        if (token.equals("{") || token.equals("}")) return TokenType.SEPARATOR;
        return TokenType.OTHER;
    }

    private boolean isKeyword(String token) {
        String[] keywords = {"public", "class", "static", "void", "main", "int", "double", "return"};
        return Arrays.asList(keywords).contains(token);
    }

    private ASTNode parseAssignment() throws Exception {
        String identifier = tokens.get(currentPosition++).value;
        
        if (currentPosition >= tokens.size() || tokens.get(currentPosition).type != TokenType.EQUALS) {
            throw new Exception("Expected '=' after identifier in assignment");
        }
        
        currentPosition++; // Skip equals sign
        
        if (currentPosition >= tokens.size()) {
            throw new Exception("Unexpected end of input after equals sign");
        }
        
        StringBuilder expression = new StringBuilder();
        
        // Parse the right-hand side of the assignment
        while (currentPosition < tokens.size() && 
               tokens.get(currentPosition).type != TokenType.SEMICOLON) {
            expression.append(tokens.get(currentPosition++).value);
        }
        
        // Skip semicolon if present
        if (currentPosition < tokens.size() && tokens.get(currentPosition).type == TokenType.SEMICOLON) {
            currentPosition++;
        }
        
        return new AssignmentNode(identifier, expression.toString());
    }

    // AssignmentNode inner class
    public static class AssignmentNode extends ASTNode {
        private String identifier;
        private String expression;

        public AssignmentNode(String identifier, String expression) {
            super("ASSIGNMENT", identifier);
            this.identifier = identifier;
            this.expression = expression;
        }

        public String getExpression() {
            return expression;
        }
    }
}

class AssemblyGenerator {
    private StringBuilder assembly;
    private SymbolTable symbolTable;

    public String generate(AST ast, SymbolTable symbolTable) {
        this.assembly = new StringBuilder();
        this.symbolTable = symbolTable;

        generateHeader();
        generateCode(ast.getRoot());
        generateFooter();
        
        return assembly.toString();
    }

    // Add the missing generateCode method
    private void generateCode(ASTNode node) {
        if (node == null) return;

        switch (node.getType()) {
            case "VARIABLE_DECLARATION":
                generateVariableDeclaration((VariableDeclarationNode)node);
                break;
            case "METHOD":
                generateMethod((MethodNode)node);
                break;
            case "ASSIGNMENT":
                generateAssignment((JavaParser.AssignmentNode)node);
                break;
            default:
                // Handle unknown node types
                System.out.println("Unknown node type: " + node.getType());
        }

        // Process all child nodes
        for (ASTNode child : node.getChildren()) {
            generateCode(child);
        }
    }

    private void generateHeader() {
        assembly.append("section .data\n");
    }

    private void generateFooter() {
        assembly.append("\nsection .text\n");
        assembly.append("global _start\n");
        assembly.append("_start:\n");
        assembly.append("    mov eax, 1\n");
        assembly.append("    mov ebx, 0\n");
        assembly.append("    int 0x80\n");
    }

    private void generateVariableDeclaration(VariableDeclarationNode node) {
        String value = node.getInitialValue() != null ? node.getInitialValue() : "0";
        assembly.append(String.format("    %s: dd %s\n", node.getIdentifier(), value));
    }

    private void generateMethod(MethodNode node) {
        assembly.append(String.format("%s:\n", node.getValue()));
        assembly.append("    push ebp\n");
        assembly.append("    mov ebp, esp\n");
        assembly.append("    mov esp, ebp\n");
        assembly.append("    pop ebp\n");
        assembly.append("    ret\n");
    }

    private void generateAssignment(JavaParser.AssignmentNode node) {
        assembly.append(String.format("    mov eax, %s\n", node.getExpression()));
        assembly.append(String.format("    mov [%s], eax\n", node.getValue()));
    }
}

class Optimizer {
    public String optimize(String assembly) {
        String optimized = assembly;
        
        optimized = removeRedundantMoves(optimized);
        optimized = optimizeArithmetic(optimized);
        optimized = peepholeOptimization(optimized);
        
        return optimized;
    }

    private String removeRedundantMoves(String assembly) {
        // Remove unnecessary move instructions
        String[] lines = assembly.split("\n");
        StringBuilder optimized = new StringBuilder();
        
        for (int i = 0; i < lines.length; i++) {
            if (i < lines.length - 1 && 
                lines[i].contains("mov") && 
                lines[i+1].contains("mov")) {
                // Check for redundant moves
                if (!areMovesRedundant(lines[i], lines[i+1])) {
                    optimized.append(lines[i]).append("\n");
                }
            } else {
                optimized.append(lines[i]).append("\n");
            }
        }
        
        return optimized.toString();
    }

    private boolean areMovesRedundant(String move1, String move2) {
        // Implementation to check if two move instructions are redundant
        return false;
    }

    private String optimizeArithmetic(String assembly) {
        // Optimize arithmetic operations
        return assembly;
    }

    private String peepholeOptimization(String assembly) {
        // Perform peephole optimization
        return assembly;
    }
}

class SymbolTable {
    private Map<String, SymbolInfo> symbols;
    private int currentScope;

    public SymbolTable() {
        this.symbols = new HashMap<>();
        this.currentScope = 0;
    }

    public void addSymbol(String name, String type, int scope) {
        symbols.put(name + "@" + scope, new SymbolInfo(type, scope));
    }

    public SymbolInfo lookupSymbol(String name) {
        for (int i = currentScope; i >= 0; i--) {
            SymbolInfo info = symbols.get(name + "@" + i);
            if (info != null) {
                return info;
            }
        }
        return null;
    }
}

class SymbolInfo {
    String type;
    int scope;

    public SymbolInfo(String type, int scope) {
        this.type = type;
        this.scope = scope;
    }
    
}
