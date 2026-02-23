class FactorialProgram {
    int number = 5;   // Constant value (can be changed if needed)

    // Member function
    // This function calculates the factorial of the member variable 'number'
    // It returns the computed factorial value
    int calculateFactorial() {
        int factorial = 1;

        // Loop from 1 to 'number' to compute factorial
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        // Returning the calculated factorial value
        return factorial;
    }

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Creating an object of the class to access member variable and member function
        FactorialProgram obj = new FactorialProgram();

        // Calling the member function
        int result = obj.calculateFactorial();

        // Displaying the result
        System.out.println("Factorial of " + obj.number + " is: " + result);
    }
}