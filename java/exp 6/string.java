public static void main(String[] args) {
    String s1 = "Hello World";
    
    // Convert to lowercase
    System.out.println("Lowercase: " + s1.toLowerCase());
    
    // Convert to uppercase
    System.out.println("Uppercase: " + s1.toUpperCase());
    
    // Replace characters
    System.out.println("Replace: " + s1.replace("World", "Java"));
    
    // Get length
    System.out.println("Length: " + s1.length());
    
    // Get substring
    System.out.println("Substring: " + s1.substring(0, 5));
    
    // Check if contains
    System.out.println("Contains 'World': " + s1.contains("World"));
    
    // Get character at index
    System.out.println("Char at 0: " + s1.charAt(0));
    
    // Find index
    System.out.println("Index of 'World': " + s1.indexOf("World"));
    
    // Trim whitespace
    String s2 = "  Hello  ";
    System.out.println("Trim: '" + s2.trim() + "'");
    
    // Split string
    String[] words = s1.split(" ");
    System.out.println("Split: " + java.util.Arrays.toString(words));
}